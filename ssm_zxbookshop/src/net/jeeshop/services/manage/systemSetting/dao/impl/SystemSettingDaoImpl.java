package net.jeeshop.services.manage.systemSetting.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.systemSetting.bean.SystemSetting;
import net.jeeshop.services.manage.systemSetting.dao.SystemSettingDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("systemSettingDaoManage")
public class SystemSettingDaoImpl implements SystemSettingDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(SystemSetting e) {
		return dao.selectPageList("manage.systemSetting.selectPageList",
				"manage.systemSetting.selectPageCount", e);
	}

	public List selectList(SystemSetting e) {
		return dao.selectList("manage.systemSetting.selectList", e);
	}

	public SystemSetting selectOne(SystemSetting e) {
		return (SystemSetting) dao.selectOne("manage.systemSetting.selectOne", e);
	}

	public int delete(SystemSetting e) {
		return dao.delete("manage.systemSetting.delete", e);
	}

	public int update(SystemSetting e) {
		return dao.update("manage.systemSetting.update", e);
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
		return dao.insert("manage.systemSetting.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.systemSetting.deleteById", id);
	}

	@Override
	public SystemSetting selectById(String id) {
		return (SystemSetting) dao.selectOne("manage.systemSetting.selectById",id);
	}
}
