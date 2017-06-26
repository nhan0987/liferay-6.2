package vn.dtt.gt.dk.api.bean.bbkt;

public class SafetyTestReport
{
    private String SafetyTestReportNumberEdit;

    private String SafetyTestReportResult;

    public String getSafetyTestReportNumberEdit ()
    {
        return SafetyTestReportNumberEdit;
    }

    public void setSafetyTestReportNumberEdit (String SafetyTestReportNumberEdit)
    {
        this.SafetyTestReportNumberEdit = SafetyTestReportNumberEdit;
    }

    public String getSafetyTestReportResult ()
    {
        return SafetyTestReportResult;
    }

    public void setSafetyTestReportResult (String SafetyTestReportResult)
    {
        this.SafetyTestReportResult = SafetyTestReportResult;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SafetyTestReportNumberEdit = "+SafetyTestReportNumberEdit+", SafetyTestReportResult = "+SafetyTestReportResult+"]";
    }
}