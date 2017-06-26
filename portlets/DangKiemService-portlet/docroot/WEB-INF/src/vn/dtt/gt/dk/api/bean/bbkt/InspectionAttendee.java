package vn.dtt.gt.dk.api.bean.bbkt;

public class InspectionAttendee
{
    private String AttendeeID;

    private String AttendeeName;

    private String AttendeeRole;

    public String getAttendeeID ()
    {
        return AttendeeID;
    }

    public void setAttendeeID (String AttendeeID)
    {
        this.AttendeeID = AttendeeID;
    }

    public String getAttendeeName ()
    {
        return AttendeeName;
    }

    public void setAttendeeName (String AttendeeName)
    {
        this.AttendeeName = AttendeeName;
    }

    public String getAttendeeRole ()
    {
        return AttendeeRole;
    }

    public void setAttendeeRole (String AttendeeRole)
    {
        this.AttendeeRole = AttendeeRole;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [AttendeeID = "+AttendeeID+", AttendeeName = "+AttendeeName+", AttendeeRole = "+AttendeeRole+"]";
    }
}