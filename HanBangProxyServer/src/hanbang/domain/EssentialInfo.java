package hanbang.domain;

public class EssentialInfo {
	
	private String sex;
	private String floorTotalFloor;
	private String parking;
	private boolean lift;
	private int managementFee;
	private String buildingType;
	
	public EssentialInfo() {
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public int getManagementFee() {
		return managementFee;
	}

	public void setManagementFee(int managementFee) {
		this.managementFee = managementFee;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
}