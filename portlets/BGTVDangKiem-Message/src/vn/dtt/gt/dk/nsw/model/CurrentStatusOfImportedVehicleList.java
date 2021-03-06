//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 01:15:03 PM ICT 
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
 *         &lt;element name="InspectionRecordNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InspectionRecordDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalOfRegisteredVehicle" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalOfRequested" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalOfInspected" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalOfNotYetInspected" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalOfCancelled" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ImportedVehicle" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SequenceNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="CodeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="MarkAsVehicle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ModelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EngineType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VehicleEngineStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TechnicalSpecCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "inspectionRecordNumber",
    "inspectionRecordDate",
    "totalOfRegisteredVehicle",
    "totalOfRequested",
    "totalOfInspected",
    "totalOfNotYetInspected",
    "totalOfCancelled",
    "importedVehicle"
})
@XmlRootElement(name = "CurrentStatusOfImportedVehicleList")
public class CurrentStatusOfImportedVehicleList {

    @XmlElement(name = "RegisteredNumber", required = true)
    protected String registeredNumber;
    @XmlElement(name = "InspectionRecordNumber", required = true)
    protected String inspectionRecordNumber;
    @XmlElement(name = "InspectionRecordDate", required = true)
    protected String inspectionRecordDate;
    @XmlElement(name = "TotalOfRegisteredVehicle")
    protected long totalOfRegisteredVehicle;
    @XmlElement(name = "TotalOfRequested")
    protected long totalOfRequested;
    @XmlElement(name = "TotalOfInspected")
    protected long totalOfInspected;
    @XmlElement(name = "TotalOfNotYetInspected")
    protected long totalOfNotYetInspected;
    @XmlElement(name = "TotalOfCancelled")
    protected long totalOfCancelled;
    @XmlElement(name = "ImportedVehicle", required = true)
    protected List<CurrentStatusOfImportedVehicleList.ImportedVehicle> importedVehicle;

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
     * Gets the value of the inspectionRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionRecordNumber() {
        return inspectionRecordNumber;
    }

    /**
     * Sets the value of the inspectionRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionRecordNumber(String value) {
        this.inspectionRecordNumber = value;
    }

    /**
     * Gets the value of the inspectionRecordDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionRecordDate() {
        return inspectionRecordDate;
    }

    /**
     * Sets the value of the inspectionRecordDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionRecordDate(String value) {
        this.inspectionRecordDate = value;
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
     * Gets the value of the totalOfInspected property.
     * 
     */
    public long getTotalOfInspected() {
        return totalOfInspected;
    }

    /**
     * Sets the value of the totalOfInspected property.
     * 
     */
    public void setTotalOfInspected(long value) {
        this.totalOfInspected = value;
    }

    /**
     * Gets the value of the totalOfNotYetInspected property.
     * 
     */
    public long getTotalOfNotYetInspected() {
        return totalOfNotYetInspected;
    }

    /**
     * Sets the value of the totalOfNotYetInspected property.
     * 
     */
    public void setTotalOfNotYetInspected(long value) {
        this.totalOfNotYetInspected = value;
    }

    /**
     * Gets the value of the totalOfCancelled property.
     * 
     */
    public long getTotalOfCancelled() {
        return totalOfCancelled;
    }

    /**
     * Sets the value of the totalOfCancelled property.
     * 
     */
    public void setTotalOfCancelled(long value) {
        this.totalOfCancelled = value;
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
     * {@link CurrentStatusOfImportedVehicleList.ImportedVehicle }
     * 
     * 
     */
    public List<CurrentStatusOfImportedVehicleList.ImportedVehicle> getImportedVehicle() {
        if (importedVehicle == null) {
            importedVehicle = new ArrayList<CurrentStatusOfImportedVehicleList.ImportedVehicle>();
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
     *         &lt;element name="MarkAsVehicle" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ModelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EngineType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VehicleEngineStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "sequenceNo",
        "codeNumber",
        "markAsVehicle",
        "tradeMark",
        "modelType",
        "vehicleType",
        "engineType",
        "chassisNumber",
        "engineNumber",
        "vehicleEngineStatus",
        "technicalSpecCode"
    })
    public static class ImportedVehicle {

        @XmlElement(name = "SequenceNo")
        protected long sequenceNo;
        @XmlElement(name = "CodeNumber")
        protected long codeNumber;
        @XmlElement(name = "MarkAsVehicle")
        protected int markAsVehicle;
        @XmlElement(name = "TradeMark", required = true)
        protected String tradeMark;
        @XmlElement(name = "ModelType", required = true)
        protected String modelType;
        @XmlElement(name = "VehicleType", required = true)
        protected String vehicleType;
        @XmlElement(name = "EngineType", required = true)
        protected String engineType;
        @XmlElement(name = "ChassisNumber", required = true)
        protected String chassisNumber;
        @XmlElement(name = "EngineNumber", required = true)
        protected String engineNumber;
        @XmlElement(name = "VehicleEngineStatus", required = true)
        protected String vehicleEngineStatus;
        @XmlElement(name = "TechnicalSpecCode", required = true)
        protected String technicalSpecCode;

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
         * Gets the value of the vehicleType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleType() {
            return vehicleType;
        }

        /**
         * Sets the value of the vehicleType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleType(String value) {
            this.vehicleType = value;
        }

        /**
         * Gets the value of the engineType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEngineType() {
            return engineType;
        }

        /**
         * Sets the value of the engineType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEngineType(String value) {
            this.engineType = value;
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
         * Gets the value of the vehicleEngineStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleEngineStatus() {
            return vehicleEngineStatus;
        }

        /**
         * Sets the value of the vehicleEngineStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleEngineStatus(String value) {
            this.vehicleEngineStatus = value;
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

}
