package net.jeeshop.services.front.favorite.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.favorite.bean.Favorite;

public interface FavoriteDao extends DaoManager<Favorite> {

	int selectCount(Favorite favorite);
}
