package oopsprograms;

public class Company {
	private int id;

	private String address;
	private String companyName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Company(int id, String address, String companyName) {
		super();
		this.id = id;

		this.address = address;
		this.companyName = companyName;
	}

}
