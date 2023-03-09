package net.jeeshop.services.front.comment.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.comment.bean.Comment;

public interface CommentDao extends DaoManager<Comment> {

	int selectCount(String orderid);
}
