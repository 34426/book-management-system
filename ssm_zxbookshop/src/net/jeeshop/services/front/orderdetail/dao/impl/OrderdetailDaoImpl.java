package net.jeeshop.services.front.orderdetail.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.order.bean.Order;
import net.jeeshop.services.front.orderdetail.bean.Orderdetail;
import net.jeeshop.services.front.orderdetail.dao.OrderdetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("orderdetailDaoFront")
public class OrderdetailDaoImpl implements OrderdetailDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Orderdetail e) {
		return dao.selectPageList("front.orderdetail.selectPageList",
				"front.orderdetail.selectPageCount", e);
	}

	public List selectList(Orderdetail e) {
		return dao.selectList("front.orderdetail.selectList", e);
	}

	public Orderdetail selectOne(Orderdetail e) {
		return (Orderdetail) dao.selectOne("front.orderdetail.selectOne", e);
	}

	public int delete(Orderdetail e) {
		return dao.delete("front.orderdetail.delete", e);
	}

	public int update(Orderdetail e) {
		return dao.update("front.orderdetail.update", e);
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
		return dao.insert("front.orderdetail.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.orderdetail.deleteById", id);
	}
	
	public Orderdetail selectById(String id) {
		return (Orderdetail) dao.selectOne("front.orderdetail.selectById", id);
	}

	@Override
	public int selectCount(String orderID) {
		return (Integer) dao.selectOne("front.orderdetail.selectCount",orderID);
	}
}
