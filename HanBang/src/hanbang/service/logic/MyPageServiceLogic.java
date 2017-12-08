package hanbang.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.Room;
import hanbang.service.MyPageService;
import hanbang.store.InterestShareHouseStore;
import hanbang.store.ReviewStore;
import hanbang.store.RoomStore;
import hanbang.store.ShareHouseStore;

@Service
public class MyPageServiceLogic implements MyPageService {
	
	@Autowired
	private ShareHouseStore ShareHouseStore;
	@Autowired
	private ReviewStore reviewStore;
	@Autowired
	private InterestShareHouseStore interestStore;
	@Autowired
	private RoomStore roomStore;
	

	@Override
	public Room findShareHouseRoom(int shareHouseId) {
		
		List<Room> rooms = roomStore.retrive(shareHouseId);
		Room room = rooms.get(0);
		
		return room;
	}

	@Override
	public int myShareHouseNumber(String memberId) {
		return 0;
	}

	@Override
	public int myReviewNumber(String memberId) {
		return 0;
	}

}
