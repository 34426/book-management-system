package net.jeeshop.services.manage.orderlog.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.orderlog.bean.Orderlog;
import net.jeeshop.services.manage.orderlog.dao.OrderlogDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("orderlogDaoManage")
public class OrderlogDaoImpl implements OrderlogDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Orderlog e) {
		return dao.selectPageList("manage.orderlog.selectPageList",
				"manage.orderlog.selectPageCount", e);
	}

	public List selectList(Orderlog e) {
		return dao.selectList("manage.orderlog.selectList", e);
	}

	public Orderlog selectOne(Orderlog e) {
		return (Orderlog) dao.selectOne("manage.orderlog.selectOne", e);
	}

	public int delete(Orderlog e) {
		return dao.delete("manage.orderlog.delete", e);
	}

	public int update(Orderlog e) {
		return dao.update("manage.orderlog.update", e);
	}

	public int deletes(String[] ids) {
		Orderlog e = new Orderlog();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Orderlog e) {
		return dao.insert("manage.orderlog.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.orderlog.deleteById", id);
	}

	@Override
	public Orderlog selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
