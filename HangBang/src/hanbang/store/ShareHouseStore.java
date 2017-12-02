package hanbang.store;

import java.util.List;

import hanbang.domain.ShareHouse;

public interface ShareHouseStore {

	public int create(ShareHouse shareHouse);

	public List<ShareHouse> retriveAll();

	public ShareHouse retrive(int shareHouseId);

	public int update(ShareHouse shareHouse);

	public int delete(int shareHouseId);

	public List<ShareHouse> retriveByMemberId(String memberId);

	public List<ShareHouse> searchShareHouse(String searchWord);

	public int report(int shareHouseId, String memberId);

	public int deleteByMemberId(String memberId);

}
