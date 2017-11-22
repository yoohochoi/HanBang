package hanbang.sh;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

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
		question.setPhoneNumber(1234);
		question.setQuestionContent("test");
		/*List<Integer> schedule = new ArrayList<>();
		schedule.add(17);
		schedule.add(11);
		schedule.add(22);
		question.setSchedule(schedule);*/
		service.register(question);
		assertNotNull(question);
	}

	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByMemberId() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByShareHouseId() {
		fail("Not yet implemented");
	}

	@Test
	public void testModify() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveByShareHouse() {
		fail("Not yet implemented");
	}

}
