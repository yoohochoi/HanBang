package hanbang.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hanbang.domain.EssentialInfo;
import hanbang.domain.PublicUsage;
import hanbang.service.EssentialInfoService;
import hanbang.store.EssentialInfoStore;
import hanbang.store.PublicUsageStore;

@Service
public class EssentialInfoServiceLogic implements EssentialInfoService {

	@Autowired
	private EssentialInfoStore essentialStore;
	@Autowired
	private PublicUsageStore publicUsageStore;

	@Override
	public boolean register(EssentialInfo essentialInfo, List<PublicUsage> publicUsages) {
		int check = essentialStore.create(essentialInfo);
		int index = 0;
		if (check > 0) {
			for (PublicUsage publicUsage : publicUsages) {
				publicUsage = new PublicUsage();
				publicUsage = publicUsages.get(index);
				publicUsage.setEssentialInfoId(essentialInfo.getEssentialInfoId());
				publicUsageStore.create(publicUsage);
				index++;
			}
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
	public boolean modify(EssentialInfo essentialInfo, List<PublicUsage> publicUsages) {
		int essentialId = essentialInfo.getEssentialInfoId();
		int index = 0;

		EssentialInfo before = essentialStore.retrive(essentialInfo.getShareHouseId());
		publicUsageStore.deleteByEssentialInfo(essentialId);
		for (PublicUsage publicUsage : publicUsages) {
			publicUsage = new PublicUsage();
			publicUsage = publicUsages.get(index);
			publicUsage.setEssentialInfoId(essentialInfo.getEssentialInfoId());
			publicUsageStore.create(publicUsage);
			index++;
		}

		before.setPublicUsage(publicUsages);
		int check = essentialStore.update(before);
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
