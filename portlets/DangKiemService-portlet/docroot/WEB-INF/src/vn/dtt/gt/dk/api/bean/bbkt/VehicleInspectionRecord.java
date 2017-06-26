package vn.dtt.gt.dk.api.bean.bbkt;

public class VehicleInspectionRecord {
	private InspectionAttendee[] InspectionAttendee;

    private String MARKUPSAFETEST;

    private String SIGNTITLE;

    private String REMARKS;

    private String TechnicalSpecCode;

    private InspectionCommonStatus[] InspectionCommonStatus;

    private COPReport COPReport;

    private GeneralInfo GeneralInfo;

    private String InspectionRecordNumber;
    
    private String InspectionRecordNumberEdit;

    private String SIGNPLACE;

    private String InspectionRecordDate;

    private String CONFIRMEDRESULT;

    private String MARKUPEMISSIONTEST;

    private String INSPECTIONMODENAME;

    private SpecificationList[] SpecificationList;

    private String SIGNDATE;

    private String CORPORATIONNAME;

    private SafetyTestReport SafetyTestReport;

    private String INSPECTIONDATETO;

    private String CertificateRefNoResult;

    private String SIGNNAME;

    private String INSPECTIONMODE;

    private String DESCRIPTION;

    private String MARKUPCONTROL;

    private EmissionTestReport EmissionTestReport;

    private String INSPECTIONDATEFROM;

    private String InspectionSite;

    private String CertificateRefNo;

    private String CertificateRefNoEdit;

    private CustomDeclaration CustomDeclaration;

    private String RegisteredNumber;
    
    private AttachedFile[] AttachedFile;

    private ImportedVehicle[] ImportedVehicle;
    
    private RemovedVehicle[] RemovedVehicle;
    
    private String InspectionRecordFolder;

    public InspectionAttendee[] getInspectionAttendee ()
    {
        return InspectionAttendee;
    }

    public void setInspectionAttendee (InspectionAttendee[] InspectionAttendee)
    {
        this.InspectionAttendee = InspectionAttendee;
    }

    public String getMARKUPSAFETEST ()
    {
        return MARKUPSAFETEST;
    }

    public void setMARKUPSAFETEST (String MARKUPSAFETEST)
    {
        this.MARKUPSAFETEST = MARKUPSAFETEST;
    }

    public String getSIGNTITLE ()
    {
        return SIGNTITLE;
    }

    public void setSIGNTITLE (String SIGNTITLE)
    {
        this.SIGNTITLE = SIGNTITLE;
    }

    public String getREMARKS ()
    {
        return REMARKS;
    }

    public void setREMARKS (String REMARKS)
    {
        this.REMARKS = REMARKS;
    }

    public String getTechnicalSpecCode ()
    {
        return TechnicalSpecCode;
    }

    public void setTechnicalSpecCode (String TechnicalSpecCode)
    {
        this.TechnicalSpecCode = TechnicalSpecCode;
    }

    public InspectionCommonStatus[] getInspectionCommonStatus ()
    {
        return InspectionCommonStatus;
    }

    public void setInspectionCommonStatus (InspectionCommonStatus[] InspectionCommonStatus)
    {
        this.InspectionCommonStatus = InspectionCommonStatus;
    }

    public COPReport getCOPReport ()
    {
        return COPReport;
    }

    public void setCOPReport (COPReport COPReport)
    {
        this.COPReport = COPReport;
    }

    public GeneralInfo getGeneralInfo ()
    {
        return GeneralInfo;
    }

    public void setGeneralInfo (GeneralInfo GeneralInfo)
    {
        this.GeneralInfo = GeneralInfo;
    }

    public String getInspectionRecordNumber ()
    {
        return InspectionRecordNumber;
    }

    public void setInspectionRecordNumber (String InspectionRecordNumber)
    {
        this.InspectionRecordNumber = InspectionRecordNumber;
    }

    public String getSIGNPLACE ()
    {
        return SIGNPLACE;
    }

    public void setSIGNPLACE (String SIGNPLACE)
    {
        this.SIGNPLACE = SIGNPLACE;
    }

