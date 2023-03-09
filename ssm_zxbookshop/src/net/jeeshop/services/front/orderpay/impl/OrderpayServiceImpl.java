package net.jeeshop.services.front.orderpay.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.orderpay.OrderpayService;
import net.jeeshop.services.front.orderpay.bean.Orderpay;
import net.jeeshop.services.front.orderpay.dao.OrderpayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderpayServiceImpl extends ServersManager<Orderpay, OrderpayDao> implements
		OrderpayService {
    @Autowired
    @Qualifier("orderpayDaoImpl")
    @Override
    public void setDao(OrderpayDao orderpayDao) {
        this.dao = orderpayDao;
    }
}
