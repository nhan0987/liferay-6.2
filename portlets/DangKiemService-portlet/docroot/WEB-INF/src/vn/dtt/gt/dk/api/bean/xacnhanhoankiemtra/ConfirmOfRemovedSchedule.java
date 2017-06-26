package vn.dtt.gt.dk.api.bean.xacnhanhoankiemtra;

public class ConfirmOfRemovedSchedule {
	private String RequestDate;
	
	private String Organization;
	
	private String Division;
	
	private String Name;
	
	private String ReasonForRemoving;
	
	private String RequestId;
	
	private String RegisteredNumber;
	
	private ImportedVehicle[] ImportedVehicle;

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

	public String getRegisteredNumber() {
		return RegisteredNumber;
	}

	public void setRegisteredNumber(String registeredNumber) {
		RegisteredNumber = registeredNumber;
	}

	public ImportedVehicle[] getImportedVehicle() {
		return ImportedVehicle;
	}

	public void setImportedVehicle(ImportedVehicle[] importedVehicle) {
		ImportedVehicle = importedVehicle;
	}
}
