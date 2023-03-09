package net.jeeshop.services.front.emailNotifyProduct.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.emailNotifyProduct.EmailNotifyProductService;
import net.jeeshop.services.front.emailNotifyProduct.bean.EmailNotifyProduct;
import net.jeeshop.services.front.emailNotifyProduct.dao.EmailNotifyProductDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("emailNotifyProductServiceFront")
public class EmailNotifyProductServiceImpl extends
		ServersManager<EmailNotifyProduct, EmailNotifyProductDao> implements EmailNotifyProductService {

    @Resource(name = "emailNotifyProductDaoFront")
    @Override
    public void setDao(EmailNotifyProductDao emailNotifyProductDao) {
        this.dao = emailNotifyProductDao;
    }

    @Override
	public int selectCount(EmailNotifyProduct ep) {
		return dao.selectCount(ep);
	}
}
