package hanbang.domain;

import java.util.List;

public class EssentialInfo {

	private int essentialInfoId;
	private int shareHouseId;
	private String floorTotalFloor;
	private String parking;
	private String lift;
	private String buildingType;
	private List<PublicUsage> publicUsage;

	public EssentialInfo() {
	}

	public int getEssentialInfoId() {
		return essentialInfoId;
	}

	public void setEssentialInfoId(int essentialInfoId) {
		this.essentialInfoId = essentialInfoId;
	}

	public int getShareHouseId() {
		return shareHouseId;
	}

	public void setShareHouseId(int shareHouseId) {
		this.shareHouseId = shareHouseId;
	}

	public String getFloorTotalFloor() {
		return floorTotalFloor;
	}

	public void setFloorTotalFloor(String floorTotalFloor) {
		this.floorTotalFloor = floorTotalFloor;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getLift() {
		return lift;
	}

	public void setLift(String lift) {
		this.lift = lift;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public List<PublicUsage> getPublicUsage() {
		return publicUsage;
	}

	public void setPublicUsage(List<PublicUsage> publicUsage) {
		this.publicUsage = publicUsage;
	}
}