package vn.dtt.gt.dk.api.bean.tbtralai;

public class RemovedSchedule {
	private String RequestDate;
	
	private String Organization;
	
	private String Division;
	
	private String Name;
	
	private String ReasonForRemoving;
	
	private String RequestId;
	
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

	public String getRegisteredNumber() {
		return RegisteredNumber;
	}

	public void setRegisteredNumber(String registeredNumber) {
		RegisteredNumber = registeredNumber;
	}

	public String getReasonForRemoving() {
		return ReasonForRemoving;
	}

	public void setReasonForRemoving(String reasonForRemoving) {
		ReasonForRemoving = reasonForRemoving;
	}

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}
}
