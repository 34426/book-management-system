package net.jeeshop.services.front.questionnaireItem.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.questionnaireItem.bean.QuestionnaireItem;

public interface QuestionnaireItemDao extends DaoManager<QuestionnaireItem> {

	int uniqeItem(QuestionnaireItem questionnaireItem);
}
