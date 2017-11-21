package hanbang.store;

import java.util.List;

import hanbang.domain.Review;

public interface ReviewStore {

	public int create(Review review);

	public List<Review> retriveAll(int shareHouseId);

	public Review retrive(int retriveId);

	public int update(Review review);

	public int delete(String memberId);

	public int deleteByShareHouse(int shareHouseId);

	public int reviewReport(String memberId, int reviewId);

}
