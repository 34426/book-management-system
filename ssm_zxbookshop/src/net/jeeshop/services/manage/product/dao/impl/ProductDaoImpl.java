package net.jeeshop.services.manage.product.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.orderdetail.bean.Orderdetail;
import net.jeeshop.services.manage.product.bean.Product;
import net.jeeshop.services.manage.product.dao.ProductDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("productDaoManage")
public class ProductDaoImpl implements ProductDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Product e) {
		return dao.selectPageList("manage.product.selectPageList",
				"manage.product.selectPageCount", e);
	}

	public List selectList(Product e) {
		return dao.selectList("manage.product.selectList", e);
	}

	public Product selectOne(Product e) {
		return (Product) dao.selectOne("manage.product.selectOne", e);
	}

	public int delete(Product e) {
		return dao.delete("manage.product.delete", e);
	}

	public int update(Product e) {
		return dao.update("manage.product.update", e);
	}

	public int deletes(String[] ids) {
		Product e = new Product();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Product e) {
		return dao.insert("manage.product.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.product.deleteById", id);
	}

	public Product selectById(String id) {
		return (Product) dao.selectOne("manage.product.selectById", id);
	}

	@Override
	public void deleteAttributeLinkByProductID(int parseInt) {
		dao.delete("manage.product.deleteAttributeLinkByProductID", parseInt);		
	}

	@Override
	public List<Product> selectStockByIDs(List<String> productIDs) {
		return dao.selectList("manage.product.selectStockByIDs",productIDs);
	}

	@Override
	public int selectOutOfStockProductCount() {
		return (Integer) dao.selectOne("manage.product.selectOutOfStockProductCount");
	}

	@Override
	public void updateImg(Product p) {
		dao.update("manage.product.updateImg",p);
	}

	@Override
	public void updateProductStatus(Product p) {
		dao.update("manage.product.updateProductStatus",p);
	}

	@Override
	public void updateProductBindActivityId(Product pro) {
		dao.update("manage.product.updateProductBindActivityId",pro);
	}

	@Override
	public void updateResetThisProductActivityID(String activityID) {
		dao.update("manage.product.updateResetThisProductActivityID",activityID);
	}
}
