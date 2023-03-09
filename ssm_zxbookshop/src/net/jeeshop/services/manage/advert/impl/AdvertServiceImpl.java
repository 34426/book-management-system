package net.jeeshop.services.manage.advert.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.advert.AdvertService;
import net.jeeshop.services.manage.advert.bean.Advert;
import net.jeeshop.services.manage.advert.dao.AdvertDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("advertServiceManage")
public class AdvertServiceImpl extends ServersManager<Advert, AdvertDao> implements
		AdvertService {
    @Resource(name = "advertDaoManage")
    @Override
    public void setDao(AdvertDao advertDao) {
        this.dao = advertDao;
    }
}
