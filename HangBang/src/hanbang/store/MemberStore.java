package hanbang.store;

import java.util.List;

import hanbang.domain.Member;

public interface MemberStore {

	public int create(Member member);

	public List<Member> retriveAll();

	public Member retrive(String memberId);

	public int update(Member member);

	public int delete(String memberId);

}
