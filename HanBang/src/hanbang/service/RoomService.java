package hanbang.service;

import java.util.List;

import hanbang.domain.ProvidedGood;
import hanbang.domain.Room;

public interface RoomService {

	boolean register(Room room, List<ProvidedGood> providedGoods);

	List<Room> find(int shareHouseId);

	boolean modify(Room room, List<ProvidedGood> providedGoods);

	boolean deleteByShareHouse(int shareHouseId);

}
