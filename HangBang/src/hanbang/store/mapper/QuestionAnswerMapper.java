package hanbang.store.mapper;

import java.util.List;

import hanbang.domain.Answer;

public interface QuestionAnswerMapper {

	int create(Answer answer);

	List<Answer> retrive(int questionId);

	int update(Answer answer);

	int delete(String memberId);

	int deleteByQuestionId(int questionId);

	int deleteByAnswerId(int answerId);

}
