package hanbang.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.House;
import hanbang.service.HouseService;
import hanbang.store.HouseStore;
import hanbang.store.logic.HouseStoreLogic;

@Service
public class HouseServiceLogic implements HouseService {

	@Autowired
	private HouseStore houseStore;
	private int check;

	public HouseServiceLogic() {
		houseStore = new HouseStoreLogic();
	}

	@Override
	public boolean register(House house) {
		check = houseStore.create(house);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public House find(int houseId) {
		return houseStore.retrive(houseId);
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
		check = houseStore.deleteByMemberId(memberId);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

}
