
package vn.dtt.gt.dk.nsw;

import java.util.Date;

public class CreateMessageFactory {
	
	public static String createMessageGiayChungNhan() {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<CertificateOfQuanlityConformity>");
		xmlResult.append("<CertificateNumber>").append("").append("</CertificateNumber>");
		xmlResult.append("<VehicleEngineStatus>").append("").append("</VehicleEngineStatus>");
		xmlResult.append("<Importer>");
		xmlResult.append("<ImporterCode>").append("").append("</ImporterCode>");
		xmlResult.append("<ImporterName>").append("").append("</ImporterName>");
		xmlResult.append("<ImporterAddress>").append("").append("</ImporterAddress>");
		xmlResult.append("</Importer>");
		xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
		xmlResult.append("<ModelType>").append("").append("</ModelType>");
		xmlResult.append("<ProductionCountry>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CountryCode>").append("").append("</CountryCode>");
		}
		xmlResult.append("</ProductionCountry>");
		
		xmlResult.append("<ProductionYear>").append("").append("</ProductionYear>");
		xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
		xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
		xmlResult.append("<EngineType>").append("").append("</EngineType>");
		xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
		xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CustomDeclaration>");
			xmlResult.append("<ImportCustomDeclareNo>").append("").append("</ImportCustomDeclareNo>");
			xmlResult.append("<ImportCustomDeclareDate>").append("").append("</ImportCustomDeclareDate>");
			xmlResult.append("</CustomDeclaration>");
		}
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<InspectionRecordNumber>").append("").append("</InspectionRecordNumber>");
		xmlResult.append("<InspectionRecordDate>").append("").append("</InspectionRecordDate>");
		xmlResult.append("<InspectionSite>").append("").append("</InspectionSite>");
		
		xmlResult.append("<TestReport>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<TestReportNumber>").append("").append("</TestReportNumber>");
		}
		xmlResult.append("</TestReport>");
		xmlResult.append("<SpecificationList>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<SpecItem>");
			xmlResult.append("<SpecificationCode>").append("").append("</SpecificationCode>");
			xmlResult.append("<SpecificationName>").append("").append("</SpecificationName>");
			xmlResult.append("<DeclarationValue1>").append("").append("</DeclarationValue1>");
			xmlResult.append("<DeclarationValue2>").append("").append("</DeclarationValue2>");
			xmlResult.append("<DeclarationValue3>").append("").append("</DeclarationValue3>");
			xmlResult.append("<DeclarationValue4>").append("").append("</DeclarationValue4>");
			xmlResult.append("<DeclarationValue5>").append("").append("</DeclarationValue5>");
			xmlResult.append("<DeclarationValue6>").append("").append("</DeclarationValue6>");
			xmlResult.append("</SpecItem>");
		}
		xmlResult.append("</SpecificationList>");
		xmlResult.append("<CircularNo>").append("").append("</CircularNo>");
		xmlResult.append("<CircularDate>").append("").append("</CircularDate>");
		xmlResult.append("<Remarks>").append("").append("</Remarks>");
		
		xmlResult.append("<InspectorSign>");
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("</InspectorSign>");
		xmlResult.append("</CertificateOfQuanlityConformity>");
		return xmlResult.toString();
	}
	
	public static String createMessageThongBaoMien() {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<NoticeOfExemptionFromInspection>");
		xmlResult.append("<CertificateNumber>").append("").append("</CertificateNumber>");
		xmlResult.append("<VehicleEngineStatus>").append("").append("</VehicleEngineStatus>");
		xmlResult.append("<Importer>");
		xmlResult.append("<ImporterCode>").append("").append("</ImporterCode>");
		xmlResult.append("<ImporterName>").append("").append("</ImporterName>");
		xmlResult.append("<ImporterAddress>").append("").append("</ImporterAddress>");
		xmlResult.append("</Importer>");
		xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
		xmlResult.append("<ModelType>").append("").append("</ModelType>");
		xmlResult.append("<ProductionCountry>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CountryCode>").append("").append("</CountryCode>");
		}
		xmlResult.append("</ProductionCountry>");
		
		xmlResult.append("<ProductionYear>").append("").append("</ProductionYear>");
		xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
		xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
		xmlResult.append("<EngineType>").append("").append("</EngineType>");
		xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
		xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CustomDeclaration>");
			xmlResult.append("<ImportCustomDeclareNo>").append("").append("</ImportCustomDeclareNo>");
			xmlResult.append("<ImportCustomDeclareDate>").append("").append("</ImportCustomDeclareDate>");
			xmlResult.append("</CustomDeclaration>");
		}
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<InspectionRecordNumber>").append("").append("</InspectionRecordNumber>");
		xmlResult.append("<InspectionRecordDate>").append("").append("</InspectionRecordDate>");
		xmlResult.append("<InspectionSite>").append("").append("</InspectionSite>");
		
		xmlResult.append("<TestReport>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<TestReportNumber>").append("").append("</TestReportNumber>");
		}
		xmlResult.append("</TestReport>");
		xmlResult.append("<SpecificationList>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<SpecItem>");
			xmlResult.append("<SpecificationCode>").append("").append("</SpecificationCode>");
			xmlResult.append("<SpecificationName>").append("").append("</SpecificationName>");
			xmlResult.append("<DeclarationValue1>").append("").append("</DeclarationValue1>");
			xmlResult.append("<DeclarationValue2>").append("").append("</DeclarationValue2>");
			xmlResult.append("<DeclarationValue3>").append("").append("</DeclarationValue3>");
			xmlResult.append("<DeclarationValue4>").append("").append("</DeclarationValue4>");
			xmlResult.append("<DeclarationValue5>").append("").append("</DeclarationValue5>");
			xmlResult.append("<DeclarationValue6>").append("").append("</DeclarationValue6>");
			xmlResult.append("</SpecItem>");
		}
		xmlResult.append("</SpecificationList>");
		xmlResult.append("<CircularNo>").append("").append("</CircularNo>");
		xmlResult.append("<CircularDate>").append("").append("</CircularDate>");
		xmlResult.append("<Remarks>").append("").append("</Remarks>");
		
		xmlResult.append("<InspectorSign>");
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("</InspectorSign>");
		
		xmlResult.append("</NoticeOfExemptionFromInspection>");
		return xmlResult.toString();
	}
	
	public static String createMessageThongBaoKhongDat() {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<NoticeOfNonConformity>");
		xmlResult.append("<CertificateNumber>").append("").append("</CertificateNumber>");
		xmlResult.append("<VehicleEngineStatus>").append("").append("</VehicleEngineStatus>");
		xmlResult.append("<Importer>");
		xmlResult.append("<ImporterCode>").append("").append("</ImporterCode>");
		xmlResult.append("<ImporterName>").append("").append("</ImporterName>");
		xmlResult.append("<ImporterAddress>").append("").append("</ImporterAddress>");
		xmlResult.append("</Importer>");
		xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
		xmlResult.append("<ModelType>").append("").append("</ModelType>");
		xmlResult.append("<ProductionCountry>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CountryCode>").append("").append("</CountryCode>");
		}
		xmlResult.append("</ProductionCountry>");
		
		xmlResult.append("<ProductionYear>").append("").append("</ProductionYear>");
		xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
		xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
		xmlResult.append("<EngineType>").append("").append("</EngineType>");
		xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
		xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CustomDeclaration>");
			xmlResult.append("<ImportCustomDeclareNo>").append("").append("</ImportCustomDeclareNo>");
			xmlResult.append("<ImportCustomDeclareDate>").append("").append("</ImportCustomDeclareDate>");
			xmlResult.append("</CustomDeclaration>");
		}
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<InspectionRecordNumber>").append("").append("</InspectionRecordNumber>");
		xmlResult.append("<InspectionRecordDate>").append("").append("</InspectionRecordDate>");
		xmlResult.append("<InspectionSite>").append("").append("</InspectionSite>");
		
		xmlResult.append("<TestReport>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<TestReportNumber>").append("").append("</TestReportNumber>");
		}
		xmlResult.append("</TestReport>");
		
		xmlResult.append("<ReasonForNonConformity>").append("").append("</ReasonForNonConformity>");
		xmlResult.append("<CircularNo>").append("").append("</CircularNo>");
		xmlResult.append("<CircularDate>").append("").append("</CircularDate>");
		xmlResult.append("<Destination>").append("").append("</Destination>");
		
		xmlResult.append("<InspectorSign>");
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("</InspectorSign>");
		
		xmlResult.append("</NoticeOfNonConformity>");
		return xmlResult.toString();
	}
	
	public static String createMessageThongBaoViPham() {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<NoticeOfViolation>");
		xmlResult.append("<CertificateNumber>").append("").append("</CertificateNumber>");
		xmlResult.append("<VehicleEngineStatus>").append("").append("</VehicleEngineStatus>");
		xmlResult.append("<Importer>");
		xmlResult.append("<ImporterCode>").append("").append("</ImporterCode>");
		xmlResult.append("<ImporterName>").append("").append("</ImporterName>");
		xmlResult.append("<ImporterAddress>").append("").append("</ImporterAddress>");
		xmlResult.append("</Importer>");
		xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
		xmlResult.append("<ModelType>").append("").append("</ModelType>");
		xmlResult.append("<ProductionCountry>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CountryCode>").append("").append("</CountryCode>");
		}
		xmlResult.append("</ProductionCountry>");
		
		xmlResult.append("<ProductionYear>").append("").append("</ProductionYear>");
		xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
		xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
		xmlResult.append("<EngineType>").append("").append("</EngineType>");
		xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
		xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CustomDeclaration>");
			xmlResult.append("<ImportCustomDeclareNo>").append("").append("</ImportCustomDeclareNo>");
			xmlResult.append("<ImportCustomDeclareDate>").append("").append("</ImportCustomDeclareDate>");
			xmlResult.append("</CustomDeclaration>");
		}
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<InspectionRecordNumber>").append("").append("</InspectionRecordNumber>");
		xmlResult.append("<InspectionRecordDate>").append("").append("</InspectionRecordDate>");
		xmlResult.append("<InspectionSite>").append("").append("</InspectionSite>");
		
		xmlResult.append("<TestReport>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<TestReportNumber>").append("").append("</TestReportNumber>");
		}
		xmlResult.append("</TestReport>");
		
		xmlResult.append("<ViolationDescription>").append("").append("</ViolationDescription>");
		xmlResult.append("<DecreeNo>").append("").append("</DecreeNo>");
		xmlResult.append("<DecreeDate>").append("").append("</DecreeDate>");
		xmlResult.append("<Destination>").append("").append("</Destination>");
		xmlResult.append("<InspectorSign>");
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("</InspectorSign>");
		
		xmlResult.append("</NoticeOfViolation>");
		return xmlResult.toString();
	}
	
	public static String createMessageXacNhanSuaDoiGCN() {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<CertificateOfQuanlityConformity>");
		xmlResult.append("<CertificateNumber>").append("").append("</CertificateNumber>");
		xmlResult.append("<VehicleEngineStatus>").append("").append("</VehicleEngineStatus>");
		xmlResult.append("<Importer>");
		xmlResult.append("<ImporterCode>").append("").append("</ImporterCode>");
		xmlResult.append("<ImporterName>").append("").append("</ImporterName>");
		xmlResult.append("<ImporterAddress>").append("").append("</ImporterAddress>");
		xmlResult.append("</Importer>");
		xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
		xmlResult.append("<ModelType>").append("").append("</ModelType>");
		xmlResult.append("<ProductionCountry>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CountryCode>").append("").append("</CountryCode>");
		}
		xmlResult.append("</ProductionCountry>");
		
		xmlResult.append("<ProductionYear>").append("").append("</ProductionYear>");
		xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
		xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
		xmlResult.append("<EngineType>").append("").append("</EngineType>");
		xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
		xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CustomDeclaration>");
			xmlResult.append("<ImportCustomDeclareNo>").append("").append("</ImportCustomDeclareNo>");
			xmlResult.append("<ImportCustomDeclareDate>").append("").append("</ImportCustomDeclareDate>");
			xmlResult.append("</CustomDeclaration>");
		}
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<InspectionRecordNumber>").append("").append("</InspectionRecordNumber>");
		xmlResult.append("<InspectionRecordDate>").append("").append("</InspectionRecordDate>");
		xmlResult.append("<InspectionSite>").append("").append("</InspectionSite>");
		
		xmlResult.append("<TestReport>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<TestReportNumber>").append("").append("</TestReportNumber>");
		}
		xmlResult.append("</TestReport>");
		xmlResult.append("<SpecificationList>");
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<SpecItem>");
			xmlResult.append("<SpecificationCode>").append("").append("</SpecificationCode>");
			xmlResult.append("<SpecificationName>").append("").append("</SpecificationName>");
			xmlResult.append("<DeclarationValue1>").append("").append("</DeclarationValue1>");
			xmlResult.append("<DeclarationValue2>").append("").append("</DeclarationValue2>");
			xmlResult.append("<DeclarationValue3>").append("").append("</DeclarationValue3>");
			xmlResult.append("<DeclarationValue4>").append("").append("</DeclarationValue4>");
			xmlResult.append("<DeclarationValue5>").append("").append("</DeclarationValue5>");
			xmlResult.append("<DeclarationValue6>").append("").append("</DeclarationValue6>");
			xmlResult.append("</SpecItem>");
		}
		xmlResult.append("</SpecificationList>");
		xmlResult.append("<CircularNo>").append("").append("</CircularNo>");
		xmlResult.append("<CircularDate>").append("").append("</CircularDate>");
		xmlResult.append("<Remarks>").append("").append("</Remarks>");
		
		xmlResult.append("<Confirmation>");
		xmlResult.append("<CertificateNumber>").append("").append("</CertificateNumber>");
		xmlResult.append("<CertificateStatus>").append("").append("</CertificateStatus>");
		xmlResult.append("<ExpiryDate>").append("").append("</ExpiryDate>");
		xmlResult.append("</Confirmation>");
		
		xmlResult.append("<InspectorSign>");
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("</InspectorSign>");
		
		xmlResult.append("</CertificateOfQuanlityConformity>");
		return xmlResult.toString();
	}
	
	public static String createMessageXacNhanHuyGCN() {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<ConfirmCertificateCancellation>");
		xmlResult.append("<ConfirmationNumber>").append("").append("</ConfirmationNumber>");
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<ReportBy>").append("").append("</ReportBy>");
		xmlResult.append("<ReportDate>").append("").append("</ReportDate>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("<ReasonForCancellation>").append("").append("</ReasonForCancellation>");
		xmlResult.append("<TotalofCancellation>").append("").append("</TotalofCancellation>");
		
		for (int i = 0; i < 2; i++) {
			xmlResult.append("<CertificateDetails>");
			xmlResult.append("<CertificateNumber>").append("").append("</CertificateNumber>");
			xmlResult.append("<VehicleEngineStatus>").append("").append("</VehicleEngineStatus>");
			xmlResult.append("<Importer>");
			xmlResult.append("<ImporterCode>").append("").append("</ImporterCode>");
			xmlResult.append("<ImporterName>").append("").append("</ImporterName>");
			xmlResult.append("<ImporterAddress>").append("").append("</ImporterAddress>");
			xmlResult.append("</Importer>");
			xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
			xmlResult.append("<ModelType>").append("").append("</ModelType>");
			xmlResult.append("<ProductionCountry>");
			for (i = 0; i < 2; i++) {
				xmlResult.append("<CountryCode>").append("").append("</CountryCode>");
			}
			xmlResult.append("</ProductionCountry>");
			
			xmlResult.append("<ProductionYear>").append("").append("</ProductionYear>");
			xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
			xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
			xmlResult.append("<EngineType>").append("").append("</EngineType>");
			xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
			xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
			for (i = 0; i < 2; i++) {
				xmlResult.append("<CustomDeclaration>");
				xmlResult.append("<ImportCustomDeclareNo>").append("").append("</ImportCustomDeclareNo>");
				xmlResult.append("<ImportCustomDeclareDate>").append("").append("</ImportCustomDeclareDate>");
				xmlResult.append("</CustomDeclaration>");
			}
			xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
			xmlResult.append("<InspectionRecordNumber>").append("").append("</InspectionRecordNumber>");
			xmlResult.append("<InspectionRecordDate>").append("").append("</InspectionRecordDate>");
			xmlResult.append("<InspectionSite>").append("").append("</InspectionSite>");
			
			xmlResult.append("<TestReport>");
			for (i = 0; i < 2; i++) {
				xmlResult.append("<TestReportNumber>").append("").append("</TestReportNumber>");
			}
			xmlResult.append("</TestReport>");
			xmlResult.append("</CertificateDetails>");
		}
		
		xmlResult.append("</ConfirmCertificateCancellation>");
		return xmlResult.toString();
	}
	
	public static String createThongBaoKeHoachKT() {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<ScheduleReport>");
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		
		xmlResult.append("<Inspection>");
		xmlResult.append("<InpectionDate>").append("").append("</InpectionDate>");
		xmlResult.append("<InspectionSite>").append("").append("</InspectionSite>");
		xmlResult.append("<DistrictCode>").append("").append("</DistrictCode>");
		xmlResult.append("<DistrictName>").append("").append("</DistrictName>");
		xmlResult.append("<ProvinceCode>").append("").append("</ProvinceCode>");
		xmlResult.append("<ProvinceName>").append("").append("</ProvinceName>");
		xmlResult.append("</Inspection>");
		
		xmlResult.append("<Contacter>");
		xmlResult.append("<ContactName>").append("").append("</ContactName>");
		xmlResult.append("<ContactPhone>").append("").append("</ContactPhone>");
		xmlResult.append("<ContactEmail>").append("").append("</ContactEmail>");
		xmlResult.append("</Contacter>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<ImportedVehicle>");
			xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
			xmlResult.append("<EngineType>").append("").append("</EngineType>");
			xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
			xmlResult.append("<ModelType>").append("").append("</ModelType>");
			for (int j = 0; j < 100; j++) {
				xmlResult.append("<FrameList>");
				xmlResult.append("<SequenceNo>").append("").append("</SequenceNo>");
				xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
				xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
				xmlResult.append("</FrameList>");
			}
			xmlResult.append("<TotalOfRequested>").append("").append("</TotalOfRequested>");
			xmlResult.append("</ImportedVehicle>");
		}
		
		xmlResult.append("<Remarks>").append("").append("</Remarks>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<InspectionAttendee>");
			xmlResult.append("<AttendeeID>").append("").append("</AttendeeID>");
			xmlResult.append("<AttendeeName>").append("").append("</AttendeeName>");
			xmlResult.append("<AttendeeRole>").append("").append("</AttendeeRole>");
			xmlResult.append("</InspectionAttendee>");
		}
		
		xmlResult.append("</ScheduleReport>");
		
		xmlResult.append("<InspectorSign>");
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("</InspectorSign>");
		
		return xmlResult.toString();
	}
	
	public static String createThongBaoDeNghiThuNghiemKhiThai() {
		StringBuilder xmlResult = new StringBuilder("");
		
		xmlResult.append("<RequestOfEmissionTesting>");
		xmlResult.append("<RequestTestingNumber>").append("").append("</RequestTestingNumber>");
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<InspectionRecordNumber>").append("").append("</InspectionRecordNumber>");
		xmlResult.append("<InspectionRecordDate>").append("").append("</InspectionRecordDate>");
		xmlResult.append("<ReportTo>").append("").append("</ReportTo>");
		xmlResult.append("<ContentOfRequest>").append("").append("</ContentOfRequest>");
		xmlResult.append("<TestingRegisteredPlace>").append("").append("</TestingRegisteredPlace>");
		xmlResult.append("<TestingRegistration>").append("").append("</TestingRegistration>");
		xmlResult.append("<TestingPayment>").append("").append("</TestingPayment>");
		xmlResult.append("<Remarks>").append("").append("</Remarks>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<ImportedVehicle>");
			xmlResult.append("<SequenceNo>").append("").append("</SequenceNo>");
			xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
			xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
			xmlResult.append("<EngineType>").append("").append("</EngineType>");
			xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
			xmlResult.append("<ModelType>").append("").append("</ModelType>");
			xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
			xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
			xmlResult.append("</ImportedVehicle>");
		}
		
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<ReportBy>").append("").append("</ReportBy>");
		xmlResult.append("<ReportDate>").append("").append("</ReportDate>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("</RequestOfEmissionTesting>");
		
		return xmlResult.toString();
	}
	
	public static String createThongBaoDeNghiThuNghiemAnToan() {
		StringBuilder xmlResult = new StringBuilder("");
		
		xmlResult.append("<RequestOfSafeTesting>");
		xmlResult.append("<RequestTestingNumber>").append("").append("</RequestTestingNumber>");
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<InspectionRecordNumber>").append("").append("</InspectionRecordNumber>");
		xmlResult.append("<InspectionRecordDate>").append("").append("</InspectionRecordDate>");
		xmlResult.append("<ReportTo>").append("").append("</ReportTo>");
		xmlResult.append("<ContentOfRequest>").append("").append("</ContentOfRequest>");
		xmlResult.append("<TestingRegisteredPlace>").append("").append("</TestingRegisteredPlace>");
		xmlResult.append("<TestingRegistration>").append("").append("</TestingRegistration>");
		xmlResult.append("<TestingPayment>").append("").append("</TestingPayment>");
		xmlResult.append("<Remarks>").append("").append("</Remarks>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<ImportedVehicle>");
			xmlResult.append("<SequenceNo>").append("").append("</SequenceNo>");
			xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
			xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
			xmlResult.append("<EngineType>").append("").append("</EngineType>");
			xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
			xmlResult.append("<ModelType>").append("").append("</ModelType>");
			xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
			xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
			xmlResult.append("</ImportedVehicle>");
		}
		
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<ReportBy>").append("").append("</ReportBy>");
		xmlResult.append("<ReportDate>").append("").append("</ReportDate>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("</RequestOfSafeTesting>");
		
		return xmlResult.toString();
	}
	
	public static String createThongBaoTrungCauGiamDinh() {
		StringBuilder xmlResult = new StringBuilder("");
		
		xmlResult.append("<RequestForControl>");
		xmlResult.append("<RequestTestingNumber>").append("").append("</RequestTestingNumber>");
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<InspectionRecordNumber>").append("").append("</InspectionRecordNumber>");
		xmlResult.append("<InspectionRecordDate>").append("").append("</InspectionRecordDate>");
		xmlResult.append("<ReportTo>").append("").append("</ReportTo>");
		xmlResult.append("<ContentOfRequest>").append("").append("</ContentOfRequest>");
		xmlResult.append("<ControlReportDeadline>").append("").append("</ControlReportDeadline>");
		xmlResult.append("<Remarks>").append("").append("</Remarks>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<ImportedVehicle>");
			xmlResult.append("<SequenceNo>").append("").append("</SequenceNo>");
			xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
			xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
			xmlResult.append("<EngineType>").append("").append("</EngineType>");
			xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
			xmlResult.append("<ModelType>").append("").append("</ModelType>");
			xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
			xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
			xmlResult.append("</ImportedVehicle>");
		}
		
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<ReportBy>").append("").append("</ReportBy>");
		xmlResult.append("<ReportDate>").append("").append("</ReportDate>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		xmlResult.append("</RequestForControl>");
		
		return xmlResult.toString();
	}
	
	public static String createXacNhanDaKiemTra() {
		StringBuilder xmlResult = new StringBuilder("");
		
		xmlResult.append("<CurrentStatusOfImportedVehicleList>");
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<TotalOfRegisteredVehicle>").append("").append("</TotalOfRegisteredVehicle>");
		xmlResult.append("<TotalOfRequested>").append("").append("</TotalOfRequested>");
		xmlResult.append("<TotalOfInspected>").append("").append("</TotalOfInspected>");
		xmlResult.append("<TotalOfNotYetInspected>").append("").append("</TotalOfNotYetInspected>");
		xmlResult.append("<TotalOfCancelled>").append("").append("</TotalOfCancelled>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<ImportedVehicle>");
			xmlResult.append("<SequenceNo>").append("").append("</SequenceNo>");
			xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
			xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
			xmlResult.append("<ModelType>").append("").append("</ModelType>");
			xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
			xmlResult.append("<EngineType>").append("").append("</EngineType>");
			xmlResult.append("<Manufacturer>").append("").append("</Manufacturer>");
			xmlResult.append("<ProductionCountry>");
			for (int j = 0; j < 100; j++) {
				xmlResult.append("<CountryCode>").append("").append("</CountryCode>");
			}
			xmlResult.append("</ProductionCountry>");
			xmlResult.append("<ProductionYear>").append("").append("</ProductionYear>");
			xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
			xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
			xmlResult.append("<VehicleEngineStatus>").append("").append("</VehicleEngineStatus>");
			xmlResult.append("<TechnicalSpecCode>").append("").append("</TechnicalSpecCode>");
			xmlResult.append("<MarkasInspected>").append("").append("</MarkasInspected>");
			
			xmlResult.append("</ImportedVehicle>");
		}
		xmlResult.append("</CurrentStatusOfImportedVehicleList>");
		
		return xmlResult.toString();
	}
	
	public static String createXacNhanDaPhanCongDVKT() {
		StringBuilder xmlResult = new StringBuilder("");
		
		xmlResult.append("<ConfirmationOfAssignment>");
		xmlResult.append("<RegisteredNumber>").append("").append("</RegisteredNumber>");
		xmlResult.append("<TotalOfRegisteredVehicle>").append("").append("</TotalOfRegisteredVehicle>");
		xmlResult.append("<TotalOfRequested>").append("").append("</TotalOfRequested>");
		xmlResult.append("<TotalOfAssigned>").append("").append("</TotalOfAssigned>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<ImportedVehicle>");
			xmlResult.append("<SequenceNo>").append("").append("</SequenceNo>");
			xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
			xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
			xmlResult.append("<ModelType>").append("").append("</ModelType>");
			xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
			xmlResult.append("<EngineType>").append("").append("</EngineType>");
			xmlResult.append("<Manufacturer>").append("").append("</Manufacturer>");
			xmlResult.append("<ProductionCountry>");
			for (int j = 0; j < 100; j++) {
				xmlResult.append("<CountryCode>").append("").append("</CountryCode>");
			}
			xmlResult.append("</ProductionCountry>");
			xmlResult.append("<ProductionYear>").append("").append("</ProductionYear>");
			xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
			xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
			xmlResult.append("<VehicleEngineStatus>").append("").append("</VehicleEngineStatus>");
			xmlResult.append("<MarkasInspected>").append("").append("</MarkasInspected>");
			
			xmlResult.append("</ImportedVehicle>");
		}
		xmlResult.append("</ConfirmationOfAssignment>");
		
		return xmlResult.toString();
	}
	
	public static String createThongBaoNopPhiLePhi() {
		StringBuilder xmlResult = new StringBuilder("");
		
		xmlResult.append("<DebitNote>");
		xmlResult.append("<DebitNoteNumber>").append("").append("</DebitNoteNumber>");
		xmlResult.append("<Organization>").append("").append("</Organization>");
		xmlResult.append("<Division>").append("").append("</Division>");
		xmlResult.append("<ReportBy>").append("").append("</ReportBy>");
		xmlResult.append("<ReportDate>").append("").append("</ReportDate>");
		xmlResult.append("<SignName>").append("").append("</SignName>");
		xmlResult.append("<SignTitle>").append("").append("</SignTitle>");
		xmlResult.append("<SignPlace>").append("").append("</SignPlace>");
		xmlResult.append("<SignDate>").append("").append("</SignDate>");
		
		xmlResult.append("<PaymentSummary>");
		xmlResult.append("<FromDate>").append("").append("</FromDate>");
		xmlResult.append("<ToDate>").append("").append("</ToDate>");
		xmlResult.append("<TotalOfPayment>").append("").append("</TotalOfPayment>");
		xmlResult.append("<TotalOfVehicle>").append("").append("</TotalOfVehicle>");
		xmlResult.append("</PaymentSummary>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<PaymentDetails>");
			xmlResult.append("<SequenceNo>").append("").append("</SequenceNo>");
			xmlResult.append("<RegisteredNumberRef>").append("").append("</RegisteredNumberRef>");
			xmlResult.append("<Remarks>").append("").append("</Remarks>");
			xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
			xmlResult.append("<DeclarationPrice>").append("").append("</DeclarationPrice>");
			xmlResult.append("<CurrencyCode>").append("").append("</CurrencyCode>");
			xmlResult.append("<NumberOfVehicle>").append("").append("</NumberOfVehicle>");
			xmlResult.append("<UnitPrice>").append("").append("</UnitPrice>");
			xmlResult.append("<TotalPrice>").append("").append("</TotalPrice>");
			xmlResult.append("<TotalDebit>").append("").append("</TotalDebit>");
			xmlResult.append("<PaymentDeadline>").append("").append("</PaymentDeadline>");
			xmlResult.append("</PaymentDetails>");
		}
		
		xmlResult.append("<Charges>");
		xmlResult.append("<ChargeType>").append("").append("</ChargeType>");
		xmlResult.append("<Remarks>").append("").append("</Remarks>");
		xmlResult.append("<Unit>").append("").append("</Unit>");
		xmlResult.append("<Price>").append("").append("</Price>");
		xmlResult.append("<Total>").append("").append("</Total>");
		xmlResult.append("</Charges>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<OtherCosts>");
			xmlResult.append("<SequenceNo>").append("").append("</SequenceNo>");
			xmlResult.append("<RegisteredNumberRef>").append("").append("</RegisteredNumberRef>");
			xmlResult.append("<Remarks>").append("").append("</Remarks>");
			xmlResult.append("<Amount>").append("").append("</Amount>");
			xmlResult.append("</OtherCosts>");
		}
		
		xmlResult.append("</DebitNote>");
		
		return xmlResult.toString();
	}
	
	public static String createXacNhanHoanThanhNopPhiLePhi() {
		StringBuilder xmlResult = new StringBuilder("");
		
		xmlResult.append("<PaymentConfirmation>");
		xmlResult.append("<TransactionID>").append("").append("</TransactionID>");
		xmlResult.append("<DebitNoteNumber>").append("").append("</DebitNoteNumber>");
		xmlResult.append("<ReportDate>").append("").append("</ReportDate>");
		
		xmlResult.append("<PaymentSummary>");
		xmlResult.append("<PaymentDate>").append("").append("</PaymentDate>");
		xmlResult.append("<TotalOfPayment>").append("").append("</TotalOfPayment>");
		xmlResult.append("<TotalOfVehicle>").append("").append("</TotalOfVehicle>");
		xmlResult.append("</PaymentSummary>");
		
		for (int i = 0; i < 100; i++) {
			xmlResult.append("<ImportedVehicle>");
			xmlResult.append("<SequenceNo>").append("").append("</SequenceNo>");
			xmlResult.append("<RegisteredNumberRef>").append("").append("</RegisteredNumberRef>");
			xmlResult.append("<MarkAsVehicle>").append("").append("</MarkAsVehicle>");
			xmlResult.append("<TradeMark>").append("").append("</TradeMark>");
			xmlResult.append("<ModelType>").append("").append("</ModelType>");
			xmlResult.append("<VehicleType>").append("").append("</VehicleType>");
			xmlResult.append("<EngineType>").append("").append("</EngineType>");
			xmlResult.append("<Manufacturer>").append("").append("</Manufacturer>");
			xmlResult.append("<ProductionCountry>");
			for (int j = 0; j < 100; j++) {
				xmlResult.append("<CountryCode>").append("").append("</CountryCode>");
			}
			xmlResult.append("</ProductionCountry>");
			xmlResult.append("<ProductionYear>").append("").append("</ProductionYear>");
			xmlResult.append("<ChassisNumber>").append("").append("</ChassisNumber>");
			xmlResult.append("<EngineNumber>").append("").append("</EngineNumber>");
			xmlResult.append("<VehicleEngineStatus>").append("").append("</VehicleEngineStatus>");
			xmlResult.append("<MarkasPayment>").append("").append("</MarkasPayment>");
			xmlResult.append("</ImportedVehicle>");
		}
		xmlResult.append("</PaymentConfirmation>");
		
		return xmlResult.toString();
	}
	
	
	
	/**
	* @param requestDate
	* @param organization
	* @param division
	* @param name
	* @param reason
	* @param finishedDate
	* @return xmlResult
	*/
	public static String createMessageRequestChanges(
		Date requestDate, String organization, String division, String name, String reason, Date finishedDate) {
		StringBuilder xmlResult = new StringBuilder("");
		
		xmlResult.append("<RequestChanges>");
		xmlResult.append("<RequestDate>").append(FormatData.parseDateToTring(requestDate)).append("</RequestDate>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>").append(name).append("</Name>");
		xmlResult.append("<Reason>").append(reason).append("</Reason>");
		xmlResult.append("<FinishedDate>").append(FormatData.parseDateToTring(finishedDate)).append("</FinishedDate>");
		xmlResult.append("</RequestChanges>");
		
		return xmlResult.toString();
	}
	
	
	/**
	* @param rejectCode
	* @param rejectDesc
	* @param organization
	* @param division
	* @param name
	* @param rejectDate
	* @return xmlResult
	*/
	public static String createMessageReject(
		String rejectCode, String rejectDesc, String organization, String division, String name, Date rejectDate) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<Reject>");
		xmlResult.append("<RejectCode>").append(rejectCode).append("</RejectCode>");
		xmlResult.append("<RejectDesc>").append(rejectDesc).append("</RejectDesc>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>").append(name).append("</Name>");
		xmlResult.append("</Reject>");
		xmlResult.append("<RejectDate>");
		xmlResult.append(FormatData.parseDateToTring(rejectDate));
		xmlResult.append("</RejectDate>");
		
		return xmlResult.toString();
	}
	
	public static String createMessageHuyGiayPhepRoiCang(
		String organization, String division, String name, Date cancelDate, String reason, Integer isApprove) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<CancelDate>");
		xmlResult.append(FormatData.parseDateToTring(cancelDate));
		xmlResult.append("</CancelDate>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>").append(name).append("</Name>");
		xmlResult.append("<Reason>").append(reason).append("</Reason>");
		xmlResult.append("<IsApprove>").append(isApprove).append("</IsApprove>");
		
		return xmlResult.toString();
	}
	
	/**
	* @param organization
	* @param division
	* @param name
	* @param cancelDate
	* @param reason
	* @return xmlResult
	*/
	public static String createMessageHuyHoSo(
		String organization, String division, String name, Date cancelDate, String reason) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<CancelDate>");
		xmlResult.append(FormatData.parseDateToTring(cancelDate));
		xmlResult.append("</CancelDate>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>").append(name).append("</Name>");
		xmlResult.append("<Reason>").append(reason).append("</Reason>");
		
		return xmlResult.toString();
	}
	
	public static String createMessageHoanThanh(String receiveDate) {
		String xmlResult = "<ReceiveDate>" + receiveDate + "</ReceiveDate>";
		return xmlResult.toString();
	}
	
	public static String createMessageAccept(String organization, String division, String name, Date acceptDate) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<AcceptDate>");
		xmlResult.append(FormatData.parseDateToTring(acceptDate));
		xmlResult.append("</AcceptDate>");
		xmlResult.append("<Accepter>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>").append(name).append("</Name>");
		xmlResult.append("</Accepter>");
		
		return xmlResult.toString();
	}
	
	public static String createMessageRejectSystem(
		String rejectCode, String rejectDesc, String organization, String division, Date rejectDate) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<Reject>");
		xmlResult.append("<RejectCode>").append(rejectCode).append("</RejectCode>");
		xmlResult.append("<RejectDesc>").append(rejectDesc).append("</RejectDesc>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>SYSTEM</Name>");
		xmlResult.append("</Reject>");
		xmlResult.append("<RejectDate>");
		xmlResult.append(FormatData.parseDateToTring(rejectDate));
		xmlResult.append("</RejectDate>");
		
		return xmlResult.toString();
	}
	
	public static String createMessageHuyLenhDieuDong(
		String organization, String division, String name, String reason, Date cancelDate, Integer isApprove) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<CancelDate>");
		xmlResult.append(FormatData.parseDateToTring(cancelDate));
		xmlResult.append("</CancelDate>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>").append(name).append("</Name>");
		xmlResult.append("<Reason>").append(reason).append("</Reason>");
		xmlResult.append("<IsApprove>").append(isApprove).append("</IsApprove>");
		
		return xmlResult.toString();
	}
	
	public static String createMessageHuyGiayPhepRoiCang(
		String organization, String division, String name, String reason, Date cancelDate, Integer isApprove) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<CancelDate>");
		xmlResult.append(FormatData.parseDateToTring(cancelDate));
		xmlResult.append("</CancelDate>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>").append(name).append("</Name>");
		xmlResult.append("<Reason>").append(name).append("</Reason>");
		xmlResult.append("<IsApprove>").append(isApprove).append("</IsApprove>");
		
		return xmlResult.toString();
	}
	
	public static String createMessageHuyGiayPhepQuaCanh(
		String organization, String division, String name, String reason, Date cancelDate, Integer isApprove) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<CancelDate>");
		xmlResult.append(FormatData.parseDateToTring(cancelDate));
		xmlResult.append("</CancelDate>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>").append(name).append("</Name>");
		xmlResult.append("<Reason>").append(name).append("</Reason>");
		xmlResult.append("<IsApprove>").append(isApprove).append("</IsApprove>");
		
		return xmlResult.toString();
	}
	
	public static String createMessageKhaiHuyHoSo(
		String organization, String division, String name, String reason, Date cancelDate, Integer isApprove) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<CancelDate>");
		xmlResult.append(FormatData.parseDateToTring(cancelDate));
		xmlResult.append("</CancelDate>");
		xmlResult.append("<Organization>").append(organization).append("</Organization>");
		xmlResult.append("<Division>").append(division).append("</Division>");
		xmlResult.append("<Name>").append(name).append("</Name>");
		xmlResult.append("<Reason>").append(name).append("</Reason>");
		xmlResult.append("<IsApprove>").append(isApprove).append("</IsApprove>");
		
		return xmlResult.toString();
	}
	
	public static String pheDuyetHoSoTuCacBo(
		int approvalStatus, String comment, String organization, String division, String name, Date approvalDate) {
		StringBuilder xmlResult = new StringBuilder("");
		xmlResult.append("<Approval>");
		xmlResult.append("<ApprovalStatus>");
		xmlResult.append(approvalStatus);
		xmlResult.append("</ApprovalStatus>");
		xmlResult.append("<Comment>");
		xmlResult.append(comment);
		xmlResult.append("</Comment>");
		xmlResult.append("<Organization>");
		xmlResult.append(organization);
		xmlResult.append("</Organization>");
		xmlResult.append("<Division>");
		xmlResult.append(division);
		xmlResult.append("</Division>");
		xmlResult.append("<Name>");
		xmlResult.append(name);
		xmlResult.append("</Name>");
		xmlResult.append("<ApprovalDate>");
		xmlResult.append(FormatData.parseDateToTring(approvalDate));
		xmlResult.append("</ApprovalDate>");
		xmlResult.append("</Approval>");
		
		return xmlResult.toString();
	}
	
	public static String create_24_XacNhanHuyThuTuc(String registeredNumber, Date cancelDate, String organization, String division, String name, String reason) {
		  StringBuilder xmlResult = new StringBuilder("");
		  
		  xmlResult.append("<ConfirmCancellation>");
		  
		  
		  xmlResult.append("<RegisteredNumber>");
		  xmlResult.append(registeredNumber);
		  xmlResult.append("</RegisteredNumber>");
		  
		  xmlResult.append("<CancelDate>");
		  xmlResult.append(FormatData.parseDateToTring(cancelDate));
		  xmlResult.append("</CancelDate>");
		  
		  
		  xmlResult.append("<Organization>");
		  xmlResult.append(organization);
		  xmlResult.append("</Organization>");
		  
		  xmlResult.append("<Division>");
		  xmlResult.append(division);
		  xmlResult.append("</Division>");
		  
		  xmlResult.append("<Name>");
		  xmlResult.append(name);
		  xmlResult.append("</Name>");
		  
		  xmlResult.append("<Reason>");
		  xmlResult.append(reason);
		  xmlResult.append("</Reason>");
		  
		  xmlResult.append("</ConfirmCancellation>");
		  return xmlResult.toString();
		 }
}
