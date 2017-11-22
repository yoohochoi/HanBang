package hanbang.store.logic;

import java.util.List;

import hanbang.domain.ShareHouse;
import hanbang.store.ShareHouseStore;
import hanbang.store.factory.SqlSessionFactoryProvider;

public class ShareHouseStoreLogic implements ShareHouseStore {

	private SqlSessionFactoryProvider factory;

	@Override
	public int create(ShareHouse shareHouse) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ShareHouse> retriveAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShareHouse retrive(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(ShareHouse shareHouse) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int shareHouseId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ShareHouse> retriveByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShareHouse> searchShareHouse(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int report(int shareHouseId, String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
