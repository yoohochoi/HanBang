package hanbang.domain;

import java.util.List;

public class ExtraInfo {
	
	private boolean pet;
	private boolean smoke;
	private List<String> facilities;
	private List<String> providedGoods;
	private String heatingSystem;
	
	public ExtraInfo() {
	}

	public boolean isPet() {
		return pet;
	}

	public void setPet(boolean pet) {
		this.pet = pet;
	}

	public boolean isSmoke() {
		return smoke;
	}

	public void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}

	public List<String> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<String> facilities) {
		this.facilities = facilities;
	}

	public List<String> getProvidedGoods() {
		return providedGoods;
	}

	public void setProvidedGoods(List<String> providedGoods) {
		this.providedGoods = providedGoods;
	}

	public String getHeatingSystem() {
		return heatingSystem;
	}

	public void setHeatingSystem(String heatingSystem) {
		this.heatingSystem = heatingSystem;
	}
	
}
