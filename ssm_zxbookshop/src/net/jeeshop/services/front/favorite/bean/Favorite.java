package net.jeeshop.services.front.favorite.bean;

import java.io.Serializable;

import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.product.bean.Product;

public class Favorite extends net.jeeshop.services.common.Favorite implements Serializable {
	private static final long serialVersionUID = 1L;
	private Product product;

	public void clear() {
		super.clear();
		if(product!=null){
			product.clear();
		}
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
