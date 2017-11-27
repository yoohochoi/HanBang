package hanbang.sr;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import hanbang.domain.PublicUsage;
import hanbang.store.PublicUsageStore;
import hanbang.store.logic.PublicUsageStoreLogic;

public class PublicUsageStoreLogicTest {
	
	private PublicUsageStore store;
	
	@Before
	public void setUp() {
		store = new PublicUsageStoreLogic();
	}

	@Test
	public void testCreate() {
		PublicUsage pub = new PublicUsage();
		pub.setHouseId(1);
		pub.setPublicUsage("tv");
		pub.setPublicUsageId(1);
		store.create(pub);
	}

//	@Test
//	public void testDeleteByHouseId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDelete() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRetriveAll() {
//		fail("Not yet implemented");
//	}

}
