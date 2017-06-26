//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.06 at 04:02:44 PM ICT 
//


package vn.dtt.gt.dk.nsw.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReasonForEndorsement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttachedFile" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AttachedTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AttachedTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AttachedDocName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AttachedNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AttachedSequenceNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="FullFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SHA1FileContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Base64FileContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TechnicalSpecCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ImportedVehicle" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SequenceNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="CodeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProductionYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VehicleEngineStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="VehicleUnitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VehicleColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestDate",
    "organization",
    "division",
    "name",
    "reasonForEndorsement",
    "attachedFile",
    "importedVehicle"
})
@XmlRootElement(name = "FileEndorsement")
public class FileEndorsement {

    @XmlElement(name = "RequestDate", required = true)
    protected String requestDate;
    @XmlElement(name = "Organization", required = true)
    protected String organization;
    @XmlElement(name = "Division", required = true)
    protected String division;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ReasonForEndorsement", required = true)
    protected String reasonForEndorsement;
    @XmlElement(name = "AttachedFile", required = true)
    protected List<FileEndorsement.AttachedFile> attachedFile;
    @XmlElement(name = "ImportedVehicle", required = true)
    protected List<FileEndorsement.ImportedVehicle> importedVehicle;

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDate(String value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the reasonForEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForEndorsement() {
        return reasonForEndorsement;
    }

    /**
     * Sets the value of the reasonForEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForEndorsement(String value) {
        this.reasonForEndorsement = value;
    }

    /**
     * Gets the value of the attachedFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileEndorsement.AttachedFile }
     * 
     * 
     */
    public List<FileEndorsement.AttachedFile> getAttachedFile() {
        if (attachedFile == null) {
            attachedFile = new ArrayList<FileEndorsement.AttachedFile>();
        }
        return this.attachedFile;
    }

    /**
     * Gets the value of the importedVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importedVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportedVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileEndorsement.ImportedVehicle }
     * 
     * 
     */
    public List<FileEndorsement.ImportedVehicle> getImportedVehicle() {
        if (importedVehicle == null) {
            importedVehicle = new ArrayList<FileEndorsement.ImportedVehicle>();
        }
        return this.importedVehicle;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AttachedTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AttachedTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AttachedDocName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AttachedNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AttachedSequenceNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="FullFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SHA1FileContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Base64FileContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TechnicalSpecCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attachedTypeCode",
        "attachedTypeName",
        "attachedDocName",
        "attachedNote",
        "attachedSequenceNo",
        "fullFileName",
        "sha1FileContent",
        "base64FileContent",
        "technicalSpecCode"
    })
    public static class AttachedFile {

        @XmlElement(name = "AttachedTypeCode", required = true)
        protected String attachedTypeCode;
        @XmlElement(name = "AttachedTypeName", required = true)
        protected String attachedTypeName;
        @XmlElement(name = "AttachedDocName", required = true)
        protected String attachedDocName;
        @XmlElement(name = "AttachedNote", required = true)
        protected String attachedNote;
        @XmlElement(name = "AttachedSequenceNo")
        protected int attachedSequenceNo;
        @XmlElement(name = "FullFileName", required = true)
        protected String fullFileName;
        @XmlElement(name = "SHA1FileContent", required = true)
        protected String sha1FileContent;
        @XmlElement(name = "Base64FileContent", required = true)
        protected String base64FileContent;
        @XmlElement(name = "TechnicalSpecCode", required = true)
        protected String technicalSpecCode;

        /**
         * Gets the value of the attachedTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttachedTypeCode() {
            return attachedTypeCode;
        }

        /**
         * Sets the value of the attachedTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttachedTypeCode(String value) {
            this.attachedTypeCode = value;
        }

        /**
         * Gets the value of the attachedTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttachedTypeName() {
            return attachedTypeName;
        }

        /**
         * Sets the value of the attachedTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttachedTypeName(String value) {
            this.attachedTypeName = value;
        }

        /**
         * Gets the value of the attachedDocName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttachedDocName() {
            return attachedDocName;
        }

        /**
         * Sets the value of the attachedDocName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttachedDocName(String value) {
            this.attachedDocName = value;
        }

        /**
         * Gets the value of the attachedNote property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttachedNote() {
            return attachedNote;
        }

        /**
         * Sets the value of the attachedNote property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttachedNote(String value) {
            this.attachedNote = value;
        }

        /**
         * Gets the value of the attachedSequenceNo property.
         * 
         */
        public int getAttachedSequenceNo() {
            return attachedSequenceNo;
        }

