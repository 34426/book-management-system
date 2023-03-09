package net.jeeshop.services.front.navigation.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.navigation.NavigationService;
import net.jeeshop.services.front.navigation.bean.Navigation;
import net.jeeshop.services.front.navigation.dao.NavigationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NavigationServiceImpl extends ServersManager<Navigation, NavigationDao> implements
		NavigationService {
    @Autowired
    @Qualifier("navigationDaoImpl")
    @Override
    public void setDao(NavigationDao navigationDao) {
        this.dao = navigationDao;
    }
}
