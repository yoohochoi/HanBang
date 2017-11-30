package hanbang.domain;

public class Room {

	private int roomId;
	private int shareHouseId;
	private String sex;
	private String roomArea;
	private int bathroom;
	private String option;
	private int moveDate;
	private int deposit;
	private int monthlyFee;
	private String availability;
	private int leastStayDays;

	public Room() {
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getShareHouseId() {
		return shareHouseId;
	}

	public void setShareHouseId(int shareHouseId) {
		this.shareHouseId = shareHouseId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public int getMoveDate() {
		return moveDate;
	}

	public void setMoveDate(int moveDate) {
		this.moveDate = moveDate;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(int monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public int getLeastStayDays() {
		return leastStayDays;
	}

	public void setLeastStayDays(int leastStayDays) {
		this.leastStayDays = leastStayDays;
	}

}
