package net.jeeshop.services.manage.attribute;

import net.jeeshop.core.Services;
import net.jeeshop.services.manage.attribute.bean.Attribute;

public interface AttributeService extends Services<Attribute> {

	int selectCount(Attribute ee);
}
