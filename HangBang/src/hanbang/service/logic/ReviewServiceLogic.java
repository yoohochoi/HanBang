package hanbang.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.Answer;
import hanbang.domain.Review;
import hanbang.service.ReviewService;
import hanbang.store.ReviewAnswerStore;
import hanbang.store.ReviewStore;

@Service
public class ReviewServiceLogic implements ReviewService{
	
	@Autowired
	private ReviewStore rStore;
	@Autowired
	private ReviewAnswerStore aStore;

	@Override
	public boolean register(Review review) {
		int check = rStore.create(review);
		if(check == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Review find(int reviewId) {
		Review review = rStore.retrive(reviewId);
		List<Answer> reviewAnswers = aStore.retrieve(reviewId);
		review.setAnswers(reviewAnswers);
		return review;
	}

	@Override
	public List<Review> findByShareHouseId(int shareHouseId) {
		return rStore.retriveAll(shareHouseId);
	}

	@Override
	public boolean modify(Review review) {
		int check = rStore.update(review);
		if(check == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean removeByShareHouse(int shareHouseId) {
		int check = rStore.deleteByShareHouse(shareHouseId);
		if( check == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean reportReview(String memberId, int reviewId) {
		int check = rStore.reviewReport(memberId, reviewId);
		if(check == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean removeByMemberId(String memberId) {
		int check = rStore.deleteByMemberId(memberId);
		if(check == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean removeByReviewId(int reviewId) {
		int check = rStore.deleteByReviewId(reviewId);
		if(check == 0) {
			return false;
		} else {
			return true;
		}
	}

}
