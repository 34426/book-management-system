package net.jeeshop.services.manage.area.dao;

import java.util.List;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.manage.area.bean.Area;


public interface AreaDao extends DaoManager<Area> {

	void deleteAll();

	List<Area> selectListByPcode(String pcode);

	int getCount(Area area);
}
