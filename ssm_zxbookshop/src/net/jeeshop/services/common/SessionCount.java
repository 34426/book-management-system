package net.jeeshop.services.common;

import java.io.Serializable;

import net.jeeshop.core.dao.page.PagerModel;

public class SessionCount extends PagerModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String ip;
	private String address;
	private String starttime;

	private int count;

	public void clear() {
		super.clear();
		id = null;
		ip = null;
		address = null;
		starttime = null;
		count = 0;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
