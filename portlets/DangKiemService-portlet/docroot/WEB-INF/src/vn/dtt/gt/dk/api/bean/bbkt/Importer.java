package vn.dtt.gt.dk.api.bean.bbkt;

public class Importer
{
    private String Phone;

    private String ImporterCode;

    private String Email;

    private String Fax;

    private String ImporterAddress;

    private String Representative;

    private String ImporterName;

    public String getPhone ()
    {
        return Phone;
    }

    public void setPhone (String Phone)
    {
        this.Phone = Phone;
    }

    public String getImporterCode ()
    {
        return ImporterCode;
    }

    public void setImporterCode (String ImporterCode)
    {
        this.ImporterCode = ImporterCode;
    }

    public String getEmail ()
    {
        return Email;
    }

    public void setEmail (String Email)
    {
        this.Email = Email;
    }

    public String getFax ()
    {
        return Fax;
    }

    public void setFax (String Fax)
    {
        this.Fax = Fax;
    }

    public String getImporterAddress ()
    {
        return ImporterAddress;
    }

    public void setImporterAddress (String ImporterAddress)
    {
        this.ImporterAddress = ImporterAddress;
    }

    public String getRepresentative ()
    {
        return Representative;
    }

    public void setRepresentative (String Representative)
    {
        this.Representative = Representative;
    }

    public String getImporterName ()
    {
        return ImporterName;
    }

    public void setImporterName (String ImporterName)
    {
        this.ImporterName = ImporterName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Phone = "+Phone+", ImporterCode = "+ImporterCode+", Email = "+Email+", Fax = "+Fax+", ImporterAddress = "+ImporterAddress+", Representative = "+Representative+", ImporterName = "+ImporterName+"]";
    }
}