    public String getInspectionRecordDate ()
    {
        return InspectionRecordDate;
    }

    public void setInspectionRecordDate (String InspectionRecordDate)
    {
        this.InspectionRecordDate = InspectionRecordDate;
    }

    public String getCONFIRMEDRESULT ()
    {
        return CONFIRMEDRESULT;
    }

    public void setCONFIRMEDRESULT (String CONFIRMEDRESULT)
    {
        this.CONFIRMEDRESULT = CONFIRMEDRESULT;
    }

    public String getMARKUPEMISSIONTEST ()
    {
        return MARKUPEMISSIONTEST;
    }

    public void setMARKUPEMISSIONTEST (String MARKUPEMISSIONTEST)
    {
        this.MARKUPEMISSIONTEST = MARKUPEMISSIONTEST;
    }

    public String getINSPECTIONMODENAME ()
    {
        return INSPECTIONMODENAME;
    }

    public void setINSPECTIONMODENAME (String INSPECTIONMODENAME)
    {
        this.INSPECTIONMODENAME = INSPECTIONMODENAME;
    }

    public SpecificationList[] getSpecificationList ()
    {
        return SpecificationList;
    }

    public void setSpecificationList (SpecificationList[] SpecificationList)
    {
        this.SpecificationList = SpecificationList;
    }

    public String getSIGNDATE ()
    {
        return SIGNDATE;
    }

    public void setSIGNDATE (String SIGNDATE)
    {
        this.SIGNDATE = SIGNDATE;
    }

    public String getCORPORATIONNAME ()
    {
        return CORPORATIONNAME;
    }

    public void setCORPORATIONNAME (String CORPORATIONNAME)
    {
        this.CORPORATIONNAME = CORPORATIONNAME;
    }

    public SafetyTestReport getSafetyTestReport ()
    {
        return SafetyTestReport;
    }

    public void setSafetyTestReport (SafetyTestReport SafetyTestReport)
    {
        this.SafetyTestReport = SafetyTestReport;
    }

    public String getINSPECTIONDATETO ()
    {
        return INSPECTIONDATETO;
    }

    public void setINSPECTIONDATETO (String INSPECTIONDATETO)
    {
        this.INSPECTIONDATETO = INSPECTIONDATETO;
    }

    public String getCertificateRefNoResult ()
    {
        return CertificateRefNoResult;
    }

    public void setCertificateRefNoResult (String CertificateRefNoResult)
    {
        this.CertificateRefNoResult = CertificateRefNoResult;
    }

    public String getSIGNNAME ()
    {
        return SIGNNAME;
    }

    public void setSIGNNAME (String SIGNNAME)
    {
        this.SIGNNAME = SIGNNAME;
    }

    public String getINSPECTIONMODE ()
    {
        return INSPECTIONMODE;
    }

    public void setINSPECTIONMODE (String INSPECTIONMODE)
    {
        this.INSPECTIONMODE = INSPECTIONMODE;
    }

    public String getDESCRIPTION ()
    {
        return DESCRIPTION;
    }

