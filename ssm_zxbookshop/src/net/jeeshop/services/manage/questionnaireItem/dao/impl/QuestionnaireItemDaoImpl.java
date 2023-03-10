package net.jeeshop.services.manage.questionnaireItem.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.questionnaire.bean.Questionnaire;
import net.jeeshop.services.manage.questionnaireItem.bean.QuestionnaireItem;
import net.jeeshop.services.manage.questionnaireItem.dao.QuestionnaireItemDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("questionnaireItemDaoManage")
public class QuestionnaireItemDaoImpl implements QuestionnaireItemDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(QuestionnaireItem e) {
		return dao.selectPageList("manage.questionnaireItem.selectPageList",
				"manage.questionnaireItem.selectPageCount", e);
	}

	public List selectList(QuestionnaireItem e) {
		return dao.selectList("manage.questionnaireItem.selectList", e);
	}

	public QuestionnaireItem selectOne(QuestionnaireItem e) {
		return (QuestionnaireItem) dao.selectOne("manage.questionnaireItem.selectOne",
				e);
	}

	public int delete(QuestionnaireItem e) {
		return dao.delete("manage.questionnaireItem.delete", e);
	}

	public int update(QuestionnaireItem e) {
		return dao.update("manage.questionnaireItem.update", e);
	}

	public int deletes(String[] ids) {
		QuestionnaireItem e = new QuestionnaireItem();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(QuestionnaireItem e) {
		return dao.insert("manage.questionnaireItem.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.questionnaireItem.deleteById", id);
	}
	
	@Override
	public QuestionnaireItem selectById(String id) {
		return (QuestionnaireItem) dao.selectOne("manage.questionnaireItem.selectById", id);
	}

	@Override
	public int uniqeItem(QuestionnaireItem questionnaireItem) {
		return (Integer) dao.selectOne("manage.questionnaireItem.uniqeItem", questionnaireItem);
	}

	@Override
	public void deleteQuestionItem(QuestionnaireItem item) {
		dao.delete("manage.questionnaireItem.deleteQuestionItem", item);
	}
}
