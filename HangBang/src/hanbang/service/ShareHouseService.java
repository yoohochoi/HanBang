package hanbang.service;

import java.util.List;

import hanbang.domain.EssentialInfo;
import hanbang.domain.ExtraInfo;
import hanbang.domain.House;
import hanbang.domain.Room;
import hanbang.domain.ShareHouse;

public interface ShareHouseService {

	boolean register(ShareHouse shareHouse, EssentialInfo essentialInfo, ExtraInfo extraInfo, List<Room> rooms,
			int houseId, House house);

	List<ShareHouse> findAll();

	ShareHouse find(int shareHouseId);

	List<ShareHouse> findByMemberId(String memberId);

	List<ShareHouse> researchShareHouse(String searchWord);

	boolean modify(ShareHouse shareHouse, EssentialInfo essentialInfo, ExtraInfo extraInfo, List<Room> rooms,
			House house);

	boolean notify(int shareHouseId, String memberId);

	boolean remove(int shareHouseId);

	boolean removeByMemberId(String memberId);

}
