package hanbang.service;

import hanbang.domain.ExtraInfo;
import hanbang.domain.Facilitie;
import hanbang.domain.ProvidedGood;

public interface ExtraInfoService {

	boolean register(ExtraInfo extraInfo, Facilitie facilitie, ProvidedGood providedGood);

	ExtraInfo find(int shareHouse);

	boolean modify(ExtraInfo extraInfo, Facilitie facilitie, ProvidedGood providedGood);

	boolean deleteByShareHouse(int shareHouseId);

}
