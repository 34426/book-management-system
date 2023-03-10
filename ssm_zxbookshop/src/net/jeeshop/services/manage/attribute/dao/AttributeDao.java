package net.jeeshop.services.manage.attribute.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.manage.attribute.bean.Attribute;

public interface AttributeDao extends DaoManager<Attribute> {

	/**
	 * @param e
	 */
	void deleteByPid(int pid);

	/**
	 * @param id
	 */
	void deleteAllById(int id);

	int selectCount(Attribute ee);
}
