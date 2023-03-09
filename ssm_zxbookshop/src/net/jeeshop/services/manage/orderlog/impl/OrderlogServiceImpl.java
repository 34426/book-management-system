package net.jeeshop.services.manage.orderlog.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.orderlog.OrderlogService;
import net.jeeshop.services.manage.orderlog.bean.Orderlog;
import net.jeeshop.services.manage.orderlog.dao.OrderlogDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("orderlogServiceManage")
public class OrderlogServiceImpl extends ServersManager<Orderlog, OrderlogDao> implements
		OrderlogService {

    @Resource(name = "orderlogDaoManage")
    @Override
    public void setDao(OrderlogDao orderlogDao) {
        this.dao = orderlogDao;
    }
}
