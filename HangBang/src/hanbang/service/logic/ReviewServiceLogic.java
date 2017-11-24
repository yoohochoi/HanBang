package hanbang.service.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import hanbang.domain.Review;
import hanbang.service.ReviewService;

@Service
public class ReviewServiceLogic implements ReviewService{

	@Override
	public boolean register(Review review) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Review find(int reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> findByShareHouseId(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(Review review) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeByShareHouse(int shareHouseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reportReview(String memberId, int reviewId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByReviewId(int reviewId) {
		// TODO Auto-generated method stub
		return false;
	}

}
