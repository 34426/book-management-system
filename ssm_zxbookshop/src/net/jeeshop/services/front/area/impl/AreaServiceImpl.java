package net.jeeshop.services.front.area.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.area.AreaService;
import net.jeeshop.services.front.area.bean.Area;
import net.jeeshop.services.front.area.dao.AreaDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("areaServiceFront")
public class AreaServiceImpl extends ServersManager<Area, AreaDao> implements
		AreaService {
    @Resource(name = "areaDaoFront")
    @Override
    public void setDao(AreaDao areaDao) {
        this.dao = areaDao;
    }
}
