package net.jeeshop.services.manage.accountRank.dao.impl;

import java.util.List;
import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.accountRank.bean.AccountRank;
import net.jeeshop.services.manage.accountRank.dao.AccountRankDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("accountRankDaoManage")
public class AccountRankDaoImpl implements AccountRankDao {
    @Resource
    private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(AccountRank e) {
		return dao.selectPageList("manage.accountRank.selectPageList",
				"manage.accountRank.selectPageCount", e);
	}

	public List selectList(AccountRank e) {
		return dao.selectList("manage.accountRank.selectList", e);
	}

	public AccountRank selectOne(AccountRank e) {
		return (AccountRank) dao.selectOne("manage.accountRank.selectOne", e);
	}

	public int delete(AccountRank e) {
		return dao.delete("manage.accountRank.delete", e);
	}

	public int update(AccountRank e) {
		return dao.update("manage.accountRank.update", e);
	}

	public int deletes(String[] ids) {
		AccountRank e = new AccountRank();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(AccountRank e) {
		return dao.insert("manage.accountRank.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.accountRank.deleteById", id);
	}

	@Override
	public AccountRank selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
