package net.jeeshop.services.manage.catalog.dao;

import java.util.List;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.manage.catalog.bean.Catalog;


public interface CatalogDao extends DaoManager<Catalog> {

	/**
	 * @param string
	 */
	void deletes(List<String> list);

}
