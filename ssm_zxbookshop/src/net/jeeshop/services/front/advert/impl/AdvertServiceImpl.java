package net.jeeshop.services.front.advert.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.advert.AdvertService;
import net.jeeshop.services.front.advert.bean.Advert;
import net.jeeshop.services.front.advert.dao.AdvertDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("advertServiceFront")
public class AdvertServiceImpl extends ServersManager<Advert, AdvertDao> implements
		AdvertService {
    @Resource(name = "advertDaoFront")
    @Override
    public void setDao(AdvertDao advertDao) {
        this.dao = advertDao;
    }
}
