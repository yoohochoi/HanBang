package hanbang.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import hanbang.domain.Answer;
import hanbang.domain.Question;
import hanbang.store.QuestionAnswerStore;
import hanbang.store.QuestionStore;
import hanbang.store.factory.SqlSessionFactoryProvider;

@Repository
public class QuestionStoreLogic implements QuestionStore{
	
	private SqlSessionFactory factory;
	
	public QuestionStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public int create(Question question) {
//		SqlSession session = 
		return 0;
	}

	@Override
	public List<Question> retriveByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> retriveByShareHouseId(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question retrive(int questionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Question question) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int questionId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByShareHouse(int shareHouseId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
