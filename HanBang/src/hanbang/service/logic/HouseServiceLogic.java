package hanbang.service.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.House;
import hanbang.domain.PublicUsage;
import hanbang.service.HouseService;
import hanbang.store.HouseStore;
import hanbang.store.PublicUsageStore;
import hanbang.store.logic.HouseStoreLogic;

@Service
public class HouseServiceLogic implements HouseService {

	@Autowired
	private HouseStore houseStore;

	private int check;

	@Override
	public boolean register(House house) {
		check = houseStore.create(house);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 셰어하우스에서 조회
	@Override
	public House find(int houseId) {
		House house = houseStore.retrive(houseId);

		return house;
	}

	// 마이하우스에서 조회
	@Override
	public House findMyHouse(int houseId) {

		return houseStore.retriveMyHouse(houseId);
	}

	@Override
	public List<House> findByMemberId(String memberId) {

		return houseStore.retriveByMemberId(memberId);
	}

	@Override
	public boolean modify(House house) {

		check = houseStore.update(house);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean remove(int houseId) {

		check = houseStore.delete(houseId);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removeByMemberId(String memberId) {

		List<House> houses = new ArrayList<>();
		houses = houseStore.retriveByMemberId(memberId);

		int index = 0;
		for (House house : houses) {
			house = houses.get(index);
			int houseId = house.getHouseId();
			houseStore.deleteByMemberId(memberId);
			index++;
		}
		if (index == houses.size()) {
			return true;
		} else {
			return false;
		}
	}

}
