
package vn.dtt.gt.dk.nsw.model;

public class Messsage {
	
	//Reference
	private String refVersion;
	private String refMessageId;
	//From
	private String fromName;
	private String fromIdentity;
	//To
	private String toName;
	private String toIdentity;
	//Subject
	private String documentType;
	private String type;
	private String function;
	private String reference;
	private String preReference;
	private String documentYear;
	private String sendDate;
	private String content;
	
	private String fromCountryCode;
	private String fromMinistryCode;
	private String fromOrganizationCode;
	private String fromUnitCode;
	
	private String toCountryCode;
	private String toMinistryCode;
	private String toOrganizationCode;
	private String toUnitCode;
	
	public Messsage() {
		
	}
	
	public Messsage(
		String ref_version, String ref_messageId,
		
		String frm_name, String frm_identity, String to_name, String to_identity,
		
		String documentType, String type, String function, String reference, String preReference, String documentYear,
		String sendDate, String from_countryCode, String from_ministryCode, String from_organizationCode,
		String from_unitCode, String to_countryCode, String to_ministryCode, String to_organizationCode,
		String to_unitCode) {
		super();
		this.refVersion = ref_version;
		this.refMessageId = ref_messageId;
		
		this.fromName = frm_name;
		this.fromIdentity = frm_identity;
		
		this.toName = to_name;
		this.toIdentity = to_identity;
		
		this.documentType = documentType;
		this.type = type;
		this.function = function;
		this.reference = reference;
		this.preReference = preReference;
		this.documentYear = documentYear;
		this.sendDate = sendDate;
		
		this.fromCountryCode = from_countryCode;
		this.fromMinistryCode = from_ministryCode;
		this.fromOrganizationCode = from_organizationCode;
		this.fromUnitCode = from_unitCode;
		
		this.toCountryCode = to_countryCode;
		this.toMinistryCode = to_ministryCode;
		this.toOrganizationCode = to_organizationCode;
		this.toUnitCode = to_unitCode;
	}
	
	public String getRefVersion() {
		return refVersion;
	}
	
	public void setRefVersion(String refVersion) {
		this.refVersion = refVersion;
	}
	
	public String getRefMessageId() {
		return refMessageId;
	}
	
	public void setRefMessageId(String refMessageId) {
		this.refMessageId = refMessageId;
	}
	
	public String getFromName() {
		return fromName;
	}
	
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	
	public String getFromIdentity() {
		return fromIdentity;
	}
	
	public void setFromIdentity(String fromIdentity) {
		this.fromIdentity = fromIdentity;
	}
	
	public String getToName() {
		return toName;
	}
	
	public void setToName(String toName) {
		this.toName = toName;
	}
	
	public String getToIdentity() {
		return toIdentity;
	}
	
	public void setToIdentity(String toIdentity) {
		this.toIdentity = toIdentity;
	}
	
	public String getDocumentType() {
		return documentType;
	}
	
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getFunction() {
		return function;
	}
	
	public void setFunction(String function) {
		this.function = function;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public String getPreReference() {
		return preReference;
	}
	
	public void setPreReference(String preReference) {
		this.preReference = preReference;
	}
	
	public String getDocumentYear() {
		return documentYear;
	}
	
	public void setDocumentYear(String documentYear) {
		this.documentYear = documentYear;
	}
	
	public String getSendDate() {
		return sendDate;
	}
	
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getFromCountryCode() {
		return fromCountryCode;
	}
	
	public void setFromCountryCode(String fromCountryCode) {
		this.fromCountryCode = fromCountryCode;
	}
	
	public String getFromMinistryCode() {
		return fromMinistryCode;
	}
	
	public void setFromMinistryCode(String fromMinistryCode) {
		this.fromMinistryCode = fromMinistryCode;
	}
	
	public String getFromOrganizationCode() {
		return fromOrganizationCode;
	}
	
	public void setFromOrganizationCode(String fromOrganizationCode) {
		this.fromOrganizationCode = fromOrganizationCode;
	}
	
	public String getFromUnitCode() {
		return fromUnitCode;
	}
	
	public void setFromUnitCode(String fromUnitCode) {
		this.fromUnitCode = fromUnitCode;
	}
	
	public String getToCountryCode() {
		return toCountryCode;
	}
	
	public void setToCountryCode(String toCountryCode) {
		this.toCountryCode = toCountryCode;
	}
	
	public String getToMinistryCode() {
		return toMinistryCode;
	}
	
	public void setToMinistryCode(String toMinistryCode) {
		this.toMinistryCode = toMinistryCode;
	}
	
	public String getToOrganizationCode() {
		return toOrganizationCode;
	}
	
	public void setToOrganizationCode(String toOrganizationCode) {
		this.toOrganizationCode = toOrganizationCode;
	}
	
	public String getToUnitCode() {
		return toUnitCode;
	}
	
	public void setToUnitCode(String toUnitCode) {
		this.toUnitCode = toUnitCode;
	}
	
}
