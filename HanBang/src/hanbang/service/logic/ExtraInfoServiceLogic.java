package hanbang.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.ExtraInfo;
import hanbang.domain.Facilitie;
import hanbang.domain.ProvidedGood;
import hanbang.domain.PublicUsage;
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
	public boolean register(ExtraInfo extraInfo, List<Facilitie> facilities, List<ProvidedGood> providedGoods) {
		int check = extraInfoStore.create(extraInfo);
		int index = 0;
		if (check > 0) {
			for (Facilitie facilitie : facilities) {
				facilitie = new Facilitie();
				facilitie = facilities.get(index);
				facilitie.setExtraInfoId(extraInfo.getExtraInfoId());
				facilitieStore.create(facilitie);
				index++;
			}
			index = 0;
			for (ProvidedGood providedGood : providedGoods) {
				providedGood = new ProvidedGood();
				providedGood = providedGoods.get(index);
				providedGood.setExtraInfoId(extraInfo.getExtraInfoId());
				providedGoodStore.create(providedGood);
				index++;
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ExtraInfo find(int shareHouseId) {
		ExtraInfo extraInfo = extraInfoStore.retrive(shareHouseId);

		int extraId = extraInfo.getExtraInfoId();

		extraInfo.setFacilities(facilitieStore.retriveAll(extraId));
		extraInfo.setProvidedGoods(providedGoodStore.retriveAll(extraId));
		return extraInfo;
	}

	@Override
	public boolean modify(ExtraInfo extraInfo, List<Facilitie> facilities, List<ProvidedGood> providedGoods) {

		int extraId = extraInfo.getExtraInfoId();
		int index = 0;
		
		ExtraInfo before = extraInfoStore.retrive(extraInfo.getShareHouseId());
		facilitieStore.deleteByExtraInfo(extraId);
		providedGoodStore.deleteByExtraInfo(extraId);
		for (Facilitie facilitie : facilities) {
			facilitie = new Facilitie();
			facilitie = facilities.get(index);
			facilitie.setExtraInfoId(extraInfo.getExtraInfoId());
			facilitieStore.create(facilitie);
			index++;
		}
		index = 0;
		for (ProvidedGood providedGood : providedGoods) {
			providedGood = new ProvidedGood();
			providedGood = providedGoods.get(index);
			providedGood.setExtraInfoId(extraInfo.getExtraInfoId());
			providedGoodStore.create(providedGood);
			index++;
		}

		before.setFacilities(facilities);
		before.setProvidedGoods(providedGoods);
		int check = extraInfoStore.update(extraInfo);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteByShareHouse(int shareHouseId) {

		int check = extraInfoStore.deleteByShareHouse(shareHouseId);

		ExtraInfo extraInfo = extraInfoStore.retrive(shareHouseId);
		int extraId = extraInfo.getExtraInfoId();
		if (check > 0) {
			facilitieStore.deleteByExtraInfo(extraId);
			providedGoodStore.deleteByExtraInfo(extraId);

			return true;
		} else {

			return false;
		}
	}

}
