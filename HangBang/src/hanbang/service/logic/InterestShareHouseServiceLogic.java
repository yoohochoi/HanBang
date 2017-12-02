package hanbang.service.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import hanbang.domain.ShareHouse;
import hanbang.service.InterestShareHouseService;

@Service
public class InterestShareHouseServiceLogic implements InterestShareHouseService{

	@Override
	public boolean register(String memberId, int shareHouseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ShareHouse> findAll(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int shareHouseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeInterestShareHouse(String memberId, int shareHouseId) {
		// TODO Auto-generated method stub
		return false;
	}

}
