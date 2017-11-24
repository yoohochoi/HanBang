package hanbang.domain;

import java.util.List;

public class Question {
	
	private int questionId;
	private String writerId;
	private String businessMemberId;
	private int date;
	private List<Integer> schedule;
	private int phoneNumber;
	private String content;
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

	public String getBusinessMemberId() {
		return businessMemberId;
	}

	public void setBusinessMemberId(String businessMemberId) {
		this.businessMemberId = businessMemberId;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
}
