package hanbang.service;

import java.util.List;

import hanbang.domain.House;
import hanbang.domain.PublicUsage;

public interface HouseService {
	
	boolean register(House house, List<PublicUsage> publicUsages);
	House find(int houseId);
	House findMyHouse(int houseId);
	public List<House> findByMemberId(String memberId);
	boolean modify(House house,  List<PublicUsage> publicUsages);
	boolean remove(int houseId);
	boolean removeByMemberId(String memberId);

}
