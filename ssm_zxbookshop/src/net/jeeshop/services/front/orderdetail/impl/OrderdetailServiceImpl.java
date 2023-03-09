package net.jeeshop.services.front.orderdetail.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.orderdetail.OrderdetailService;
import net.jeeshop.services.front.orderdetail.bean.Orderdetail;
import net.jeeshop.services.front.orderdetail.dao.OrderdetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderdetailServiceImpl extends ServersManager<Orderdetail, OrderdetailDao> implements OrderdetailService {
    @Autowired
    @Qualifier("orderdetailDaoFront")
    @Override
    public void setDao(OrderdetailDao orderdetailDao) {
        this.dao = orderdetailDao;
    }
}
