package hanbang.store;

import java.util.List;

import hanbang.domain.Answer;

public interface ReviewAnswerStore {

	int create(Answer answer);

	List<Answer> retrieve(int reviewId);

	int update(Answer answer);

	int delete(String memberId);

	int deleteByReviewId(int reviewId);

	int deleteByAnswerId(int answerId);

}
