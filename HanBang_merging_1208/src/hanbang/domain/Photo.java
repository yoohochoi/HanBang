package hanbang.domain;

public class Photo {

	private String photo_name;
	private String origin_name;
	private long photo_size;
	private int shareHouseId;
	private int photoId;

	public String getPhoto_name() {
		return photo_name;
	}

	public void setPhoto_name(String photo_name) {
		this.photo_name = photo_name;
	}

	public String getOrigin_name() {
		return origin_name;
	}

	public void setOrigin_name(String origin_name) {
		this.origin_name = origin_name;
	}

	public long getPhoto_size() {
		return photo_size;
	}

	public void setPhoto_size(long photo_size) {
		this.photo_size = photo_size;
	}

	public int getShareHouseId() {
		return shareHouseId;
	}

	public void setShareHouseId(int shareHouseId) {
		this.shareHouseId = shareHouseId;
	}

	public int getPhotoId() {
		return photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

}
