//package net.jeeshop.web.action.manage.orderlog;
//
//import net.jeeshop.core.BaseAction;
//import net.jeeshop.services.manage.orderlog.OrderlogService;
//import net.jeeshop.services.manage.orderlog.bean.Orderlog;
//
//public class OrderlogAction extends BaseAction<Orderlog> {
//	private static final long serialVersionUID = 1L;
//	private OrderlogService orderlogService;
//
//	public OrderlogService getOrderlogService() {
//		return orderlogService;
//	}
//
//	protected void selectListAfter() {
//		pager.setPagerUrl("orderlog!selectList.action");
//	}
//
//	public void setOrderlogService(OrderlogService orderlogService) {
//		this.orderlogService = orderlogService;
//	}
//
//	public Orderlog getE() {
//		return this.e;
//	}
//
//	public void prepare() throws Exception {
//		if (this.e == null) {
//			this.e = new Orderlog();
//		}
//	}
//
//	public void insertAfter(Orderlog e) {
//		e.clear();
//	}
//}
