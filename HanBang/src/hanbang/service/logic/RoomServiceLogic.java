package hanbang.service.logic;

import java.util.List;

import hanbang.domain.ProvidedGood;
import hanbang.domain.Room;
import hanbang.service.RoomService;

public class RoomServiceLogic implements RoomService{

	@Override
	public boolean register(Room room, List<ProvidedGood> providedGoods) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Room find(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(Room room, List<ProvidedGood> providedGoods) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByShareHouse(int shareHouseId) {
		// TODO Auto-generated method stub
		return false;
	}

}
