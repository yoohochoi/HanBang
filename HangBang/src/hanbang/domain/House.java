package hanbang.domain;

import java.util.List;

public class House {
	
	private int houseId;
	private String memberId;
	private String address;
	private String wholeArea;
	private List<String> publicUsage;
	private int bathrooms;
	private int rooms;
	
	public House() {
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWholeArea() {
		return wholeArea;
	}

	public void setWholeArea(String wholeArea) {
		this.wholeArea = wholeArea;
	}

	public List<String> getPublicUsage() {
		return publicUsage;
	}

	public void setPublicUsage(List<String> publicUsage) {
		this.publicUsage = publicUsage;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
}
