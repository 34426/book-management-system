package net.jeeshop.services.manage.gift.bean;

import java.io.Serializable;
import net.jeeshop.core.dao.page.PagerModel;

public class Gift extends PagerModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String giftName;
	private String giftPrice;
	private String createAccount;
	private String createtime;
	private String updateAccount;
	private String updatetime;
	private String status;
	private String picture;

	public static String gift_status_up = "up";
	public static String gift_status_down = "down";
	
	public void clear() {
		super.clear();
		id = null;
		giftName = null;
		giftPrice = null;
		createAccount = null;
		createtime = null;
		updateAccount = null;
		updatetime = null;
		status = null;
		picture = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGiftName() {
		return giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public String getGiftPrice() {
		return giftPrice;
	}

	public void setGiftPrice(String giftPrice) {
		this.giftPrice = giftPrice;
	}

	public String getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(String createAccount) {
		this.createAccount = createAccount;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getUpdateAccount() {
		return updateAccount;
	}

	public void setUpdateAccount(String updateAccount) {
		this.updateAccount = updateAccount;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}