package hanbang.service.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.House;
import hanbang.domain.Photo;
import hanbang.domain.Room;
import hanbang.domain.ShareHouse;
import hanbang.service.EssentialInfoService;
import hanbang.service.ExtraInfoService;
import hanbang.service.ShareHouseService;
import hanbang.store.HouseStore;
import hanbang.store.PhotoStore;
import hanbang.store.RoomStore;
import hanbang.store.ShareHouseStore;

@Service
public class ShareHouseServiceLogic implements ShareHouseService {

	@Autowired
	private ShareHouseStore shareHouseStore;
	@Autowired
	private RoomStore roomStore;
	@Autowired
	private HouseStore houseStore;
	@Autowired
	private EssentialInfoService essentialInfoService;
	@Autowired
	private ExtraInfoService extraInfoService;
	@Autowired
	private PhotoStore photoStore;

	@Override
	public boolean register(ShareHouse shareHouse, List<Room> rooms, House house) {
		int check = 0;
		shareHouse.setHouseId(house.getHouseId());
		check = shareHouseStore.create(shareHouse);
		if (check > 0) {
			int shareHouseId = shareHouse.getShareHouseId();

			int index = 0;
			for (Room room : rooms) {
				room = new Room();
				room = rooms.get(index);
				room.setShareHouseId(shareHouseId);
				roomStore.create(room);
				index++;
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<ShareHouse> findAll() {

		List<ShareHouse> list = new ArrayList<>();
		list = shareHouseStore.retriveAll();

		return list;
	}

	@Override
	public ShareHouse find(int shareHouseId) {

		ShareHouse shareHouse = shareHouseStore.retrive(shareHouseId);
		shareHouse.setRooms(roomStore.retrive(shareHouseId));
		shareHouse.setEssentialInfo(essentialInfoService.find(shareHouseId));
		shareHouse.setExtraInfo(extraInfoService.find(shareHouseId));
		return shareHouse;
	}

	@Override
	public List<ShareHouse> findByMemberId(String memberId) {
		List<ShareHouse> list = new ArrayList<>();
		list = shareHouseStore.retriveByMemberId(memberId);
		return list;
	}

	@Override
	public List<ShareHouse> researchShareHouse(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(ShareHouse shareHouse, List<Room> rooms, House house) {

		int check = 0;
		int index = 0;

		for (Room room : rooms) {
			room = new Room();
			room = rooms.get(index);
			roomStore.update(room);
			index++;
		}
		houseStore.update(house);

		shareHouse.setHouseId(house.getHouseId());
		shareHouse.setRooms(rooms);

		check = shareHouseStore.update(shareHouse);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean notify(Map<String, Object> map) {

		int check = 0;

		check = shareHouseStore.report(map);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean remove(int shareHouseId) {
		roomStore.deleteByShareHouse(shareHouseId);
		int check = shareHouseStore.delete(shareHouseId);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removeByMemberId(String memberId) {

		List<ShareHouse> list = new ArrayList<>();
		list = shareHouseStore.retriveByMemberId(memberId);
		int index = 0;
		for (ShareHouse shareHouse : list) {
			shareHouse = new ShareHouse();

			shareHouse = list.get(index);
			int shareHouseId = shareHouse.getShareHouseId();
			roomStore.deleteByShareHouse(shareHouseId);
			essentialInfoService.deleteByShareHouse(shareHouseId);
			extraInfoService.deleteByShareHouse(shareHouseId);
			index++;
		}
		int check = shareHouseStore.deleteByMemberId(memberId);
		if (check > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean savePhoto(String saveFileName, int shareHouseId) {
		int check = photoStore.create(saveFileName, shareHouseId);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

}
