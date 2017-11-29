package hanbang.service.logic;

import org.springframework.beans.factory.annotation.Autowired;

import hanbang.domain.EssentialInfo;
import hanbang.service.EssentialInfoService;
import hanbang.store.EssentialInfoStore;

public class EssentialInfoServiceLogic implements EssentialInfoService {

	@Autowired
	private EssentialInfoStore essentialStore;

	@Override
	public boolean register(EssentialInfo essentialInfo) {
		int check = essentialStore.create(essentialInfo);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public EssentialInfo find(int shareHouseId) {
		return essentialStore.retrive(shareHouseId);
	}

	@Override
	public boolean modify(EssentialInfo essentialInfo) {
		int check = essentialStore.update(essentialInfo);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteByShareHouse(int shareHouseId) {
		int check = essentialStore.deleteByShareHouse(shareHouseId);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

}
