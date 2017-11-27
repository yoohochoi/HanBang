package hanbang.sr;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import hanbang.domain.House;
import hanbang.store.HouseStore;
import hanbang.store.logic.HouseStoreLogic;

public class HouseStoreLogicTest {
	
	private HouseStore store;
	
	@Before
	public void setUp() {
		store = new HouseStoreLogic();
	}

	@Test
	public void testCreate() {
		House house = new House();
		house.setAddress("서울");
		house.setBathrooms(1);
		house.setMemberId("sora123");
//		house.setPhotos("photos");
//		house.setPublicUsage("dsdd");
		house.setWholeArea("ss");
		house.setHouseId(1);
		house.setRooms(6);
		
		store.create(house);
		assertNotNull(house);
	}
//
//	@Test
//	public void testRetrive() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRetriveByMemberId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdate() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDelete() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteByMemberId() {
//		fail("Not yet implemented");
//	}

}
