package net.jeeshop.services.front.email.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.email.EmailService;
import net.jeeshop.services.front.email.bean.Email;
import net.jeeshop.services.front.email.dao.EmailDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("emailServiceFront")
public class EmailServiceImpl extends ServersManager<Email, EmailDao> implements
		EmailService {

    @Resource(name = "emailDaoFront")
    @Override
    public void setDao(EmailDao emailDao) {
        this.dao = emailDao;
    }

    @Override
	public void updateEmailInvalidWhenReg(Email email) {
		dao.updateEmailInvalidWhenReg(email);
	}
}
