package hanbang.store.logic;

import java.util.List;

import hanbang.domain.Room;
import hanbang.store.RoomStore;
import hanbang.store.factory.SqlSessionFactoryProvider;

public class RoomStoreLogic implements RoomStore {

	private SqlSessionFactoryProvider factory;

	@Override
	public int create(Room room) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Room> retrive(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Room room) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int roomId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByShareHouse(int shareHouseId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
