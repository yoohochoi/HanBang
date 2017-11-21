package hanbang.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import hanbang.domain.Review;
import hanbang.store.ReviewStore;
import hanbang.store.factory.SqlSessionFactoryProvider;

@Repository
public class ReviewStoreLogic implements ReviewStore{
	
	private SqlSessionFactory factory;
	
	public ReviewStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public int create(Review review) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Review> retriveAll(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review retrive(int retriveId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Review review) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByShareHouse(int shareHouseId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int reviewReport(String memberId, int reviewId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
