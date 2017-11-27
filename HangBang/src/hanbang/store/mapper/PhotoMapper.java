package hanbang.store.mapper;

import java.util.List;

import hanbang.domain.Photo;

public interface PhotoMapper {

	int create(Photo photo);

	int update(Photo photo);

	int deleteByShareHouse(int shareHouseId);

	int delete(int photoId);

	List<Photo> retriveAll(int shareHouseId);

}
