package net.jeeshop.services.front.emailNotifyProduct.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.emailNotifyProduct.bean.EmailNotifyProduct;

public interface EmailNotifyProductDao extends DaoManager<EmailNotifyProduct> {

	int selectCount(EmailNotifyProduct ep);
}
