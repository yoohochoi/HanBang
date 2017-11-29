package hanbang.domain;

import java.util.List;

public class ExtraInfo {

	private int extraInfoId;
	private int shareHouseId;
	private String pet;
	private String smoke;
	private List<Facilitie> facilities;
	private List<ProvidedGood> providedGoods;
	private String heatingSystem;

	public ExtraInfo() {
	}

	public int getExtraInfoId() {
		return extraInfoId;
	}

	public void setExtraInfoId(int extraInfoId) {
		this.extraInfoId = extraInfoId;
	}

	public int getShareHouseId() {
		return shareHouseId;
	}

	public void setShareHouseId(int shareHouseId) {
		this.shareHouseId = shareHouseId;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	public String getPet() {
		return pet;
	}

	public void setSmoke(String smoke) {
		this.smoke = smoke;
	}

	public String getSmoke() {
		return smoke;
	}


	public List<Facilitie> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<Facilitie> facilities) {
		this.facilities = facilities;
	}

	public List<ProvidedGood> getProvidedGoods() {
		return providedGoods;
	}

	public void setProvidedGoods(List<ProvidedGood> providedGoods) {
		this.providedGoods = providedGoods;
	}

	public String getHeatingSystem() {
		return heatingSystem;
	}

	public void setHeatingSystem(String heatingSystem) {
		this.heatingSystem = heatingSystem;
	}

}
