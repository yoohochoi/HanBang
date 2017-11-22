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

	public MemberStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();

	}

	@Override
	public int create(Member member) {
		SqlSession session = SqlSessionFactoryProvider.getSqlSessionFactory().openSession();
		int check;
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			check = mapper.create(member);
			session.commit();
		} catch (Exception e) {
			session.commit();
		}

		return 0;
	}

	@Override
	public List<Member> retriveAll() {
		SqlSession session = SqlSessionFactoryProvider.getSqlSessionFactory().openSession();
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
		SqlSession session = SqlSessionFactoryProvider.getSqlSessionFactory().openSession();
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
		SqlSession session = SqlSessionFactoryProvider.getSqlSessionFactory().openSession();

		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			mapper.update(member);
		} finally {
			session.close();
		}

		return 0;
	}

	@Override
	public int delete(String memberId) {
SqlSession session = SqlSessionFactoryProvider.getSqlSessionFactory().openSession();
		
//		try {
//			MemberMapper mapper = session.getMapper(MemberMapper.class);
//		
//		}
//		
		
		return 0;
	}

}
