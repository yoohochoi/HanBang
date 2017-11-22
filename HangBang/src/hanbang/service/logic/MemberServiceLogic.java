package hanbang.service.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import hanbang.domain.House;
import hanbang.domain.Member;
import hanbang.domain.ShareHouse;
import hanbang.service.MemberService;
import hanbang.store.HouseStore;
import hanbang.store.MemberStore;
import hanbang.store.ReviewStore;
import hanbang.store.ShareHouseStore;
import hanbang.store.logic.HouseStoreLogic;
import hanbang.store.logic.MemberStoreLogic;
import hanbang.store.logic.ReviewStoreLogic;
import hanbang.store.logic.ShareHouseStoreLogic;

@Service
public class MemberServiceLogic implements MemberService {

	private MemberStore memberStore;
	private HouseStore houseStore;
	private ShareHouseStore shareHouseStore;
	private ReviewStore reviewStore;

	private int check;

	public MemberServiceLogic() {
		memberStore = new MemberStoreLogic();
		houseStore = new HouseStoreLogic();
		shareHouseStore = new ShareHouseStoreLogic();
		reviewStore = new ReviewStoreLogic();
	}

	@Override
	public boolean register(Member member) {

		check = memberStore.create(member);

		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Member> findAll() {
	
		return memberStore.retriveAll();
	}

	@Override
	public Member find(String memberId) {

		return memberStore.retrive(memberId);
	}

	@Override
	public boolean modify(Member member) {
		check = memberStore.update(member);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean remove(String memberId) {
		check = memberStore.delete(memberId);
		if (check > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean login(String memberId, String password) {

		return false;
	}

}
