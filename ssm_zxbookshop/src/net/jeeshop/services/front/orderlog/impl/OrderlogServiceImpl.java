package net.jeeshop.services.front.orderlog.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.orderlog.OrderlogService;
import net.jeeshop.services.front.orderlog.bean.Orderlog;
import net.jeeshop.services.front.orderlog.dao.OrderlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderlogServiceImpl extends ServersManager<Orderlog, OrderlogDao> implements
		OrderlogService {
    @Autowired
    @Qualifier("orderlogDaoImpl")
    @Override
    public void setDao(OrderlogDao orderlogDao) {
        this.dao = orderlogDao;
    }
}
