package net.jeeshop.services.front.attribute.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.attribute.bean.Attribute;

public interface AttributeDao extends DaoManager<Attribute> {

	/**
	 * @param e
	 */
	void deleteByPid(Attribute e);
}
