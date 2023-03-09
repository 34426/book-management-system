package net.jeeshop.services.front.pay.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.pay.PayService;
import net.jeeshop.services.front.pay.bean.Pay;
import net.jeeshop.services.front.pay.dao.PayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl extends ServersManager<Pay, PayDao> implements PayService {
    @Autowired
    @Qualifier("payDaoImpl")
    @Override
    public void setDao(PayDao payDao) {
        this.dao = payDao;
    }
}
