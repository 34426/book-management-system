package net.jeeshop.services.manage.emailNotifyProduct.dao.impl;

import java.util.List;
import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.emailNotifyProduct.bean.EmailNotifyProduct;
import net.jeeshop.services.manage.emailNotifyProduct.dao.EmailNotifyProductDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("emailNotifyProductDaoManage")
public class EmailNotifyProductDaoImpl implements EmailNotifyProductDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(EmailNotifyProduct e) {
		return dao.selectPageList("manage.emailNotifyProduct.selectPageList",
				"manage.emailNotifyProduct.selectPageCount", e);
	}

	public List selectList(EmailNotifyProduct e) {
		return dao.selectList("manage.emailNotifyProduct.selectList", e);
	}

	public EmailNotifyProduct selectOne(EmailNotifyProduct e) {
		return (EmailNotifyProduct) dao.selectOne(
				"manage.emailNotifyProduct.selectOne", e);
	}

	public int delete(EmailNotifyProduct e) {
		return dao.delete("manage.emailNotifyProduct.delete", e);
	}

	public int update(EmailNotifyProduct e) {
		return dao.update("manage.emailNotifyProduct.update", e);
	}

	public int deletes(String[] ids) {
		EmailNotifyProduct e = new EmailNotifyProduct();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(EmailNotifyProduct e) {
		return dao.insert("manage.emailNotifyProduct.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.emailNotifyProduct.deleteById", id);
	}

	@Override
	public EmailNotifyProduct selectById(String id) {
		return (EmailNotifyProduct) dao.selectOne(
				"manage.emailNotifyProduct.selectById", id);
	}
}
