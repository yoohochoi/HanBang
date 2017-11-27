package hanbang.sh;


import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

import hanbang.domain.Question;
import hanbang.service.QuestionService;
import hanbang.service.logic.QuestionServiceLogic;

public class QuestionServiceLogicTest {
	
	private QuestionService service;
	
	@Before
	public void setUp() {
		service = new QuestionServiceLogic();
	}

	@Test
	public void testRegister() {
		Question question = new Question();
		question.setWriterId("sh");
		question.setShareHouseId(1);
		question.setPhoneNumber("1234");
		question.setQuestionContent("test");
		question.setSchedule("33");
		service.register(question);
		assertNotNull(question);
	}

//	@Test
//	public void testFind() {
//		Question question = service.find(1);
//		assertEquals("sh", question.getWriterId());
//	}

//	@Test
//	public void testFindByMemberId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFindByShareHouseId() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testModify() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemove() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemoveByShareHouse() {
//		fail("Not yet implemented");
//	}

}
