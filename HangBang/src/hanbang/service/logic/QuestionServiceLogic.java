package hanbang.service.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import hanbang.domain.Question;
import hanbang.service.QuestionService;

@Service
public class QuestionServiceLogic implements QuestionService{

	@Override
	public boolean register(Question question) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Question find(int questionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> findByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> findByShareHouseId(int shareHouseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(Question question) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int questionID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByShareHouse(int shareHouseId) {
		// TODO Auto-generated method stub
		return false;
	}

}
