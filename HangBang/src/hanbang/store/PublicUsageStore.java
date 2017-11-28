package hanbang.store;

import java.util.List;

import hanbang.domain.PublicUsage;

public interface PublicUsageStore {

	int create(PublicUsage publicUsage);

//	int update(PublicUsage publicUsage);

	int deleteByHouseId(int houseId);
	
	int delete(int publicUsageId);

	List<PublicUsage> retriveAll(int houseId);
}
