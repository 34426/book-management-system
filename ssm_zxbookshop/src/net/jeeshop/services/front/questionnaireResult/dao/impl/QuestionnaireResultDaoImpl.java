package net.jeeshop.services.front.questionnaireResult.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.questionnaireResult.bean.QuestionnaireResult;
import net.jeeshop.services.front.questionnaireResult.dao.QuestionnaireResultDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class QuestionnaireResultDaoImpl implements QuestionnaireResultDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(QuestionnaireResult e) {
		return dao.selectPageList("front.questionnaireResult.selectPageList",
				"front.questionnaireResult.selectPageCount", e);
	}

	public List selectList(QuestionnaireResult e) {
		return dao.selectList("front.questionnaireResult.selectList", e);
	}

	public QuestionnaireResult selectOne(QuestionnaireResult e) {
		return (QuestionnaireResult) dao.selectOne(
				"front.questionnaireResult.selectOne", e);
	}

	public int delete(QuestionnaireResult e) {
		return dao.delete("front.questionnaireResult.delete", e);
	}

	public int update(QuestionnaireResult e) {
		return dao.update("front.questionnaireResult.update", e);
	}

	public int deletes(String[] ids) {
		QuestionnaireResult e = new QuestionnaireResult();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(QuestionnaireResult e) {
		return dao.insert("front.questionnaireResult.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.questionnaireResult.deleteById", id);
	}
	
	@Override
	public QuestionnaireResult selectById(String id) {
		return (QuestionnaireResult) dao.selectOne("front.questionnaireResult.selectById", id);
	}
}
