package net.jeeshop.services.manage.attribute_link.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.attribute_link.Attribute_linkService;
import net.jeeshop.services.manage.attribute_link.bean.Attribute_link;
import net.jeeshop.services.manage.attribute_link.dao.Attribute_linkDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("attribute_linkServiceManage")
public class Attribute_linkServiceImpl extends ServersManager<Attribute_link, Attribute_linkDao>
		implements Attribute_linkService {
    @Resource(name = "attribute_linkDaoManage")
    @Override
    public void setDao(Attribute_linkDao attribute_linkDao) {
        this.dao = attribute_linkDao;
    }

    @Override
	public int deleteByCondition(Attribute_link e) {
		return dao.deleteByCondition(e);
	}
}
