package hanbang.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.ProvidedGood;
import hanbang.domain.Room;
import hanbang.service.RoomService;
import hanbang.store.RoomStore;

@Service
public class RoomServiceLogic implements RoomService {

	@Autowired
	private RoomStore store;

	@Override
	public boolean register(Room room, List<ProvidedGood> providedGoods) {
		int check;
		check = store.create(room);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Room> find(int shareHouseId) {

		return store.retrive(shareHouseId);
	}

	@Override
	public boolean modify(Room room, List<ProvidedGood> providedGoods) {
		int check;
		check = store.update(room);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteByShareHouse(int shareHouseId) {
		int check;
		check = store.deleteByShareHouse(shareHouseId);
		if(check>0) {
			return true;
		}else {
			return false;
		}
	}

}
