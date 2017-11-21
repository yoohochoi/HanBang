package hanbang.store;

import java.util.List;

import hanbang.domain.House;

public interface HouseStore {

	public int create(House house);

	public House retrive(int houseId);

	public List<House> retriveByMemberId(String memberId);

	public int update(House house);

	public int delete(int houseId);

	public int deleteByMemberId(String memberId);
}
