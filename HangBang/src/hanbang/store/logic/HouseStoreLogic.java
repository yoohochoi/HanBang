package hanbang.store.logic;

import java.util.List;

import hanbang.domain.House;
import hanbang.store.HouseStore;

public class HouseStoreLogic implements HouseStore {

	@Override
	public int create(House house) {
		return 0;
	}

	@Override
	public House retrive(int houseId) {
		return null;
	}

	@Override
	public List<House> retriveByMemberId(String memberId) {
		return null;
	}

	@Override
	public int update(House house) {
		return 0;
	}

	@Override
	public int delete(int houseId) {
		return 0;
	}

	@Override
	public int deleteByMemberId(String memberId) {
		return 0;
	}

}
