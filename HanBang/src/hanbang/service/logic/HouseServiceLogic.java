package hanbang.service.logic;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.core.ApplicationContext;
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
	@Autowired
	private PublicUsageStore publicStore;

	private int check;


	@Override
	public boolean register(House house, List<PublicUsage> publicUsages) {
		check = houseStore.create(house);
		int index = 0;
		if (check > 0) {
			for (PublicUsage publicUsage : publicUsages) {
				publicUsage = new PublicUsage();
				publicUsage = publicUsages.get(index);
				publicUsage.setHouseId(house.getHouseId());
				publicStore.create(publicUsage);
				index++;
			}
			return true;
		} else {
			return false;
		}
	}

	// 셰어하우스에서 조회
	@Override
	public House find(int houseId) {
		House house = houseStore.retrive(houseId);

		house.setPublicUsage(publicStore.retriveAll(houseId));

		return house;
	}

	// 마이하우스에서 조회
	@Override
	public House findMyHouse(int houseId) {
		House house = houseStore.retriveMyHouse(houseId);
		house.setPublicUsage(publicStore.retriveAll(houseId));

		return house;
	}

	@Override
	public List<House> findByMemberId(String memberId) {

		return houseStore.retriveByMemberId(memberId);
	}

	@Override
	public boolean modify(House house, List<PublicUsage> publicUsages) {

		List<PublicUsage> originUsages = publicStore.retriveAll(house.getHouseId());
		House before = houseStore.retrive(house.getHouseId());
		
		int size = originUsages.size();

		if (publicUsages.size() == size) {
			int index = 0;
			for (PublicUsage publicUsage : publicUsages) {
				publicUsage = publicUsages.get(index);
				publicUsage.setPublicUsage(publicUsages.get(index).toString());
				publicStore.update(publicUsage);
				index++;
			}
			before.setPublicUsage(publicUsages);
			check = houseStore.update(house);
		} else if (publicUsages.size() < size) {
			int index = 0;
			for (PublicUsage publicUsage : originUsages) {
				if (publicUsages.get(index).equals("")) {
					publicStore.delete(publicUsage.getPublicUsageId());
				} else {
					publicUsage = publicUsages.get(index);
					publicUsage.setPublicUsage(publicUsages.get(index).toString());
					publicStore.update(publicUsage);
				}
				index++;
			}
			before.setPublicUsage(publicUsages);
			check = houseStore.update(house);
		} else if (publicUsages.size() > size) {
			int index = 0;
			for (PublicUsage publicUsage : publicUsages) {
				if (originUsages.get(index).equals("")) {
					publicUsage = new PublicUsage();
					publicUsage = publicUsages.get(index);
					publicUsage.setHouseId(house.getHouseId());
					publicStore.create(publicUsage);
				} else {
					publicUsage = publicUsages.get(index);
					publicUsage.setPublicUsage(publicUsages.get(index).toString());
					publicStore.update(publicUsage);
				}
				index++;
			}
			before.setPublicUsage(publicUsages);
			check = houseStore.update(house);
		}

		if (check > 0)

		{
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean remove(int houseId) {

		publicStore.deleteByHouseId(houseId);
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
			publicStore.deleteByHouseId(houseId);
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
