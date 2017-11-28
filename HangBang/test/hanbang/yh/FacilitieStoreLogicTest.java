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

	@Test
	public void testCreate() {
		Facilitie fa = new Facilitie();
		fa.setExtraInfoId(1);
		fa.setFacilitie("wwww");
		store.create(fa);

		assertNotNull(fa);
		assertEquals("www", store.retriveAll(1).get(0).getFacilitie());
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

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

	@Test
	public void testRetrive() {
		fail("Not yet implemented");
	}

}
