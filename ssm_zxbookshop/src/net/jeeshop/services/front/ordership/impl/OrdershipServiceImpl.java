package net.jeeshop.services.front.ordership.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.ordership.OrdershipService;
import net.jeeshop.services.front.ordership.bean.Ordership;
import net.jeeshop.services.front.ordership.dao.OrdershipDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrdershipServiceImpl extends ServersManager<Ordership, OrdershipDao> implements
		OrdershipService {
    @Autowired
    @Qualifier("ordershipDaoImpl")
    @Override
    public void setDao(OrdershipDao ordershipDao) {
        this.dao = ordershipDao;
    }
}
