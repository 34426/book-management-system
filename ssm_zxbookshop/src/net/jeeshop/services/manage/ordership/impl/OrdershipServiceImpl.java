package net.jeeshop.services.manage.ordership.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.ordership.OrdershipService;
import net.jeeshop.services.manage.ordership.bean.Ordership;
import net.jeeshop.services.manage.ordership.dao.OrdershipDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ordershipServiceManage")
public class OrdershipServiceImpl extends ServersManager<Ordership, OrdershipDao> implements
		OrdershipService {
    @Resource(name = "ordershipDaoManage")
    @Override
    public void setDao(OrdershipDao ordershipDao) {
        this.dao = ordershipDao;
    }
}
