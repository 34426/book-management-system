package net.jeeshop.services.manage.systemlog.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.systemlog.SystemlogService;
import net.jeeshop.services.manage.systemlog.bean.Systemlog;
import net.jeeshop.services.manage.systemlog.dao.SystemlogDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("systemlogServiceManage")
public class SystemlogServiceImpl extends ServersManager<Systemlog, SystemlogDao> implements
		SystemlogService {

    @Override
    @Resource(name = "systemlogDaoManage")
    public void setDao(SystemlogDao systemlogDao) {
        this.dao = systemlogDao;
    }

    @Override
	public Systemlog selectFirstOne(String account) {
		return dao.selectFirstOne(account);
	}

}
