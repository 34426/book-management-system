package net.jeeshop.services.front.questionnaireItem;

import java.util.List;

import net.jeeshop.core.Services;
import net.jeeshop.services.front.questionnaire.bean.Questionnaire;
import net.jeeshop.services.front.questionnaireItem.bean.QuestionnaireItem;


public interface QuestionnaireItemService extends Services<QuestionnaireItem> {

	void insertList(List<QuestionnaireItem> itemList);
}
