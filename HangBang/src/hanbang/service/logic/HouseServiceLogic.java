package hanbang.service.logic;

import org.springframework.stereotype.Service;

import hanbang.domain.House;
import hanbang.service.HouseService;

@Service
public class HouseServiceLogic implements HouseService{

	@Override
	public boolean register(House house) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public House find(int houseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(House house) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int houseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
