/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package net.jeeshop.services.front.indexImg.impl;

import java.util.List;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.indexImg.IndexImgService;
import net.jeeshop.services.front.indexImg.bean.IndexImg;
import net.jeeshop.services.front.indexImg.dao.IndexImgDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author huangf
 */
@Service("indexImgServiceFront")
public class IndexImgServiceImpl extends ServersManager<IndexImg, IndexImgDao> implements
		IndexImgService {

    @Resource(name = "indexImgDaoFront")
    @Override
    public void setDao(IndexImgDao indexImgDao) {
        this.dao = indexImgDao;
    }

	@Override
	public List<IndexImg> getImgsShowToIndex(int i) {
		return dao.getImgsShowToIndex(i);
	}

}
