package vn.dtt.gt.dk.api.bean.bbkt;

public class EmissionTestReport
{
    private String EmissionTestReportNumberEdit;

    private String EmissionTestReportResult;

    public String getEmissionTestReportNumberEdit ()
    {
        return EmissionTestReportNumberEdit;
    }

    public void setEmissionTestReportNumberEdit (String EmissionTestReportNumberEdit)
    {
        this.EmissionTestReportNumberEdit = EmissionTestReportNumberEdit;
    }

    public String getEmissionTestReportResult ()
    {
        return EmissionTestReportResult;
    }

    public void setEmissionTestReportResult (String EmissionTestReportResult)
    {
        this.EmissionTestReportResult = EmissionTestReportResult;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [EmissionTestReportNumberEdit = "+EmissionTestReportNumberEdit+", EmissionTestReportResult = "+EmissionTestReportResult+"]";
    }
}
