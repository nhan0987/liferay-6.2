package vn.dtt.gt.dk.api.bean.bbkt;

public class ProductionCountry
{
    private String CountryCode;

    public String getCountryCode ()
    {
        return CountryCode;
    }

    public void setCountryCode (String CountryCode)
    {
        this.CountryCode = CountryCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CountryCode = "+CountryCode+"]";
    }
}
