package net.jeeshop.services.manage.oss.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.oss.OssService;
import net.jeeshop.services.manage.oss.bean.Oss;
import net.jeeshop.services.manage.oss.dao.OssDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ossServiceManage")
public class OssServiceImpl extends ServersManager<Oss, OssDao> implements OssService {
    @Resource(name = "ossDaoManage")
    @Override
    public void setDao(OssDao ossDao) {
        this.dao = ossDao;
    }
}
