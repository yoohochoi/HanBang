package hanbang.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import hanbang.domain.Member;
import hanbang.store.MemberStore;
import hanbang.store.factory.SqlSessionFactoryProvider;
import hanbang.store.mapper.MemberMapper;

public class MemberStoreLogic implements MemberStore {

	private SqlSessionFactory factory;
	private int check = 0;

	public MemberStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();

	}

	@Override
	public int create(Member member) {
		SqlSession session = factory.openSession();
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			check = mapper.create(member);
			session.commit();
		} finally {
			session.close();
		}

		return check;

	}

	@Override
	public List<Member> retriveAll() {
		SqlSession session = factory.openSession();
		List<Member> list = null;

		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			list = mapper.retriveAll();

		} finally {
			session.close();
		}

		return list;
	}

	@Override
	public Member retrive(String memberId) {
		SqlSession session = factory.openSession();
		Member member;

		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			member = mapper.retrive(memberId);
		} finally {
			session.close();
		}
		return member;
	}

	@Override
	public int update(Member member) {
		SqlSession session = factory.openSession();

		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			mapper.update(member);
			session.commit();
		} finally {
			session.close();
		}
		return check;
	}

	@Override
	public int delete(String memberId) {
		SqlSession session = factory.openSession();

		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			mapper.delete(memberId);
			session.commit();
		} finally {
			session.close();
		}

		return check;
	}

}
