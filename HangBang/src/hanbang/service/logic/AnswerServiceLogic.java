package hanbang.service.logic;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import hanbang.domain.Answer;
import hanbang.service.AnswerService;

@Service
public class AnswerServiceLogic implements AnswerService{

	@Override
	public boolean registerQuestion(Answer answer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Answer> findQuestion(int questionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyQuestion(Answer answer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeQuestionAnswer(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByQuestionId(int questionId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerReview(Answer answer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Answer> findReview(int reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyReview(Answer answer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeReviewAnswer(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByReviewId(int reviewId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByAnswerId(int answerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
