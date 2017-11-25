package hanbang.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import hanbang.domain.Photo;
import hanbang.store.PhotoStore;
import hanbang.store.factory.SqlSessionFactoryProvider;
import hanbang.store.mapper.PhotoMapper;

public class PhotoStoreLogic implements PhotoStore {

	private SqlSessionFactory factory;

	public PhotoStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public int create(Photo photo) {

		SqlSession session = factory.openSession();
		int check = 0;

		try {
			PhotoMapper mapper = session.getMapper(PhotoMapper.class);
			check = mapper.create(photo);
			session.commit();
		} finally {
			session.close();
		}
		return check;
	}

	@Override
	public int update(Photo photo) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			PhotoMapper mapper = session.getMapper(PhotoMapper.class);
			check = mapper.update(photo);
			session.commit();
		} finally {
			session.close();
		}
		return check;
	}

	@Override
	public int deleteByShareHouse(int shareHouseId) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			PhotoMapper mapper = session.getMapper(PhotoMapper.class);
			check = mapper.deleteByShareHouse(shareHouseId);
			session.commit();
		} finally {
			session.close();
		}
		return check;
	}

	@Override
	public int delete(int photoId) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			PhotoMapper mapper = session.getMapper(PhotoMapper.class);
			check = mapper.delete(photoId);
			session.commit();
		} finally {
			session.close();
		}
		return check;
	}

	@Override
	public List<Photo> retriveAll(int shareHouseId) {
		SqlSession session = factory.openSession();
		List<Photo> photos = null;
		try {
			PhotoMapper mapper = session.getMapper(PhotoMapper.class);
			photos = mapper.retriveAll(shareHouseId);
		} finally {
			session.close();
		}
		return photos;
	}

}
