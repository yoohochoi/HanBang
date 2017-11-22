package hanbang.service;

import java.util.List;

import hanbang.domain.ShareHouse;

public interface ShareHouseService {
	
	boolean register(ShareHouse shareHouse);
	List<ShareHouse> findAll();
	ShareHouse find(int shareHouseId);
	List<ShareHouse> findByMemberId(String memberId);
	List<ShareHouse> researchShareHouse(String searchWord);
	boolean modify(ShareHouse shareHouse);
	boolean notify(int shareHouseId, String memberId);
	boolean remove(int shareHouseId);
	boolean removeByMemberId(String memberId);
	boolean reportShareHouse(String memberId, int shareHouseId);

}
