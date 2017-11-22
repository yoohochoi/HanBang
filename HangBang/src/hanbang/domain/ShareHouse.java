package hanbang.domain;

import java.util.List;

public class ShareHouse {
	
	private int shareHouseId;
	private String writerId;
	private int date;
	private String title;
	private String content;
	private House house;
	private EssentialInfo essentialInfo;
	private ExtraInfo extraInfo;
	private List<Review> reviews;
	private List<Room> rooms;
	
	
	public ShareHouse() {
	}


	public int getShareHouseId() {
		return shareHouseId;
	}


	public void setShareHouseId(int shareHouseId) {
		this.shareHouseId = shareHouseId;
	}


	public String getWriterId() {
		return writerId;
	}


	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}


	public int getDate() {
		return date;
	}


	public void setDate(int date) {
		this.date = date;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public House getHouse() {
		return house;
	}


	public void setHouse(House house) {
		this.house = house;
	}


	public EssentialInfo getEssentialInfo() {
		return essentialInfo;
	}


	public void setEssentialInfo(EssentialInfo essentialInfo) {
		this.essentialInfo = essentialInfo;
	}


	public ExtraInfo getExtraInfo() {
		return extraInfo;
	}


	public void setExtraInfo(ExtraInfo extraInfo) {
		this.extraInfo = extraInfo;
	}


	public List<Review> getReviews() {
		return reviews;
	}


	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}


	public List<Room> getRooms() {
		return rooms;
	}


	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
}
