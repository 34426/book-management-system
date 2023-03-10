package net.jeeshop.services.common;

import java.io.Serializable;

import net.jeeshop.core.dao.page.PagerModel;

@Deprecated
public class Notice extends PagerModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String title;
	private String content;
	private String createtime;

	private int top;

	public Notice() {
	}

	public Notice(int top) {
		this.top = top;
	}

	public void clear() {
		super.clear();
		id = null;
		title = null;
		content = null;
		createtime = null;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

}
