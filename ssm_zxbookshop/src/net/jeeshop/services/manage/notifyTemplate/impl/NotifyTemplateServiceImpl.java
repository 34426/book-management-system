package net.jeeshop.services.manage.notifyTemplate.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.notifyTemplate.NotifyTemplateService;
import net.jeeshop.services.manage.notifyTemplate.bean.NotifyTemplate;
import net.jeeshop.services.manage.notifyTemplate.dao.NotifyTemplateDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("notifyTemplateServiceManage")
public class NotifyTemplateServiceImpl extends ServersManager<NotifyTemplate, NotifyTemplateDao>
		implements NotifyTemplateService {
    @Resource(name = "notifyTemplateDaoManage")
    @Override
    public void setDao(NotifyTemplateDao notifyTemplateDao) {
        this.dao = notifyTemplateDao;
    }
}
