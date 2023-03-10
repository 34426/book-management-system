package net.jeeshop.services.manage.product.dao;
import java.util.List;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.manage.product.bean.Product;
public interface ProductDao extends DaoManager<Product> {

	/**
	 * @param parseInt
	 */
	void deleteAttributeLinkByProductID(int parseInt);

	List<Product> selectStockByIDs(List<String> productIDs);

	int selectOutOfStockProductCount();

	void updateImg(Product p);

	void updateProductStatus(Product p);

	void updateProductBindActivityId(Product pro);

	void updateResetThisProductActivityID(String activityID);
}
