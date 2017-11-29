package hanbang.store;

import java.util.List;

import hanbang.domain.Facilitie;

public interface FacilitieStore {

	int create(Facilitie facilitie);

	// int update(Facilitie facilitie);

	int delete(int facilitieId);

	int deleteByExtraInfo(int extraInfoId);

	Facilitie retrive(int facilitieId);

	List<Facilitie> retriveAll(int extraInfoId);

}
