package hanbang.service.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import hanbang.domain.Member;
import hanbang.service.MemberService;

@Service
public class MemberServiceLogic implements MemberService{

	@Override
	public boolean register(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member find(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login(String memberId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
