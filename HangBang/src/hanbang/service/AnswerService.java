package hanbang.service;

import java.util.List;

import hanbang.domain.Answer;

public interface AnswerService {
	
	boolean registerQuestion(Answer answer);
	List<Answer> findQuestion(int questionId);
	boolean modifyQuestion(Answer answer);
	boolean removeQuestionAnswer(String memberId);
	boolean removeByQuestionId(int questionId);
	boolean registerReview(Answer answer);
	List<Answer> findReview(int reviewId);
	boolean modifyReview(Answer answer);
	boolean removeReviewAnswer(String memberId);
	boolean removeByReviewId(int reviewId);
	boolean removeByAnswerId(int answerId);

}
