package net.jeeshop.services.front.favorite;

import net.jeeshop.core.Services;
import net.jeeshop.services.front.favorite.bean.Favorite;

public interface FavoriteService extends Services<Favorite> {

	int selectCount(Favorite favorite);
}
