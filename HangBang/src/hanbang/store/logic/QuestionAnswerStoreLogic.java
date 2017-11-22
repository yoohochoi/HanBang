package hanbang.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import hanbang.domain.Answer;
import hanbang.store.QuestionAnswerStore;
import hanbang.store.factory.SqlSessionFactoryProvider;

@Repository
public class QuestionAnswerStoreLogic implements QuestionAnswerStore{
	
	private SqlSessionFactory factory;
	
	public QuestionAnswerStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public int create(Answer answer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Answer> retrive(int questionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Answer answer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByQuestionId(int questionId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByAnswerId(int answerId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
