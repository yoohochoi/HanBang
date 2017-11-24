package hanbang.store;

import java.util.List;

import hanbang.domain.ShareHouse;

public interface InterestShareHouseStore {

	int create(int shareHouseId);

	List<ShareHouse> retriveAll(String memberId);

	int delete(int shareHouseId);

	int deleteByMemberId(String memberId);

	int deleteInterestShareHouse(String memberId, int shareHouseId);

}
