package hanbang.yh;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import hanbang.domain.Facilitie;
import hanbang.store.FacilitieStore;
import hanbang.store.logic.FacilitieStoreLogic;

public class FacilitieStoreLogicTest {

	private FacilitieStore store;

	@Before
	public void setUp() {
		store = new FacilitieStoreLogic();
	}

	// @Test
	// public void testCreate() {
	// Facilitie fa = new Facilitie();
	// fa.setExtraInfoId(500);
	// fa.setFacilities("www");
	// store.create(fa);
	//
	// assertNotNull(fa);
	// assertEquals("www", store.retriveAll(500).get(0).getFacilities());
	// }


	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByExtraInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetriveAll() {
		fail("Not yet implemented");
	}

	// @Test
	// public void testRetrive() {
	// Facilitie fa = store.retrive(500);
	// assertNotNull(fa);
	// assertEquals("www", fa.getFacilities());
	// }

}
