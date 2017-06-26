package vn.dtt.gt.dk.api.bean.canbotbycbs;

public class RequestChanges {
	private String RequestDate;
	
	private String Organization;
	
	private String Division;
	
	private String Name;
	
	private String Reason;
	
	private String FinishedDate;
	
	private String RegisteredNumber;

	public String getRequestDate() {
		return RequestDate;
	}

	public void setRequestDate(String requestDate) {
		RequestDate = requestDate;
	}

	public String getOrganization() {
		return Organization;
	}

	public void setOrganization(String organization) {
		Organization = organization;
	}

	public String getDivision() {
		return Division;
	}

	public void setDivision(String division) {
		Division = division;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getFinishedDate() {
		return FinishedDate;
	}

	public void setFinishedDate(String finishedDate) {
		FinishedDate = finishedDate;
	}

	public String getRegisteredNumber() {
		return RegisteredNumber;
	}

	public void setRegisteredNumber(String registeredNumber) {
		RegisteredNumber = registeredNumber;
	}
}
