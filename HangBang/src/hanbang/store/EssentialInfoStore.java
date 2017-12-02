package hanbang.store;

import hanbang.domain.EssentialInfo;

public interface EssentialInfoStore {

	public int create(EssentialInfo essentialInfo);

	public EssentialInfo retrive(int shareHouseId);

	public int update(EssentialInfo essentialInfo);

	public int delete(int essentialInfoId);

	public int deleteByShareHouse(int shareHouseId);

}