    public void setDESCRIPTION (String DESCRIPTION)
    {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getMARKUPCONTROL ()
    {
        return MARKUPCONTROL;
    }

    public void setMARKUPCONTROL (String MARKUPCONTROL)
    {
        this.MARKUPCONTROL = MARKUPCONTROL;
    }

    public EmissionTestReport getEmissionTestReport ()
    {
        return EmissionTestReport;
    }

    public void setEmissionTestReport (EmissionTestReport EmissionTestReport)
    {
        this.EmissionTestReport = EmissionTestReport;
    }

    public String getINSPECTIONDATEFROM ()
    {
        return INSPECTIONDATEFROM;
    }

    public void setINSPECTIONDATEFROM (String INSPECTIONDATEFROM)
    {
        this.INSPECTIONDATEFROM = INSPECTIONDATEFROM;
    }

    public String getInspectionSite ()
    {
        return InspectionSite;
    }

    public void setInspectionSite (String InspectionSite)
    {
        this.InspectionSite = InspectionSite;
    }

    public String getCertificateRefNo ()
    {
        return CertificateRefNo;
    }

    public void setCertificateRefNo (String CertificateRefNo)
    {
        this.CertificateRefNo = CertificateRefNo;
    }

    public String getCertificateRefNoEdit ()
    {
        return CertificateRefNoEdit;
    }

    public void setCertificateRefNoEdit (String CertificateRefNoEdit)
    {
        this.CertificateRefNoEdit = CertificateRefNoEdit;
    }

    public CustomDeclaration getCustomDeclaration ()
    {
        return CustomDeclaration;
    }

    public void setCustomDeclaration (CustomDeclaration CustomDeclaration)
    {
        this.CustomDeclaration = CustomDeclaration;
    }

    public String getRegisteredNumber ()
    {
        return RegisteredNumber;
    }

    public void setRegisteredNumber (String RegisteredNumber)
    {
        this.RegisteredNumber = RegisteredNumber;
    }

    public ImportedVehicle[] getImportedVehicle ()
    {
        return ImportedVehicle;
    }

    public void setImportedVehicle (ImportedVehicle[] ImportedVehicle)
    {
        this.ImportedVehicle = ImportedVehicle;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [InspectionAttendee = "+InspectionAttendee+", MARKUPSAFETEST = "+MARKUPSAFETEST+", SIGNTITLE = "+SIGNTITLE+", REMARKS = "+REMARKS+", TechnicalSpecCode = "+TechnicalSpecCode+", InspectionCommonStatus = "+InspectionCommonStatus+", COPReport = "+COPReport+", GeneralInfo = "+GeneralInfo+", InspectionRecordNumber = "+InspectionRecordNumber+", SIGNPLACE = "+SIGNPLACE+", InspectionRecordDate = "+InspectionRecordDate+", CONFIRMEDRESULT = "+CONFIRMEDRESULT+", MARKUPEMISSIONTEST = "+MARKUPEMISSIONTEST+", INSPECTIONMODENAME = "+INSPECTIONMODENAME+", SpecificationList = "+SpecificationList+", SIGNDATE = "+SIGNDATE+", CORPORATIONNAME = "+CORPORATIONNAME+", SafetyTestReport = "+SafetyTestReport+", INSPECTIONDATETO = "+INSPECTIONDATETO+", CertificateRefNoResult = "+CertificateRefNoResult+", SIGNNAME = "+SIGNNAME+", INSPECTIONMODE = "+INSPECTIONMODE+", DESCRIPTION = "+DESCRIPTION+", MARKUPCONTROL = "+MARKUPCONTROL+", EmissionTestReport = "+EmissionTestReport+", INSPECTIONDATEFROM = "+INSPECTIONDATEFROM+", InspectionSite = "+InspectionSite+", CertificateRefNo = "+CertificateRefNo+", CertificateRefNoEdit = "+CertificateRefNoEdit+", CustomDeclaration = "+CustomDeclaration+", RegisteredNumber = "+RegisteredNumber+", ImportedVehicle = "+ImportedVehicle+"]";
    }

	public AttachedFile[] getAttachedFile() {
		return AttachedFile;
	}

	public void setAttachedFile(AttachedFile[] attachedFile) {
		AttachedFile = attachedFile;
	}

	public RemovedVehicle[] getRemovedVehicle() {
		return RemovedVehicle;
	}

	public void setRemovedVehicle(RemovedVehicle[] removedVehicle) {
		RemovedVehicle = removedVehicle;
	}

	public String getInspectionRecordNumberEdit() {
		return InspectionRecordNumberEdit;
	}

	public void setInspectionRecordNumberEdit(String inspectionRecordNumberEdit) {
		InspectionRecordNumberEdit = inspectionRecordNumberEdit;
	}

	public String getInspectionRecordFolder() {
		return InspectionRecordFolder;
	}

	public void setInspectionRecordFolder(String inspectionRecordFolder) {
		InspectionRecordFolder = inspectionRecordFolder;
	}
}
