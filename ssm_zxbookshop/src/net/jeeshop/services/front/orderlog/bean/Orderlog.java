package net.jeeshop.services.front.orderlog.bean;

import java.io.Serializable;

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
