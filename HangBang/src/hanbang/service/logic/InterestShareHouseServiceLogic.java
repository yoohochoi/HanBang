package hanbang.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.ShareHouse;
import hanbang.service.InterestShareHouseService;
import hanbang.store.InterestShareHouseStore;

@Service
public class InterestShareHouseServiceLogic implements InterestShareHouseService {

	@Autowired
	private InterestShareHouseStore interestHouse;

	@Override
	public boolean register(String memberId, int shareHouseId) {
		int check = interestHouse.create(shareHouseId);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<ShareHouse> findAll(String memberId) {
		return interestHouse.retriveAll(memberId);
	}

	@Override
	public boolean remove(int shareHouseId) {
		int check = interestHouse.delete(shareHouseId);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removeByMemberId(String memberId) {
		int check = interestHouse.deleteByMemberId(memberId);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removeInterestShareHouse(String memberId, int shareHouseId) {
		int check = interestHouse.deleteInterestShareHouse(memberId, shareHouseId);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}
}
