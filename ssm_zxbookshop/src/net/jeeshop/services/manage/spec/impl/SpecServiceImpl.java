package net.jeeshop.services.manage.spec.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.spec.SpecService;
import net.jeeshop.services.manage.spec.bean.Spec;
import net.jeeshop.services.manage.spec.dao.SpecDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("specServiceManage")
public class SpecServiceImpl extends ServersManager<Spec, SpecDao> implements
		SpecService {
    @Resource(name = "specDaoManage")
    @Override
    public void setDao(SpecDao specDao) {
        this.dao = specDao;
    }
}
