package hanbang.store;

import java.util.List;

import hanbang.domain.Room;

public interface RoomStore {

	public int create(Room room);

	public List<Room> retrive(int shareHouseId);

	public int update(Room room);

	public int delete(int roomId);

	public int deleteByShareHouse(int shareHouseId);

}
