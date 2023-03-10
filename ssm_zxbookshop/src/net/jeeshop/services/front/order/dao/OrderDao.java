package net.jeeshop.services.front.order.dao;

import java.util.List;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.order.bean.Order;
import net.jeeshop.services.front.order.bean.OrderSimpleReport;


public interface OrderDao extends DaoManager<Order> {

	List<Order> selectOrderInfo(Order order);

	OrderSimpleReport selectOrdersSimpleReport(String account);
}
