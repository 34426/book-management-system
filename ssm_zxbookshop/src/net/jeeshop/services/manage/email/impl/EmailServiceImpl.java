package net.jeeshop.services.manage.email.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.email.EmailService;
import net.jeeshop.services.manage.email.bean.Email;
import net.jeeshop.services.manage.email.dao.EmailDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("emailServiceManage")
public class EmailServiceImpl extends ServersManager<Email,EmailDao> implements
		EmailService {

    @Resource(name = "emailDaoManage")
    @Override
    public void setDao(EmailDao emailDao) {
        this.dao = emailDao;
    }
}
