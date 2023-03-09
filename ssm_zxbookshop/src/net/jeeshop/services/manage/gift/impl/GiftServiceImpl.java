package net.jeeshop.services.manage.gift.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.gift.GiftService;
import net.jeeshop.services.manage.gift.bean.Gift;
import net.jeeshop.services.manage.gift.dao.GiftDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("giftServiceManage")
public class GiftServiceImpl extends ServersManager<Gift, GiftDao> implements
		GiftService {
    @Resource(name = "giftDaoManage")
    @Override
    public void setDao(GiftDao giftDao) {
        this.dao = giftDao;
    }
}
