package hanbang.store.logic;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import hanbang.domain.EssentialInfo;
import hanbang.store.EssentialInfoStore;
import hanbang.store.factory.SqlSessionFactoryProvider;

@Repository
public class EssentialInfoStoreLogic implements EssentialInfoStore{
	
	private SqlSessionFactory factory;

	public EssentialInfoStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	@Override
	public int create(EssentialInfo essentialInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EssentialInfo retrive(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(EssentialInfo essentialInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int essentialInfoId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByShareHouse(int shareHouseId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
