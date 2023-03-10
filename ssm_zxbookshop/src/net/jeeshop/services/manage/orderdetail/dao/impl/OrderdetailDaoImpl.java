package net.jeeshop.services.manage.orderdetail.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.order.bean.Order;
import net.jeeshop.services.manage.orderdetail.bean.Orderdetail;
import net.jeeshop.services.manage.orderdetail.dao.OrderdetailDao;
import net.jeeshop.web.action.manage.report.ReportInfo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("orderdetailDaoManage")
public class OrderdetailDaoImpl implements OrderdetailDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Orderdetail e) {
		return dao.selectPageList("manage.orderdetail.selectPageList",
				"manage.orderdetail.selectPageCount", e);
	}

	public List selectList(Orderdetail e) {
		return dao.selectList("manage.orderdetail.selectList", e);
	}

	public Orderdetail selectOne(Orderdetail e) {
		return (Orderdetail) dao.selectOne("manage.orderdetail.selectOne", e);
	}

	public int delete(Orderdetail e) {
		return dao.delete("manage.orderdetail.delete", e);
	}

	public int update(Orderdetail e) {
		return dao.update("manage.orderdetail.update", e);
	}

	public int deletes(String[] ids) {
		Orderdetail e = new Orderdetail();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Orderdetail e) {
		return dao.insert("manage.orderdetail.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.orderdetail.deleteById", id);
	}

	public Orderdetail selectById(String id) {
		return (Orderdetail) dao.selectOne(id);
	}

	@Override
	public List<ReportInfo> reportProductSales(Orderdetail orderdetail) {
		return dao.selectList("manage.orderdetail.reportProductSales", orderdetail);
	}
}
