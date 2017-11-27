package hanbang.service.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import hanbang.domain.EssentialInfo;
import hanbang.domain.ExtraInfo;
import hanbang.domain.House;
import hanbang.domain.Room;
import hanbang.domain.ShareHouse;
import hanbang.service.ShareHouseService;
import hanbang.store.EssentialInfoStore;
import hanbang.store.ExtraInfoStore;
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

	private ShareHouseStore shareHouseStore;
	private EssentialInfoStore essentialInfoStore;
	private ExtraInfoStore extraInfoStore;
	private RoomStore roomStore;
	private HouseStore houseStore;

	public ShareHouseServiceLogic() {

		shareHouseStore = new ShareHouseStoreLogic();
		essentialInfoStore = new EssentialInfoStoreLogic();
		extraInfoStore = new ExtraInfoStoreLogic();
		roomStore = new RoomStoreLogic();
		houseStore = new HouseStoreLogic();
	}

	@Override
	public boolean register(ShareHouse shareHouse, EssentialInfo essentialInfo, ExtraInfo extraInfo, List<Room> rooms,
			int houseId, House house) {
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

			essentialInfo.setShareHouseId(shareHouseId);
			extraInfo.setShareHouseId(shareHouseId);
			int index = 0;
			for (Room room : rooms) {
				room = new Room();
				room = rooms.get(index);
				room.setShareHouseId(shareHouseId);
				roomStore.create(room);
				index++;
			}
			essentialInfoStore.create(essentialInfo);
			extraInfoStore.create(extraInfo);
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
		shareHouse.setEssentialInfo(essentialInfoStore.retrive(shareHouseId));
		shareHouse.setExtraInfo(extraInfoStore.retrive(shareHouseId));
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
	public boolean modify(ShareHouse shareHouse, EssentialInfo essentialInfo, ExtraInfo extraInfo, List<Room> rooms,
			House house) {

		int check = 0;
		int index = 0;

		essentialInfoStore.update(essentialInfo);
		extraInfoStore.update(extraInfo);
		for (Room room : rooms) {
			room = new Room();
			room = rooms.get(index);
			roomStore.update(room);
			index++;
		}
		houseStore.update(house);

		shareHouse.setHouseId(house.getHouseId());
		shareHouse.setEssentialInfo(essentialInfo);
		shareHouse.setExtraInfo(extraInfo);
		shareHouse.setRooms(rooms);

		check = shareHouseStore.update(shareHouse);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean notify(int shareHouseId, String memberId) {

		int check = 0;

		check = shareHouseStore.report(shareHouseId, memberId);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean remove(int shareHouseId) {

		int check = 0;

		essentialInfoStore.deleteByShareHouse(shareHouseId);
		extraInfoStore.deleteByShareHouse(shareHouseId);
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
			essentialInfoStore.deleteByShareHouse(shareHouseId);
			extraInfoStore.deleteByShareHouse(shareHouseId);
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
