package hanbang.domain;

import java.util.List;

public class Question {
	
	private int questionId;
	private String writerId;
	private int shareHouseId;
	private int questionDate;
	private List<Integer> schedule;
	private int phoneNumber;
	private String questionContent;
	private List<Answer> answers;
	
	public Question() {
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}


	public List<Integer> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Integer> schedule) {
		this.schedule = schedule;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public int getShareHouseId() {
		return shareHouseId;
	}

	public void setShareHouseId(int shareHouseId) {
		this.shareHouseId = shareHouseId;
	}

	public int getQuestionDate() {
		return questionDate;
	}

	public void setQuestionDate(int questionDate) {
		this.questionDate = questionDate;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	
}
