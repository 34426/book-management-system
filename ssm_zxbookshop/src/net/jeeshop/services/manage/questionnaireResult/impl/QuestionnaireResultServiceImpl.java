package net.jeeshop.services.manage.questionnaireResult.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.manage.questionnaireResult.QuestionnaireResultService;
import net.jeeshop.services.manage.questionnaireResult.bean.QuestionnaireResult;
import net.jeeshop.services.manage.questionnaireResult.dao.QuestionnaireResultDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("questionnaireResultServiceManage")
public class QuestionnaireResultServiceImpl extends
		ServersManager<QuestionnaireResult, QuestionnaireResultDao> implements
		QuestionnaireResultService {

    @Resource(name = "questionnaireResultDaoManage")
    @Override
    public void setDao(QuestionnaireResultDao questionnaireResultDao) {
        this.dao = questionnaireResultDao;
    }
}
