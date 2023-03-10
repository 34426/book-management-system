package net.jeeshop.services.manage.spec.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.spec.bean.Spec;
import net.jeeshop.services.manage.spec.dao.SpecDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("specDaoManage")
public class SpecDaoImpl implements SpecDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Spec e) {
		return dao.selectPageList("manage.spec.selectPageList",
				"manage.spec.selectPageCount", e);
	}

	public List selectList(Spec e) {
		return dao.selectList("manage.spec.selectList", e);
	}

	public Spec selectOne(Spec e) {
		return (Spec) dao.selectOne("manage.spec.selectOne", e);
	}

	public int delete(Spec e) {
		return dao.delete("manage.spec.delete", e);
	}

	public int update(Spec e) {
		return dao.update("manage.spec.update", e);
	}

	public int deletes(String[] ids) {
		Spec e = new Spec();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Spec e) {
		return dao.insert("manage.spec.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.spec.deleteById", id);
	}

	@Override
	public Spec selectById(String id) {
		return (Spec) dao.selectOne("manage.spec.selectById", id);
	}

}
