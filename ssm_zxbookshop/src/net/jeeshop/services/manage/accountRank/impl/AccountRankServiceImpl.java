package net.jeeshop.services.manage.accountRank.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.accountRank.AccountRankService;
import net.jeeshop.services.manage.accountRank.bean.AccountRank;
import net.jeeshop.services.manage.accountRank.dao.AccountRankDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountRankServiceManage")
public class AccountRankServiceImpl extends ServersManager<AccountRank, AccountRankDao>
		implements AccountRankService {
    @Resource(name="accountRankDaoManage")
    @Override
    public void setDao(AccountRankDao accountRankDao) {
        this.dao = accountRankDao;
    }
}
