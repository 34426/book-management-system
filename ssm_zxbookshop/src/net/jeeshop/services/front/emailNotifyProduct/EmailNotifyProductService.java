package net.jeeshop.services.front.emailNotifyProduct;

import net.jeeshop.core.Services;
import net.jeeshop.services.front.emailNotifyProduct.bean.EmailNotifyProduct;

public interface EmailNotifyProductService extends Services<EmailNotifyProduct> {

	int selectCount(EmailNotifyProduct ep);
}
