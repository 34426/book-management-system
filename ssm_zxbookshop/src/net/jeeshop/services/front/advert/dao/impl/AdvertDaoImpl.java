package net.jeeshop.services.front.advert.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.advert.bean.Advert;
import net.jeeshop.services.front.advert.dao.AdvertDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("advertDaoFront")
public class AdvertDaoImpl implements AdvertDao {

    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Advert e) {
		return dao.selectPageList("front.advert.selectPageList",
				"front.advert.selectPageCount", e);
	}

	public List selectList(Advert e) {
		return dao.selectList("front.advert.selectList", e);
	}

	public Advert selectOne(Advert e) {
		return (Advert) dao.selectOne("front.advert.selectOne", e);
	}

	public int delete(Advert e) {
		return dao.delete("front.advert.delete", e);
	}

	public int update(Advert e) {
		return dao.update("front.advert.update", e);
	}

	public int deletes(String[] ids) {
		Advert e = new Advert();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Advert e) {
		return dao.insert("front.advert.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.advert.deleteById", id);
	}

	@Override
	public Advert selectById(String id) {
		return (Advert) dao.selectOne("front.advert.selectById", id);
	}
}
