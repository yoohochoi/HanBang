package hanbang.store.mapper;

import java.util.List;

import hanbang.domain.ShareHouse;

public interface InterestShareHouseMapper {
	
	int create(int shareHouseId);

	List<ShareHouse> retriveAll(String memberId);

	int delete(int shareHouseId);

	int deleteByMemberId(String memberId);

	int deleteInterestShareHouse(String memberId, int shareHouseId);


}
