package net.jeeshop.services.front.express.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.express.bean.Express;
import org.springframework.stereotype.Repository;

@Repository("expressFront")
public interface ExpressDao extends DaoManager<Express> {
}
