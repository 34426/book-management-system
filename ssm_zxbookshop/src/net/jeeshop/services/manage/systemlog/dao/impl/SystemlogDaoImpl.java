package net.jeeshop.services.manage.systemlog.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.systemlog.bean.Systemlog;
import net.jeeshop.services.manage.systemlog.dao.SystemlogDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("systemlogDaoManage")
public class SystemlogDaoImpl implements SystemlogDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Systemlog e) {
		return dao.selectPageList("manage.systemlog.selectPageList",
				"manage.systemlog.selectPageCount", e);
	}

	public List selectList(Systemlog e) {
		return dao.selectList("manage.systemlog.selectList", e);
	}

	public Systemlog selectOne(Systemlog e) {
		return (Systemlog) dao.selectOne("manage.systemlog.selectOne", e);
	}

	public int delete(Systemlog e) {
		return dao.delete("manage.systemlog.delete", e);
	}

	public int update(Systemlog e) {
		return dao.update("manage.systemlog.update", e);
	}

	public int deletes(String[] ids) {
		Systemlog e = new Systemlog();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Systemlog e) {
		return dao.insert("manage.systemlog.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.systemlog.deleteById", id);
	}

	@Override
	public Systemlog selectById(String id) {
		return null;
	}

	@Override
	public Systemlog selectFirstOne(String account) {
		return (Systemlog) dao.selectOne("manage.systemlog.selectFirstOne", account);
	}
}
