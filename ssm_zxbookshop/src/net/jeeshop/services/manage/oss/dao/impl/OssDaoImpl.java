package net.jeeshop.services.manage.oss.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.commentType.bean.CommentType;
import net.jeeshop.services.manage.oss.bean.Oss;
import net.jeeshop.services.manage.oss.dao.OssDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("ossDaoManage")
public class OssDaoImpl implements OssDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Oss e) {
		return dao.selectPageList("manage.oss.selectPageList", "manage.oss.selectPageCount",
				e);
	}

	public List selectList(Oss e) {
		return dao.selectList("manage.oss.selectList", e);
	}

	public Oss selectOne(Oss e) {
		return (Oss) dao.selectOne("manage.oss.selectOne", e);
	}

	public int delete(Oss e) {
		return dao.delete("manage.oss.delete", e);
	}

	public int update(Oss e) {
		return dao.update("manage.oss.update", e);
	}

	public int deletes(String[] ids) {
		Oss e = new Oss();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Oss e) {
		return dao.insert("manage.oss.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.oss.deleteById", id);
	}

	@Override
	public Oss selectById(String id) {
		return (Oss) dao.selectOne("manage.oss.deleteById.selectById", id);
	}
}
