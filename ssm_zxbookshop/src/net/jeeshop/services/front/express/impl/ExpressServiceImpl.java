package net.jeeshop.services.front.express.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.express.ExpressService;
import net.jeeshop.services.front.express.bean.Express;
import net.jeeshop.services.front.express.dao.ExpressDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("expressServiceFront")
public class ExpressServiceImpl extends ServersManager<Express, ExpressDao> implements
		ExpressService {
    @Resource(name = "expressDaoFront")
    @Override
    public void setDao(ExpressDao expressDao) {
        this.dao = expressDao;
    }
}
