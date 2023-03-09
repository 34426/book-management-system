package net.jeeshop.services.manage.orderdetail.impl;

import java.util.List;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.order.bean.Order;
import net.jeeshop.services.manage.orderdetail.OrderdetailService;
import net.jeeshop.services.manage.orderdetail.bean.Orderdetail;
import net.jeeshop.services.manage.orderdetail.dao.OrderdetailDao;
import net.jeeshop.web.action.manage.report.ReportInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("orderdetailServiceManage")
public class OrderdetailServiceImpl extends ServersManager<Orderdetail, OrderdetailDao>
		implements OrderdetailService {

    @Resource(name = "orderdetailDaoManage")
    @Override
    public void setDao(OrderdetailDao orderdetailDao) {
        this.dao = orderdetailDao;
    }

	@Override
	public List<ReportInfo> reportProductSales(Orderdetail orderdetail) {
		return dao.reportProductSales(orderdetail);
	}
}
