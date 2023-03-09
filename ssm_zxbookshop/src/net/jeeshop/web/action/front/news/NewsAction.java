package net.jeeshop.web.action.front.news;

import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.core.front.SystemManager;
import net.jeeshop.services.front.catalog.bean.Catalog;
import net.jeeshop.services.front.news.NewsService;
import net.jeeshop.services.front.news.bean.News;
import net.jeeshop.web.action.front.FrontBaseController;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 文章管理
 * 
 * @author huangf
 * 
 */
@Controller("frontNewsAction")
public class NewsAction extends FrontBaseController<News> {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory
			.getLogger(NewsAction.class);
	@Autowired
	private NewsService newsService;

	@Override
	public NewsService getService() {
		return newsService;
	}

	@ModelAttribute("newsCatalogs")
	public List<Catalog> getNewsCatalogs(){
		return SystemManager.getInstance().getNewsCatalogs();
	}
	@RequestMapping("news/list")
	public String newsList(ModelMap model, News e) throws Exception{
		PagerModel pager = selectPageList(getService(), e);
		pager.setPagerUrl("list");
		model.addAttribute("pager", pager);
		return "newsList";
	}

	/**
	 * 获取新闻详情
	 * @return
	 */
	@RequestMapping("/news/{id}")
	public String newsInfo(@PathVariable("id")String id, ModelMap model) throws Exception{
		logger.error("NewsAction.newsInfo=== id="+id);
		if(StringUtils.isBlank(id)){
			throw new NullPointerException("id is null");
		}
		
//		e = newsService.selectById(id);
		
		News news =newsService.selectById(id);
		if(news==null){
			throw new NullPointerException();
		}
		
		String url = "/jsp/notices/"+news.getId()+".jsp";
		logger.error("url = " + url);
		model.addAttribute("newsInfoUrl", url);
		model.addAttribute("news", news);
		return "newsInfo";
	}
	
	/**
	 * 帮助中心
	 * @return
	 */
	@RequestMapping("help/{helpCode}")
	public String help(@ModelAttribute("helpCode") @PathVariable("helpCode")String helpCode, ModelMap model) throws Exception {
		
		logger.error("this.helpCode="+helpCode);
		if(StringUtils.isBlank(helpCode)){
			return "help";
		}else if(helpCode.equals("index")){
			return "help";
		}else{
			News newsParam = new News();
			newsParam.setCode(helpCode);
			News news = newsService.selectSimpleOne(newsParam);
			if(news==null){
				throw new NullPointerException("根据code查询不到文章！");
			}
			
			String url = "/jsp/helps/"+news.getId()+".jsp";
			logger.error("url = " + url);
			model.addAttribute("newsInfoUrl", url);
			model.addAttribute("news", news);
			return "help";
		}
	}
}
