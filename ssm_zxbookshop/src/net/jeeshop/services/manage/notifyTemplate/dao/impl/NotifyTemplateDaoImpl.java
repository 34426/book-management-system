package net.jeeshop.services.manage.notifyTemplate.dao.impl;

import java.util.List;
import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.notifyTemplate.bean.NotifyTemplate;
import net.jeeshop.services.manage.notifyTemplate.dao.NotifyTemplateDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("notifyTemplateDaoManage")
public class NotifyTemplateDaoImpl implements NotifyTemplateDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(NotifyTemplate e) {
		return dao.selectPageList("manage.notifyTemplate.selectPageList",
				"manage.notifyTemplate.selectPageCount", e);
	}

	public List selectList(NotifyTemplate e) {
		return dao.selectList("manage.notifyTemplate.selectList", e);
	}

	public NotifyTemplate selectOne(NotifyTemplate e) {
		return (NotifyTemplate) dao.selectOne("manage.notifyTemplate.selectOne", e);
	}

	public int delete(NotifyTemplate e) {
		return dao.delete("manage.notifyTemplate.delete", e);
	}

	public int update(NotifyTemplate e) {
		return dao.update("manage.notifyTemplate.update", e);
	}

	public int deletes(String[] ids) {
		NotifyTemplate e = new NotifyTemplate();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(NotifyTemplate e) {
		return dao.insert("manage.notifyTemplate.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.notifyTemplate.deleteById", id);
	}

	@Override
	public NotifyTemplate selectById(String id) {
		return (NotifyTemplate) dao.selectOne("manage.notifyTemplate.selectById",id);
	}
}
