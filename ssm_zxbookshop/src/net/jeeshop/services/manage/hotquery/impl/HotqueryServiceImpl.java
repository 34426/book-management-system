package net.jeeshop.services.manage.hotquery.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.hotquery.HotqueryService;
import net.jeeshop.services.manage.hotquery.bean.Hotquery;
import net.jeeshop.services.manage.hotquery.dao.HotqueryDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("hotqueryServiceManage")
public class HotqueryServiceImpl extends ServersManager<Hotquery, HotqueryDao> implements
		HotqueryService {
    @Resource(name = "hotqueryDaoManage")
    @Override
    public void setDao(HotqueryDao hotqueryDao) {
        this.dao = hotqueryDao;
    }
}
