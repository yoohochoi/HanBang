package hanbang.store.mapper;

import java.util.List;

import hanbang.domain.PublicUsage;

public interface PublicUsageMapper {

	int create(PublicUsage publicUsage);

	int deleteByHouseId(int houseId);

	int delete(int publicUsageId);

	List<PublicUsage> retriveAll(int houseId);
}
