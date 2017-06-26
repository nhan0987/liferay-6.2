package vn.dtt.gt.dk.api.bean.bbkt;

public class InspectionCommonStatus
{
    private String COMMONRESULT;

    private String VEHICLECLASS;

    private String GROUPNAME;

    private String ITEMNAME;

    private String SEQUENCENO;

    private String COMMONSTATUS;

    private String TYPE;
    
    private String COMMONCODE;
    
    private String ALLOW_EDIT;

    public String getCOMMONRESULT ()
    {
        return COMMONRESULT;
    }

    public void setCOMMONRESULT (String COMMONRESULT)
    {
        this.COMMONRESULT = COMMONRESULT;
    }

    public String getVEHICLECLASS ()
    {
        return VEHICLECLASS;
    }

    public void setVEHICLECLASS (String VEHICLECLASS)
    {
        this.VEHICLECLASS = VEHICLECLASS;
    }

    public String getGROUPNAME ()
    {
        return GROUPNAME;
    }

    public void setGROUPNAME (String GROUPNAME)
    {
        this.GROUPNAME = GROUPNAME;
    }

    public String getITEMNAME ()
    {
        return ITEMNAME;
    }

    public void setITEMNAME (String ITEMNAME)
    {
        this.ITEMNAME = ITEMNAME;
    }

    public String getSEQUENCENO ()
    {
        return SEQUENCENO;
    }

    public void setSEQUENCENO (String SEQUENCENO)
    {
        this.SEQUENCENO = SEQUENCENO;
    }

    public String getCOMMONSTATUS ()
    {
        return COMMONSTATUS;
    }

    public void setCOMMONSTATUS (String COMMONSTATUS)
    {
        this.COMMONSTATUS = COMMONSTATUS;
    }

    public String getTYPE ()
    {
        return TYPE;
    }

    public void setTYPE (String TYPE)
    {
        this.TYPE = TYPE;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [COMMONRESULT = "+COMMONRESULT+", VEHICLECLASS = "+VEHICLECLASS+", GROUPNAME = "+GROUPNAME+", ITEMNAME = "+ITEMNAME+", SEQUENCENO = "+SEQUENCENO+", COMMONSTATUS = "+COMMONSTATUS+", TYPE = "+TYPE+"]";
    }

	public String getCOMMONCODE() {
		return COMMONCODE;
	}

	public void setCOMMONCODE(String cOMMONCODE) {
		COMMONCODE = cOMMONCODE;
	}

	public String getALLOW_EDIT() {
		return ALLOW_EDIT;
	}

	public void setALLOW_EDIT(String aLLOW_EDIT) {
		ALLOW_EDIT = aLLOW_EDIT;
	}
}