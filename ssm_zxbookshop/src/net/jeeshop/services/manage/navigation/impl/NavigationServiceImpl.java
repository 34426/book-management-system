package net.jeeshop.services.manage.navigation.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.navigation.NavigationService;
import net.jeeshop.services.manage.navigation.bean.Navigation;
import net.jeeshop.services.manage.navigation.dao.NavigationDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("navigationServiceManage")
public class NavigationServiceImpl extends ServersManager<Navigation, NavigationDao> implements
		NavigationService {
    @Override
    @Resource(name = "navigationDaoManage")
    public void setDao(NavigationDao navigationDao) {
        this.dao = navigationDao;
    }

}
