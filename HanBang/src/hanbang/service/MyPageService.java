package hanbang.service;


import hanbang.domain.Room;

public interface MyPageService {
	
	Room findShareHouseRoom(int shareHouseId);
	int myShareHouseNumber(String memberId);
	int myReviewNumber(String memberId);
	
	

}
