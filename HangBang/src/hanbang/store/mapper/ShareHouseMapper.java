package hanbang.store.mapper;

import java.util.List;

import hanbang.domain.ShareHouse;

public interface ShareHouseMapper {

	int create(ShareHouse shareHouse);

	List<ShareHouse> retriveAll();

	ShareHouse retrive(int shareHouseId);

	int update(ShareHouse shareHouse);

	int delete(int shareHouseId);

	List<ShareHouse> retriveByMemberId(String memberId);

	List<ShareHouse> searchShareHouse(String searchWord);

	int report(int shareHouseId, String memberId);

	int deleteByMemberId(String membserId);

}
