package net.jeeshop.services.front.orderlog.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.orderlog.bean.Orderlog;

public interface OrderlogDao extends DaoManager<Orderlog> {

	int selectCount(Orderlog orderlog);
}
