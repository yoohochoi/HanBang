package hanbang.store;

import java.util.List;

import hanbang.domain.Question;

public interface QuestionStore {

	public int create(Question question);

	public List<Question> retriveByMemberId(String memberId);

	public List<Question> retriveByShareHouseId(int shareHouseId);

	public Question retrive(int questionId);

	public int update(Question question);

	public int delete(int questionId);

	public int deleteByMemberId(String memberId);

	public int deleteByShareHouse(int shareHouseId);

}
