package net.jeeshop.services.manage.comment.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.manage.comment.bean.Comment;

public interface CommentDao extends DaoManager<Comment> {

	int selectNotReplyCount();

	void updateStatus(Comment c);
}
