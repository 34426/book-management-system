package net.jeeshop.services.manage.express.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.express.bean.Express;
import net.jeeshop.services.manage.express.dao.ExpressDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("expressDaoManage")
public class ExpressDaoImpl implements ExpressDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Express e) {
		return dao.selectPageList("manage.express.selectPageList",
				"manage.express.selectPageCount", e);
	}

	public List selectList(Express e) {
		return dao.selectList("manage.express.selectList", e);
	}

	public Express selectOne(Express e) {
		return (Express) dao.selectOne("manage.express.selectOne", e);
	}

	public int delete(Express e) {
		return dao.delete("manage.express.delete", e);
	}

	public int update(Express e) {
		return dao.update("manage.express.update", e);
	}

	public int deletes(String[] ids) {
		Express e = new Express();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Express e) {
		return dao.insert("manage.express.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.express.deleteById", id);
	}

	@Override
	public Express selectById(String id) {
		return (Express) dao.selectOne("manage.express.selectById", id);
	}
}
