package hanbang.store;

import java.util.List;

import hanbang.domain.Review;

public interface ReviewStore {

	int create(Review review);

	List<Review> retriveAll(int shareHouseId);

	Review retrive(int retriveId);

	int update(Review review);

	int delete(String memberId);

	int deleteByShareHouse(int shareHouseId);

	int reviewReport(String memberId, int reviewId);

}
