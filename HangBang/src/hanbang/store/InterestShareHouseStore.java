package hanbang.store;

import java.util.List;

import hanbang.domain.ShareHouse;

public interface InterestShareHouseStore {

	public int create(int shareHouseId);

	public List<ShareHouse> retriveAll(String memberId);

	public int delete(int shareHouseId);

	public int deleteByMemberId(String memberId);

	public int deleteInterestShareHouse(String memberId, int shareHouseId);

}
