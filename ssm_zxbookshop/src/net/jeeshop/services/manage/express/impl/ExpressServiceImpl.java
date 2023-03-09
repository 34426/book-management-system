package net.jeeshop.services.manage.express.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.express.ExpressService;
import net.jeeshop.services.manage.express.bean.Express;
import net.jeeshop.services.manage.express.dao.ExpressDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("expressServiceManage")
public class ExpressServiceImpl extends ServersManager<Express, ExpressDao> implements
		ExpressService {
    @Resource(name = "expressDaoManage")
    @Override
    public void setDao(ExpressDao expressDao) {
        this.dao = expressDao;
    }
}
