package hanbang.service;

import java.util.List;

import hanbang.domain.Member;

public interface MemberService {
	
	boolean register(Member member);
	List<Member> findAll();
	Member find(String memberId);
	boolean modify(Member member);
	boolean remove(String memberId);

}
