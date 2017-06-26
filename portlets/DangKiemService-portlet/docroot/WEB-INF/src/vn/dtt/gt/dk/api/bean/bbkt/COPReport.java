package vn.dtt.gt.dk.api.bean.bbkt;

public class COPReport
{
    private String COPReportResult;

    private String COPReportNumberEdit;

    public String getCOPReportResult ()
    {
        return COPReportResult;
    }

    public void setCOPReportResult (String COPReportResult)
    {
        this.COPReportResult = COPReportResult;
    }

    public String getCOPReportNumberEdit ()
    {
        return COPReportNumberEdit;
    }

    public void setCOPReportNumberEdit (String COPReportNumberEdit)
    {
        this.COPReportNumberEdit = COPReportNumberEdit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [COPReportResult = "+COPReportResult+", COPReportNumberEdit = "+COPReportNumberEdit+"]";
    }
}
