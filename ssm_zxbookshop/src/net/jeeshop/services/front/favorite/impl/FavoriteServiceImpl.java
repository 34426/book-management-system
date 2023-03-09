package net.jeeshop.services.front.favorite.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.favorite.FavoriteService;
import net.jeeshop.services.front.favorite.bean.Favorite;
import net.jeeshop.services.front.favorite.dao.FavoriteDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("favoriteServiceFront")
public class FavoriteServiceImpl extends ServersManager<Favorite, FavoriteDao> implements
		FavoriteService {

    @Resource(name = "favoriteDaoFront")
    @Override
    public void setDao(FavoriteDao favoriteDao) {
        this.dao = favoriteDao;
    }

    @Override
	public int selectCount(Favorite favorite) {
		return dao.selectCount(favorite);
	}
}
