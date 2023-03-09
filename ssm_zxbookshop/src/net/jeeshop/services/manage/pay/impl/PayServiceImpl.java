package net.jeeshop.services.manage.pay.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.pay.PayService;
import net.jeeshop.services.manage.pay.bean.Pay;
import net.jeeshop.services.manage.pay.dao.PayDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("payServiceManage")
public class PayServiceImpl extends ServersManager<Pay, PayDao> implements PayService {
    @Resource(name = "payDaoManage")
    @Override
    public void setDao(PayDao payDao) {
        this.dao = payDao;
    }
}
