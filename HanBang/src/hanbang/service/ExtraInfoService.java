package hanbang.service;

import java.util.List;

import hanbang.domain.ExtraInfo;
import hanbang.domain.Facilitie;
import hanbang.domain.ProvidedGood;

public interface ExtraInfoService {

	boolean register(ExtraInfo extraInfo, List<Facilitie> facilities);

	ExtraInfo find(int shareHouseId);

	boolean modify(ExtraInfo extraInfo, List<Facilitie> facilities);

	boolean deleteByShareHouse(int shareHouseId);

}
