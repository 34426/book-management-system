package net.jeeshop.services.manage.sms.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.sms.bean.Sms;
import net.jeeshop.services.manage.sms.dao.SmsDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("smsDaoManage")
public class SmsDaoImpl implements SmsDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Sms e) {
		return dao.selectPageList("manage.sms.selectPageList", "manage.sms.selectPageCount",
				e);
	}

	public List selectList(Sms e) {
		return dao.selectList("manage.sms.selectList", e);
	}

	public Sms selectOne(Sms e) {
		return (Sms) dao.selectOne("manage.sms.selectOne", e);
	}

	public int delete(Sms e) {
		return dao.delete("manage.sms.delete", e);
	}

	public int update(Sms e) {
		return dao.update("manage.sms.update", e);
	}

	public int deletes(String[] ids) {
		Sms e = new Sms();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Sms e) {
		return dao.insert("manage.sms.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.sms.deleteById", id);
	}

	@Override
	public Sms selectById(String id) {
		return (Sms) dao.selectOne("manage.sms.selectById",id);
	}
}
