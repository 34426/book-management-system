package net.jeeshop.services.front.keyvalue.bean;

import java.io.Serializable;

import net.jeeshop.core.dao.page.PagerModel;

public class Keyvalue extends net.jeeshop.services.common.Keyvalue implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String key1;
	private String value;

	public void clear() {
		super.clear();
		id = null;
		key1 = null;
		value = null;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
