package net.jeeshop.services.front.keyvalue.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.keyvalue.KeyvalueService;
import net.jeeshop.services.front.keyvalue.bean.Keyvalue;
import net.jeeshop.services.front.keyvalue.dao.KeyvalueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class KeyvalueServiceImpl extends ServersManager<Keyvalue, KeyvalueDao> implements
		KeyvalueService {
    @Autowired
    @Qualifier("keyvalueDaoImpl")
    @Override
    public void setDao(KeyvalueDao keyvalueDao) {
        this.dao = keyvalueDao;
    }
}
