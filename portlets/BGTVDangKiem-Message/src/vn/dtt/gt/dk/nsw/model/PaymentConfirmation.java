//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 01:20:17 PM ICT 
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
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DebitNoteNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReportDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentSummary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TotalOfPayment" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="TotalOfVehicle" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *                   &lt;element name="RegisteredNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="InspectionRecordNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="InspectionRecordDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MarkAsVehicle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ModelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EngineType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VehicleEngineStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="MarkasPayment" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "transactionID",
    "debitNoteNumber",
    "reportDate",
    "paymentSummary",
    "importedVehicle"
})
@XmlRootElement(name = "PaymentConfirmation")
public class PaymentConfirmation {

    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "DebitNoteNumber", required = true)
    protected String debitNoteNumber;
    @XmlElement(name = "ReportDate", required = true)
    protected String reportDate;
    @XmlElement(name = "PaymentSummary", required = true)
    protected PaymentConfirmation.PaymentSummary paymentSummary;
    @XmlElement(name = "ImportedVehicle", required = true)
    protected List<PaymentConfirmation.ImportedVehicle> importedVehicle;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the debitNoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitNoteNumber() {
        return debitNoteNumber;
    }

    /**
     * Sets the value of the debitNoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitNoteNumber(String value) {
        this.debitNoteNumber = value;
    }

    /**
     * Gets the value of the reportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDate() {
        return reportDate;
    }

    /**
     * Sets the value of the reportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDate(String value) {
        this.reportDate = value;
    }

    /**
     * Gets the value of the paymentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentConfirmation.PaymentSummary }
     *     
     */
    public PaymentConfirmation.PaymentSummary getPaymentSummary() {
        return paymentSummary;
    }

    /**
     * Sets the value of the paymentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentConfirmation.PaymentSummary }
     *     
     */
    public void setPaymentSummary(PaymentConfirmation.PaymentSummary value) {
        this.paymentSummary = value;
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
     * {@link PaymentConfirmation.ImportedVehicle }
     * 
     * 
     */
    public List<PaymentConfirmation.ImportedVehicle> getImportedVehicle() {
        if (importedVehicle == null) {
            importedVehicle = new ArrayList<PaymentConfirmation.ImportedVehicle>();
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
     *         &lt;element name="RegisteredNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="InspectionRecordNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="InspectionRecordDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MarkAsVehicle" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ModelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EngineType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VehicleEngineStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="MarkasPayment" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "registeredNumber",
        "inspectionRecordNumber",
        "inspectionRecordDate",
        "markAsVehicle",
        "tradeMark",
        "modelType",
        "vehicleType",
        "engineType",
        "chassisNumber",
        "engineNumber",
        "vehicleEngineStatus",
        "markasPayment"
    })
    public static class ImportedVehicle {

        @XmlElement(name = "SequenceNo")
        protected long sequenceNo;
        @XmlElement(name = "CodeNumber")
        protected long codeNumber;
        @XmlElement(name = "RegisteredNumber", required = true)
        protected String registeredNumber;
        @XmlElement(name = "InspectionRecordNumber", required = true)
        protected String inspectionRecordNumber;
        @XmlElement(name = "InspectionRecordDate", required = true)
        protected String inspectionRecordDate;
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
        @XmlElement(name = "VehicleEngineStatus")
        protected int vehicleEngineStatus;
        @XmlElement(name = "MarkasPayment")
        protected int markasPayment;

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
         * Gets the value of the markasPayment property.
         * 
         */
        public int getMarkasPayment() {
            return markasPayment;
        }

        /**
         * Sets the value of the markasPayment property.
         * 
         */
        public void setMarkasPayment(int value) {
            this.markasPayment = value;
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
     *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TotalOfPayment" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="TotalOfVehicle" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        "paymentDate",
        "totalOfPayment",
        "totalOfVehicle"
    })
    public static class PaymentSummary {

        @XmlElement(name = "PaymentDate", required = true)
        protected String paymentDate;
        @XmlElement(name = "TotalOfPayment")
        protected long totalOfPayment;
        @XmlElement(name = "TotalOfVehicle")
        protected long totalOfVehicle;

        /**
         * Gets the value of the paymentDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentDate() {
            return paymentDate;
        }

        /**
         * Sets the value of the paymentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentDate(String value) {
            this.paymentDate = value;
        }

        /**
         * Gets the value of the totalOfPayment property.
         * 
         */
        public long getTotalOfPayment() {
            return totalOfPayment;
        }

        /**
         * Sets the value of the totalOfPayment property.
         * 
         */
        public void setTotalOfPayment(long value) {
            this.totalOfPayment = value;
        }

        /**
         * Gets the value of the totalOfVehicle property.
         * 
         */
        public long getTotalOfVehicle() {
            return totalOfVehicle;
        }

        /**
         * Sets the value of the totalOfVehicle property.
         * 
         */
        public void setTotalOfVehicle(long value) {
            this.totalOfVehicle = value;
        }

    }

}