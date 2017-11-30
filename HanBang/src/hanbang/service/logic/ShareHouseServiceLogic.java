package hanbang.service.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.EssentialInfo;
import hanbang.domain.ExtraInfo;
import hanbang.domain.Facilitie;
import hanbang.domain.House;
import hanbang.domain.Photo;
import hanbang.domain.ProvidedGood;
import hanbang.domain.Room;
import hanbang.domain.ShareHouse;
import hanbang.service.ShareHouseService;
import hanbang.store.EssentialInfoStore;
import hanbang.store.ExtraInfoStore;
import hanbang.store.FacilitieStore;
import hanbang.store.HouseStore;
import hanbang.store.RoomStore;
import hanbang.store.ShareHouseStore;
import hanbang.store.logic.EssentialInfoStoreLogic;
import hanbang.store.logic.ExtraInfoStoreLogic;
import hanbang.store.logic.HouseStoreLogic;
import hanbang.store.logic.RoomStoreLogic;
import hanbang.store.logic.ShareHouseStoreLogic;

@Service
public class ShareHouseServiceLogic implements ShareHouseService {

	@Autowired
	private ShareHouseStore shareHouseStore;
	@Autowired
	private RoomStore roomStore;
	@Autowired
	private HouseStore houseStore;

	// public ShareHouseServiceLogic() {
	//
	// shareHouseStore = new ShareHouseStoreLogic();
	// essentialInfoStore = new EssentialInfoStoreLogic();
	// extraInfoStore = new ExtraInfoStoreLogic();
	// roomStore = new RoomStoreLogic();
	// houseStore = new HouseStoreLogic();
	// }

	@Override
	public boolean register(ShareHouse shareHouse, List<Room> rooms, int houseId, House house, List<Photo> photos) {
		int check = 0;
		if (houseId > 0) {
			house = houseStore.retrive(houseId);
		} else {
			houseStore.create(house);
		}
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

		for (ShareHouse shareHouse : list) {
		}

		return list;
	}

	@Override
	public ShareHouse find(int shareHouseId) {

		ShareHouse shareHouse = new ShareHouse();
		shareHouse = shareHouseStore.retrive(shareHouseId);
		shareHouse.setRooms(roomStore.retrive(shareHouseId));
		// shareHouse.setHouse(houseStore.retrive(shareHouseId));

		return shareHouse;
	}

	@Override
	public List<ShareHouse> findByMemberId(String memberId) {
		List<ShareHouse> list = new ArrayList<>();

		return null;
	}

	@Override
	public List<ShareHouse> researchShareHouse(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(ShareHouse shareHouse, List<Room> rooms, House house, List<Photo> photos) {

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

		int check = 0;

		roomStore.deleteByShareHouse(shareHouseId);
		check = shareHouseStore.delete(shareHouseId);

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
		int check = 0;
		for (ShareHouse shareHouse : list) {
			shareHouse = new ShareHouse();

			shareHouse = list.get(index);
			int shareHouseId = shareHouse.getShareHouseId();
			roomStore.deleteByShareHouse(shareHouseId);
			check += shareHouseStore.delete(shareHouseId);

			index++;
		}

		if (check == list.size()) {
			return true;
		} else {
			return false;
		}

	}

}
