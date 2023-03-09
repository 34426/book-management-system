package net.jeeshop.services.front.systemlog.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.systemlog.SystemlogService;
import net.jeeshop.services.front.systemlog.bean.Systemlog;
import net.jeeshop.services.front.systemlog.dao.SystemlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SystemlogServiceImpl extends ServersManager<Systemlog, SystemlogDao> implements
		SystemlogService {
    @Autowired
    @Qualifier("systemlogDaoImpl")
    @Override
    public void setDao(SystemlogDao systemlogDao) {
        this.dao = systemlogDao;
    }
}
