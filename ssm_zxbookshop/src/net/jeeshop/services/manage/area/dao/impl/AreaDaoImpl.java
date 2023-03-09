package net.jeeshop.services.manage.area.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.account.bean.Account;
import net.jeeshop.services.manage.area.bean.Area;
import net.jeeshop.services.manage.area.dao.AreaDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("areaDaoManage")
public class AreaDaoImpl implements AreaDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Area e) {
		return dao.selectPageList("manage.area.selectPageList",
				"manage.area.selectPageCount", e);
	}

	public List selectList(Area e) {
		return dao.selectList("manage.area.selectList", e);
	}

	public Area selectOne(Area e) {
		return (Area) dao.selectOne("manage.area.selectOne", e);
	}

	public int delete(Area e) {
		return dao.delete("manage.area.delete", e);
	}

	public int update(Area e) {
		return dao.update("manage.area.update", e);
	}

	public int deletes(String[] ids) {
		Area e = new Area();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Area e) {
		return dao.insert("manage.area.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.area.deleteById", id);
	}

	public Area selectById(String id) {
		return (Area) dao.selectOne(id);
	}

	@Override
	public void deleteAll() {
		dao.delete("manage.area.deleteAll");
	}

	@Override
	public List<Area> selectListByPcode(String pcode) {
		return dao.selectList("manage.area.selectListByPcode", pcode);
	}

	@Override
	public int getCount(Area area) {
		return Integer.valueOf(dao.selectOne("manage.area.getCount", area).toString());
	}
}
