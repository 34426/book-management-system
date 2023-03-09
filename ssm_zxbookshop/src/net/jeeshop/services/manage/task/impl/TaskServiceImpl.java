package net.jeeshop.services.manage.task.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.task.TaskService;
import net.jeeshop.services.manage.task.bean.Task;
import net.jeeshop.services.manage.task.dao.TaskDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("taskServiceManage")
public class TaskServiceImpl extends ServersManager<Task, TaskDao> implements
		TaskService {
    @Override
    @Resource(name = "taskDaoManage")
	public void setDao(TaskDao taskDao) {
        this.dao = taskDao;
	}
}
