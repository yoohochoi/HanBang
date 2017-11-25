package hanbang.service.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import hanbang.domain.ShareHouse;
import hanbang.service.ShareHouseService;

@Service
public class ShareHouseServiceLogic implements ShareHouseService{

	@Override
	public boolean register(ShareHouse shareHouse) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ShareHouse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShareHouse find(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShareHouse> findByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShareHouse> researchShareHouse(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(ShareHouse shareHouse) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notify(int shareHouseId, String memberId) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean reportShareHouse(String memberId, int shareHouseId) {
		// TODO Auto-generated method stub
		return false;
	}

}
