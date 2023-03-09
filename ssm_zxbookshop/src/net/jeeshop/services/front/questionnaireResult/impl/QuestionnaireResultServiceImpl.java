package net.jeeshop.services.front.questionnaireResult.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.questionnaireResult.QuestionnaireResultService;
import net.jeeshop.services.front.questionnaireResult.bean.QuestionnaireResult;
import net.jeeshop.services.front.questionnaireResult.dao.QuestionnaireResultDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class QuestionnaireResultServiceImpl extends
		ServersManager<QuestionnaireResult, QuestionnaireResultDao> implements
		QuestionnaireResultService {
    @Autowired
    @Qualifier("questionnaireResultDaoImpl")
    @Override
    public void setDao(QuestionnaireResultDao questionnaireResultDao) {
        this.dao = questionnaireResultDao;
    }
}
