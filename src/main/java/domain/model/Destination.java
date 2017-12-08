package domain.model;

public class Destination {
	private String name;
	private String province;
	private String coordinates;
	private String postalcode;
	private String flag;
	private String description;

	public Destination() {}
	
	public Destination(String name,String province, String coordinates, String postalcode, String flag, String description) {
		this.setName(name);
		this.setProvince(province);
		this.setCoordinates(coordinates);
		this.setPostalcode(postalcode);
		this.setFlag(flag);
		this.setDescription(description);
	}
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return province;
	}

	private void setProvince(String province) {
		this.province = province;
	}

	public String getCoordinates() {
		return coordinates;
	}

	private void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getPostalcode() {
		return postalcode;
	}

	private void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getFlag() {
		return flag;
	}

	private void setFlag(String flag) {
		this.flag = flag;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}	
}
