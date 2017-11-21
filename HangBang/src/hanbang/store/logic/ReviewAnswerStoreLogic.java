package hanbang.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import hanbang.domain.Answer;
import hanbang.store.ReviewAnswerStore;
import hanbang.store.factory.SqlSessionFactoryProvider;

@Repository
public class ReviewAnswerStoreLogic implements ReviewAnswerStore{
	
	private SqlSessionFactory factory;
	
	public ReviewAnswerStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public int create(Answer answer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Answer> retrieve(int reviewId) {
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
	public int deleteByReviewId(int reviewId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByAnswerId(int answerId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
