package net.jeeshop.services.manage.orderdetail.dao;

import java.util.List;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.manage.orderdetail.bean.Orderdetail;
import net.jeeshop.web.action.manage.report.ReportInfo;


public interface OrderdetailDao extends DaoManager<Orderdetail> {

	List<ReportInfo> reportProductSales(Orderdetail orderdetail);
}
