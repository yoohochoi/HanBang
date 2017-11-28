package hanbang.store.mapper;

import java.util.List;

import hanbang.domain.PublicUsage;

public interface PublicUsageMapper {

	int create(PublicUsage publicUsage);
	
	int update(PublicUsage publicUsage);
	
	int delete(int publicUsageId);

	int deleteByHouseId(int houseId);
	
	PublicUsage retrive(int publicUseageId);

	List<PublicUsage> retriveAll(int houseId);
}
