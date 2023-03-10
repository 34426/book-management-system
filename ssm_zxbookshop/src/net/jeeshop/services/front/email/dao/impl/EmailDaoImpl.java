package net.jeeshop.services.front.email.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.email.bean.Email;
import net.jeeshop.services.front.email.dao.EmailDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("emailDaoFront")
public class EmailDaoImpl implements EmailDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Email e) {
		return dao.selectPageList("front.email.selectPageList",
				"front.email.selectPageCount", e);
	}

	public List selectList(Email e) {
		return dao.selectList("front.email.selectList", e);
	}

	public Email selectOne(Email e) {
		return (Email) dao.selectOne("front.email.selectOne", e);
	}

	public int delete(Email e) {
		return dao.delete("front.email.delete", e);
	}

	public int update(Email e) {
		return dao.update("front.email.update", e);
	}

	public int deletes(String[] ids) {
		Email e = new Email();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Email e) {
		return dao.insert("front.email.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.email.deleteById", id);
	}

	@Override
	public Email selectById(String id) {
		return (Email) dao.selectOne("front.email.selectById", id);
	}

	@Override
	public void updateEmailInvalidWhenReg(Email email) {
		dao.update("front.email.updateEmailInvalidWhenReg",email);
	}
}
