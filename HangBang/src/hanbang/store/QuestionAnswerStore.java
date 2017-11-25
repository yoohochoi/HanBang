package hanbang.store;

import java.util.List;

import hanbang.domain.Answer;

public interface QuestionAnswerStore {

	public int create(Answer answer);

<<<<<<< HEAD
	public List<Answer> retrive(int questionId);
=======
	List<Answer> retrieveAll(int questionId);
	
	Answer retrieveByAnswerId(int answerId);
>>>>>>> refs/remotes/origin/master

	public int update(Answer answer);

	public int delete(String memberId);

	public int deleteByQuestionId(int questionId);

	public int deleteByAnswerId(int answerId);

}
