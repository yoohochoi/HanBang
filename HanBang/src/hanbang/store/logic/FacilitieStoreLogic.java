package hanbang.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import hanbang.domain.Facilitie;
import hanbang.store.FacilitieStore;
import hanbang.store.factory.SqlSessionFactoryProvider;
import hanbang.store.mapper.FacilitieMapper;
<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/suhyun
@Repository
public class FacilitieStoreLogic implements FacilitieStore {

	private SqlSessionFactory factory;

	public FacilitieStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public int create(Facilitie facilitie) {

		SqlSession session = factory.openSession();
		int check = 0;

		try {
			FacilitieMapper mapper = session.getMapper(FacilitieMapper.class);
			check = mapper.create(facilitie);
			session.commit();
		} finally {
			session.close();
		}

		return check;
	}

	// @Override
	// public int update(Facilitie facilitie) {
	// SqlSession session = factory.openSession();
	// int check = 0;
	//
	// try {
	// FacilitieMapper mapper = session.getMapper(FacilitieMapper.class);
	// check = mapper.update(facilitie);
	// session.commit();
	// } finally {
	// session.close();
	// }
	//
	// return check;
	// }

	@Override
	public int delete(int facilitieId) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			FacilitieMapper mapper = session.getMapper(FacilitieMapper.class);
			check = mapper.delete(facilitieId);
			session.commit();
		} finally {
			session.close();
		}

		return check;
	}

	@Override
	public int deleteByExtraInfo(int extraInfoId) {
		SqlSession session = factory.openSession();
		int check = 0;

		try {
			FacilitieMapper mapper = session.getMapper(FacilitieMapper.class);
			check = mapper.deleteByExtraInfo(extraInfoId);
			session.commit();
		} finally {
			session.close();
		}

		return check;
	}

	@Override
	public List<Facilitie> retriveAll(int extraInfoId) {
		SqlSession session = factory.openSession();
		List<Facilitie> facilities = null;

		try {
			FacilitieMapper mapper = session.getMapper(FacilitieMapper.class);
			facilities = mapper.retriveAll(extraInfoId);
		} finally {
			session.close();
		}

		return facilities;
	}

	@Override
	public Facilitie retrive(int facilitieId) {
		SqlSession session = factory.openSession();
		Facilitie facilitie = null;
		try {
			FacilitieMapper mapper = session.getMapper(FacilitieMapper.class);
			facilitie = mapper.retrive(facilitieId);
		} finally {
			session.close();
		}

		return null;
	}

}
