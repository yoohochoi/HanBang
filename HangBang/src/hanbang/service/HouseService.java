package hanbang.service;

import hanbang.domain.House;

public interface HouseService {
	
	boolean register(House house);
	House find(int houseId);
	boolean modify(House house);
	boolean remove(int houseId);
	boolean removeByMemberId(String memberId);

}
