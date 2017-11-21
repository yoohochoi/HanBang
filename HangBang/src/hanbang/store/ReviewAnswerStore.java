package hanbang.store;

import java.util.List;

import hanbang.domain.Answer;

public interface ReviewAnswerStore {

	public int create(Answer answer);

	public List<Answer> retrieve(int reviewId);

	public int update(Answer answer);

	public int delete(String memberId);

	public int deleteByReviewId(int reviewId);

	public int deleteByAnswerId(int answerId);

}
