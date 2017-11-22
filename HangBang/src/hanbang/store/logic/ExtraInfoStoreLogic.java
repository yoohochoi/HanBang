package hanbang.store.logic;

import hanbang.domain.ExtraInfo;
import hanbang.store.ExtraInfoStore;
import hanbang.store.factory.SqlSessionFactoryProvider;

public class ExtraInfoStoreLogic implements ExtraInfoStore {

	private SqlSessionFactoryProvider factory;

	@Override
	public int create(ExtraInfo extraInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ExtraInfo retrive(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(ExtraInfo extraInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int extraInfoId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByShareHouse(int shareHouseId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
