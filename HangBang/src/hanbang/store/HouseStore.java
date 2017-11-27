package hanbang.store;

import java.util.List;

import hanbang.domain.House;

public interface HouseStore {

	int create(House house);

	House retrive(int houseId);

	List<House> retriveByMemberId(String memberId);

	int update(House house);

	int delete(int houseId);

	int deleteByMemberId(String memberId);
}
