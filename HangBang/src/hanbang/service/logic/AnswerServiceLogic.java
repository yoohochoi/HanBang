package hanbang.service.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import hanbang.domain.Answer;
import hanbang.service.AnswerService;
import hanbang.store.QuestionAnswerStore;
import hanbang.store.ReviewAnswerStore;
import hanbang.store.logic.QuestionAnswerStoreLogic;
import hanbang.store.logic.ReviewAnswerStoreLogic;

@Service
public class AnswerServiceLogic implements AnswerService{
	
	private QuestionAnswerStore qStore;
	private ReviewAnswerStore rStore;
	
	public AnswerServiceLogic() {
		qStore = new QuestionAnswerStoreLogic();
		rStore = new ReviewAnswerStoreLogic();
	}

	@Override
	public boolean registerQuestion(Answer answer) {
		int check = 0;
		check = qStore.create(answer);
		if(check == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public List<Answer> findQuestion(int questionId) {
		return qStore.retrive(questionId);
	}

	@Override
	public boolean modifyQuestion(Answer answer) {
		int check = qStore.update(answer);
		if(check == 0) {
			return false;
		} else {
			 return true;
		}
	}

	@Override
	public boolean removeQuestionAnswer(String memberId) {
		int check = qStore.delete(memberId);
		if(check == 0) {
			return false;
		} else {
			 return true;
		}
	}

	@Override
	public boolean removeByQuestionId(int questionId) {
		int check = qStore.deleteByQuestionId(questionId);
		if(check == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean registerReview(Answer answer) {
		int check = 0;
		check = rStore.create(answer);
		if(check == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public List<Answer> findReview(int reviewId) {
		return null;
	}

	@Override
	public boolean modifyReview(Answer answer) {
		return false;
	}

	@Override
	public boolean removeReviewAnswer(String memberId) {
		return false;
	}

	@Override
	public boolean removeByReviewId(int reviewId) {
		return false;
	}

	@Override
	public boolean removeByAnswerId(int answerId) {
		return false;
	}

}
