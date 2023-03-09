package net.jeeshop.services.manage.systemSetting.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.systemSetting.SystemSettingService;
import net.jeeshop.services.manage.systemSetting.bean.SystemSetting;
import net.jeeshop.services.manage.systemSetting.dao.SystemSettingDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("systemSettingServiceManage")
public class SystemSettingServiceImpl extends ServersManager<SystemSetting, SystemSettingDao>
		implements SystemSettingService {
    @Override
    @Resource(name = "systemSettingDaoManage")
    public void setDao(SystemSettingDao systemSettingDao) {
        this.dao = systemSettingDao;
    }
}
