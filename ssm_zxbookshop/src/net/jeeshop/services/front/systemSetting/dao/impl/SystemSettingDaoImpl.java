package net.jeeshop.services.front.systemSetting.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.systemSetting.bean.SystemSetting;
import net.jeeshop.services.front.systemSetting.dao.SystemSettingDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class SystemSettingDaoImpl implements SystemSettingDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(SystemSetting e) {
		return dao.selectPageList("front.systemSetting.selectPageList",
				"front.systemSetting.selectPageCount", e);
	}

	public List selectList(SystemSetting e) {
		return dao.selectList("front.systemSetting.selectList", e);
	}

	public SystemSetting selectOne(SystemSetting e) {
		return (SystemSetting) dao.selectOne("front.systemSetting.selectOne", e);
	}

	public int delete(SystemSetting e) {
		return dao.delete("front.systemSetting.delete", e);
	}

	public int update(SystemSetting e) {
		return dao.update("front.systemSetting.update", e);
	}

	public int deletes(String[] ids) {
		SystemSetting e = new SystemSetting();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(SystemSetting e) {
		return dao.insert("front.systemSetting.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.systemSetting.deleteById", id);
	}

	@Override
	public SystemSetting selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
