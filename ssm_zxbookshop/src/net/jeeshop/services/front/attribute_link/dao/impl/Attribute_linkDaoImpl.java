package net.jeeshop.services.front.attribute_link.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.attribute.bean.Attribute;
import net.jeeshop.services.front.attribute_link.bean.Attribute_link;
import net.jeeshop.services.front.attribute_link.dao.Attribute_linkDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("attribute_linkDaoFront")
public class Attribute_linkDaoImpl implements Attribute_linkDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Attribute_link e) {
		return dao.selectPageList("front.attribute_link.selectPageList",
				"front.attribute_link.selectPageCount", e);
	}

	public List selectList(Attribute_link e) {
		return dao.selectList("front.attribute_link.selectList", e);
	}

	public Attribute_link selectOne(Attribute_link e) {
		return (Attribute_link) dao.selectOne("front.attribute_link.selectOne", e);
	}

	public int delete(Attribute_link e) {
		return dao.delete("front.attribute_link.delete", e);
	}

	public int update(Attribute_link e) {
		return dao.update("front.attribute_link.update", e);
	}

	public int deletes(String[] ids) {
		Attribute_link e = new Attribute_link();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Attribute_link e) {
		return dao.insert("front.attribute_link.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.attribute_link.deleteById", id);
	}

	public int deleteByCondition(Attribute_link e) {
		return dao.delete("front.attribute_link.deleteByCondition", e);
	}
	
	public Attribute_link selectById(String id) {
		return (Attribute_link) dao.selectOne("account.selectById", id);
	}
}
