package net.jeeshop.services.front.attribute_link;

import net.jeeshop.core.Services;
import net.jeeshop.services.front.attribute_link.bean.Attribute_link;

public interface Attribute_linkService extends Services<Attribute_link> {

	/**
	 * @param oldAttr
	 */
	int deleteByCondition(Attribute_link oldAttr);
}
