package hanbang.store;

import hanbang.domain.ExtraInfo;

public interface ExtraInfoStore {

	public int create(ExtraInfo extraInfo);

	public ExtraInfo retrive(int shareHouseId);

	public int update(ExtraInfo extraInfo);

	public int delete(int extraInfoId);

	public int deleteByShareHouse(int shareHouseId);

}
