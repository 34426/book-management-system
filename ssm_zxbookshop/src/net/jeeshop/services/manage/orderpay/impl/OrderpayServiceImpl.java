package net.jeeshop.services.manage.orderpay.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.orderpay.OrderpayService;
import net.jeeshop.services.manage.orderpay.bean.Orderpay;
import net.jeeshop.services.manage.orderpay.dao.OrderpayDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("orderpayServiceManage")
public class OrderpayServiceImpl extends ServersManager<Orderpay, OrderpayDao> implements
		OrderpayService {
    @Resource(name = "orderpayDaoManage")
    @Override
    public void setDao(OrderpayDao orderpayDao) {
        this.dao = orderpayDao;
    }
}
