package net.jeeshop.services.front.commentType.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.commentType.CommentTypeService;
import net.jeeshop.services.front.commentType.bean.CommentType;
import net.jeeshop.services.front.commentType.dao.CommentTypeDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("commentTypeServiceFront")
public class CommentTypeServiceImpl extends ServersManager<CommentType, CommentTypeDao>
		implements CommentTypeService {
    @Resource(name = "commentTypeDaoFront")
    @Override
    public void setDao(CommentTypeDao commentTypeDao) {
        this.dao = commentTypeDao;
    }
}
