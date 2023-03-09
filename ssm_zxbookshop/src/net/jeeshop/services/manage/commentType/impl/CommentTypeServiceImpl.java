package net.jeeshop.services.manage.commentType.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.commentType.CommentTypeService;
import net.jeeshop.services.manage.commentType.bean.CommentType;
import net.jeeshop.services.manage.commentType.dao.CommentTypeDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("commentTypeServiceManage")
public class CommentTypeServiceImpl extends ServersManager<CommentType, CommentTypeDao>
		implements CommentTypeService {
    @Resource(name = "commentTypeDaoManage")
    @Override
    public void setDao(CommentTypeDao commentTypeDao) {
        this.dao = commentTypeDao;
    }

    @Override
	public int update(CommentType e) {
		dao.updateAllN();
		super.update(e);
		return 1;
	}
}
