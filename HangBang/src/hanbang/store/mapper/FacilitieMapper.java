package hanbang.store.mapper;

import java.util.List;

import hanbang.domain.Facilitie;

public interface FacilitieMapper {

	int create(Facilitie facilitie);

	int update(Facilitie facilitie);

	int delete(int facilitieId);

	int deleteByExtraInfo(int extraInfoId);

	List<Facilitie> retriveAll(int extraInfoId);

}
