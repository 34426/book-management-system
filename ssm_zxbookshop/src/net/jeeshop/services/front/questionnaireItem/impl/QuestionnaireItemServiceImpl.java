package net.jeeshop.services.front.questionnaireItem.impl;import java.util.List;import net.jeeshop.core.ServersManager;import net.jeeshop.services.front.questionnaireItem.QuestionnaireItemService;import net.jeeshop.services.front.questionnaireItem.bean.QuestionnaireItem;import net.jeeshop.services.front.questionnaireItem.dao.QuestionnaireItemDao;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.beans.factory.annotation.Qualifier;import org.springframework.stereotype.Service;@Servicepublic class QuestionnaireItemServiceImpl extends		ServersManager<QuestionnaireItem, QuestionnaireItemDao> implements QuestionnaireItemService {    @Autowired	@Qualifier("questionnaireItemDaoImpl")    @Override    public void setDao(QuestionnaireItemDao questionnaireItemDao) {        this.dao = questionnaireItemDao;    }	public void insertList(List<QuestionnaireItem> list) {		if(list==null)			throw new NullPointerException();				//检查题目是否有相同的存在，同一张问卷不能存在相同的题目		if(dao.uniqeItem(list.get(0)) > 0){			throw new RuntimeException("一张问卷不允许存在相同的题目！");		}				for(int i=0;i<list.size();i++){            dao.insert(list.get(i));		}	}}