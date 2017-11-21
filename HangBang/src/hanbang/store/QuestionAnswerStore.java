package hanbang.store;

import java.util.List;

import hanbang.domain.Answer;

public interface QuestionAnswerStore {

	public int create(Answer answer);

	public List<Answer> retrive(int questionId);

	public int update(Answer answer);

	public int delete(String memberId);

	public int deleteByQuestionId(int questionId);

	public int deleteByAnswerId(int answerId);

}
