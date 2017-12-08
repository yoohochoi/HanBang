package hanbang.service;

import java.util.List;

import hanbang.domain.EssentialInfo;
import hanbang.domain.PublicUsage;

public interface EssentialInfoService {

	boolean register(EssentialInfo essentialInfo, List<PublicUsage> publicUsages);

	EssentialInfo find(int shareHouseId);

	boolean modify(EssentialInfo essentialInfo, List<PublicUsage> publicUsages);

	boolean deleteByShareHouse(int shareHouseId);

}
