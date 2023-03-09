package net.jeeshop.services.manage.keyvalue.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.keyvalue.KeyvalueService;
import net.jeeshop.services.manage.keyvalue.bean.Keyvalue;
import net.jeeshop.services.manage.keyvalue.dao.KeyvalueDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("keyvalueServiceManage")
public class KeyvalueServiceImpl extends ServersManager<Keyvalue, KeyvalueDao> implements
		KeyvalueService {

    @Resource(name = "keyvalueDaoManage")
    @Override
    public void setDao(KeyvalueDao keyvalueDao) {
        this.dao = keyvalueDao;
    }
}
