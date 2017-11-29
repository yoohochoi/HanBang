package hanbang.service.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.ExtraInfo;
import hanbang.domain.Facilitie;
import hanbang.domain.ProvidedGood;
import hanbang.service.ExtraInfoService;
import hanbang.store.ExtraInfoStore;
import hanbang.store.FacilitieStore;
import hanbang.store.ProviededGoodStore;

@Service
public class ExtraInfoServiceLogic implements ExtraInfoService {

	@Autowired
	private ExtraInfoStore extraInfoStore;
	@Autowired
	private FacilitieStore facilitieStore;
	@Autowired
	private ProviededGoodStore providedGoodStore;

	@Override
	public boolean register(ExtraInfo extraInfo, Facilitie facilitie, ProvidedGood providedGood) {
		return true;
	}

	@Override
	public ExtraInfo find(int shareHouse) {
		return null;
	}

	@Override
	public boolean modify(ExtraInfo extraInfo, Facilitie facilitie, ProvidedGood providedGood) {
		return false;
	}

	@Override
	public boolean deleteByShareHouse(int shareHouseId) {
		return false;
	}

}
