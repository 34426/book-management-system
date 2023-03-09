package net.jeeshop.services.manage.sms.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.sms.SmsService;
import net.jeeshop.services.manage.sms.bean.Sms;
import net.jeeshop.services.manage.sms.dao.SmsDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("smsServiceManage")
public class SmsServiceImpl extends ServersManager<Sms, SmsDao> implements SmsService {

    @Resource(name = "smsDaoManage")
    @Override
    public void setDao(SmsDao smsDao) {
        this.dao = smsDao;
    }
}