        /**
         * Sets the value of the attachedSequenceNo property.
         * 
         */
        public void setAttachedSequenceNo(int value) {
            this.attachedSequenceNo = value;
        }

        /**
         * Gets the value of the fullFileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullFileName() {
            return fullFileName;
        }

        /**
         * Sets the value of the fullFileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullFileName(String value) {
            this.fullFileName = value;
        }

        /**
         * Gets the value of the sha1FileContent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSHA1FileContent() {
            return sha1FileContent;
        }

        /**
         * Sets the value of the sha1FileContent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSHA1FileContent(String value) {
            this.sha1FileContent = value;
        }

        /**
         * Gets the value of the base64FileContent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBase64FileContent() {
            return base64FileContent;
        }

        /**
         * Sets the value of the base64FileContent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBase64FileContent(String value) {
            this.base64FileContent = value;
        }

        /**
         * Gets the value of the technicalSpecCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicalSpecCode() {
            return technicalSpecCode;
        }

        /**
         * Sets the value of the technicalSpecCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnicalSpecCode(String value) {
            this.technicalSpecCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SequenceNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="CodeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProductionYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VehicleEngineStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="VehicleUnitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VehicleColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sequenceNo",
        "codeNumber",
        "chassisNumber",
        "engineNumber",
        "productionYear",
        "vehicleEngineStatus",
        "vehicleUnitPrice",
        "currency",
        "vehicleColor"
    })
    public static class ImportedVehicle {

        @XmlElement(name = "SequenceNo")
        protected long sequenceNo;
        @XmlElement(name = "CodeNumber")
        protected long codeNumber;
        @XmlElement(name = "ChassisNumber", required = true)
        protected String chassisNumber;
        @XmlElement(name = "EngineNumber", required = true)
        protected String engineNumber;
        @XmlElement(name = "ProductionYear", required = true)
        protected String productionYear;
        @XmlElement(name = "VehicleEngineStatus")
        protected int vehicleEngineStatus;
        @XmlElement(name = "VehicleUnitPrice")
        protected double vehicleUnitPrice;
        @XmlElement(name = "Currency", required = true)
        protected String currency;
        @XmlElement(name = "VehicleColor", required = true)
        protected String vehicleColor;

        /**
         * Gets the value of the sequenceNo property.
         * 
         */
        public long getSequenceNo() {
            return sequenceNo;
        }

        /**
         * Sets the value of the sequenceNo property.
         * 
         */
        public void setSequenceNo(long value) {
            this.sequenceNo = value;
        }

        /**
         * Gets the value of the codeNumber property.
         * 
         */
        public long getCodeNumber() {
            return codeNumber;
        }

        /**
         * Sets the value of the codeNumber property.
         * 
         */
        public void setCodeNumber(long value) {
            this.codeNumber = value;
        }

        /**
         * Gets the value of the chassisNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChassisNumber() {
            return chassisNumber;
        }

        /**
         * Sets the value of the chassisNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChassisNumber(String value) {
            this.chassisNumber = value;
        }

        /**
         * Gets the value of the engineNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEngineNumber() {
            return engineNumber;
        }

        /**
         * Sets the value of the engineNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEngineNumber(String value) {
            this.engineNumber = value;
        }

        /**
         * Gets the value of the productionYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductionYear() {
            return productionYear;
        }

        /**
         * Sets the value of the productionYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductionYear(String value) {
            this.productionYear = value;
        }

        /**
         * Gets the value of the vehicleEngineStatus property.
         * 
         */
        public int getVehicleEngineStatus() {
            return vehicleEngineStatus;
        }

        /**
         * Sets the value of the vehicleEngineStatus property.
         * 
         */
        public void setVehicleEngineStatus(int value) {
            this.vehicleEngineStatus = value;
        }

        /**
         * Gets the value of the vehicleUnitPrice property.
         * 
         */
        public double getVehicleUnitPrice() {
            return vehicleUnitPrice;
        }

        /**
         * Sets the value of the vehicleUnitPrice property.
         * 
         */
        public void setVehicleUnitPrice(double value) {
            this.vehicleUnitPrice = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the vehicleColor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleColor() {
            return vehicleColor;
        }

        /**
         * Sets the value of the vehicleColor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleColor(String value) {
            this.vehicleColor = value;
        }

    }

}
