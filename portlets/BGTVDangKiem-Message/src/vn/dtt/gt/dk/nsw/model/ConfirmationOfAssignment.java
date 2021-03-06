//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 10:20:48 AM ICT 
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
 *         &lt;element name="RegisteredNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegisteredYear" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalOfRegisteredVehicle" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalOfRequested" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalOfAssigned" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DateAssigned" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ImportedVehicle" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SequenceNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="CodeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ModelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MarkAsVehicle" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "registeredNumber",
    "registeredYear",
    "totalOfRegisteredVehicle",
    "totalOfRequested",
    "totalOfAssigned",
    "dateAssigned",
    "importedVehicle"
})
@XmlRootElement(name = "ConfirmationOfAssignment")
public class ConfirmationOfAssignment {

    @XmlElement(name = "RegisteredNumber", required = true)
    protected String registeredNumber;
    @XmlElement(name = "RegisteredYear")
    protected long registeredYear;
    @XmlElement(name = "TotalOfRegisteredVehicle")
    protected long totalOfRegisteredVehicle;
    @XmlElement(name = "TotalOfRequested")
    protected long totalOfRequested;
    @XmlElement(name = "TotalOfAssigned")
    protected long totalOfAssigned;
    @XmlElement(name = "DateAssigned", required = true)
    protected String dateAssigned;
    @XmlElement(name = "ImportedVehicle", required = true)
    protected List<ConfirmationOfAssignment.ImportedVehicle> importedVehicle;

    /**
     * Gets the value of the registeredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredNumber() {
        return registeredNumber;
    }

    /**
     * Sets the value of the registeredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredNumber(String value) {
        this.registeredNumber = value;
    }

    /**
     * Gets the value of the registeredYear property.
     * 
     */
    public long getRegisteredYear() {
        return registeredYear;
    }

    /**
     * Sets the value of the registeredYear property.
     * 
     */
    public void setRegisteredYear(long value) {
        this.registeredYear = value;
    }

    /**
     * Gets the value of the totalOfRegisteredVehicle property.
     * 
     */
    public long getTotalOfRegisteredVehicle() {
        return totalOfRegisteredVehicle;
    }

    /**
     * Sets the value of the totalOfRegisteredVehicle property.
     * 
     */
    public void setTotalOfRegisteredVehicle(long value) {
        this.totalOfRegisteredVehicle = value;
    }

    /**
     * Gets the value of the totalOfRequested property.
     * 
     */
    public long getTotalOfRequested() {
        return totalOfRequested;
    }

    /**
     * Sets the value of the totalOfRequested property.
     * 
     */
    public void setTotalOfRequested(long value) {
        this.totalOfRequested = value;
    }

    /**
     * Gets the value of the totalOfAssigned property.
     * 
     */
    public long getTotalOfAssigned() {
        return totalOfAssigned;
    }

    /**
     * Sets the value of the totalOfAssigned property.
     * 
     */
    public void setTotalOfAssigned(long value) {
        this.totalOfAssigned = value;
    }

    /**
     * Gets the value of the dateAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAssigned() {
        return dateAssigned;
    }

    /**
     * Sets the value of the dateAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAssigned(String value) {
        this.dateAssigned = value;
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
     * {@link ConfirmationOfAssignment.ImportedVehicle }
     * 
     * 
     */
    public List<ConfirmationOfAssignment.ImportedVehicle> getImportedVehicle() {
        if (importedVehicle == null) {
            importedVehicle = new ArrayList<ConfirmationOfAssignment.ImportedVehicle>();
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
     *         &lt;element name="SequenceNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="CodeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ModelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MarkAsVehicle" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "tradeMark",
        "modelType",
        "chassisNumber",
        "engineNumber",
        "markAsVehicle"
    })
    public static class ImportedVehicle {

        @XmlElement(name = "SequenceNo")
        protected long sequenceNo;
        @XmlElement(name = "CodeNumber")
        protected long codeNumber;
        @XmlElement(name = "TradeMark", required = true)
        protected String tradeMark;
        @XmlElement(name = "ModelType", required = true)
        protected String modelType;
        @XmlElement(name = "ChassisNumber", required = true)
        protected String chassisNumber;
        @XmlElement(name = "EngineNumber", required = true)
        protected String engineNumber;
        @XmlElement(name = "MarkAsVehicle")
        protected int markAsVehicle;

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
         * Gets the value of the tradeMark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeMark() {
            return tradeMark;
        }

        /**
         * Sets the value of the tradeMark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeMark(String value) {
            this.tradeMark = value;
        }

        /**
         * Gets the value of the modelType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelType() {
            return modelType;
        }

        /**
         * Sets the value of the modelType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelType(String value) {
            this.modelType = value;
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
         * Gets the value of the markAsVehicle property.
         * 
         */
        public int getMarkAsVehicle() {
            return markAsVehicle;
        }

        /**
         * Sets the value of the markAsVehicle property.
         * 
         */
        public void setMarkAsVehicle(int value) {
            this.markAsVehicle = value;
        }

    }

}
