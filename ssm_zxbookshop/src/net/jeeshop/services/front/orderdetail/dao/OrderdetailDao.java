package net.jeeshop.services.front.orderdetail.dao;
import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.orderdetail.bean.Orderdetail;
public interface OrderdetailDao extends DaoManager<Orderdetail> {

	int selectCount(String orderID);
}
