//package net.jeeshop.web.action.manage.orderdetail;
//import net.jeeshop.core.BaseAction;
//import net.jeeshop.services.manage.orderdetail.OrderdetailService;
//import net.jeeshop.services.manage.orderdetail.bean.Orderdetail;
//public class OrderdetailAction extends BaseAction<Orderdetail> {
//private static final long serialVersionUID = 1L;
//private OrderdetailService orderdetailService;
//public OrderdetailService getOrderdetailService() {
//return orderdetailService;
//}
//protected void selectListAfter() {
//pager.setPagerUrl("orderdetail!selectList.action");
//}
//public void setOrderdetailService(OrderdetailService orderdetailService) {
//this.orderdetailService = orderdetailService;
//}
//public Orderdetail getE() {
//return this.e;
//}
//public void prepare() throws Exception {
//if (this.e == null) {this.e = new Orderdetail();}
//}
//public void insertAfter(Orderdetail e) {
//e.clear();
//}
//}
