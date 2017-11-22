package hanbang.store.mapper;

import java.util.List;

import hanbang.domain.Answer;

public interface QuestionAnswerMapper {
	
	public int create(Answer answer);

	public List<Answer> retrive(int questionId);

	public int update(Answer answer);

	public int delete(String memberId);

	public int deleteByQuestionId(int questionId);

	public int deleteByAnswerId(int answerId);

}
