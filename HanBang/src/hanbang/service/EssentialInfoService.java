package hanbang.service;

import hanbang.domain.EssentialInfo;

public interface EssentialInfoService {
	
	boolean register(EssentialInfo essentialInfo);

	EssentialInfo find(int shareHouseId);

	boolean modify(EssentialInfo essentialInfo);

	boolean deleteByShareHouse(int shareHouseId);


}
