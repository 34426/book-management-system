package net.jeeshop.services.manage.orderlog.bean;

import java.io.Serializable;

import net.jeeshop.core.dao.page.PagerModel;

public class Orderlog extends net.jeeshop.services.common.Orderlog implements Serializable {
	private static final long serialVersionUID = 1L;

	public Orderlog() {
		super();
	}

	public Orderlog(String orderid) {
		super(orderid);
	}

	public void clear() {
		super.clear();
	}

}
