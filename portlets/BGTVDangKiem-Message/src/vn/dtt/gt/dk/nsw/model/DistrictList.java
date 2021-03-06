//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.26 at 01:59:05 PM ICT 
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
 *         &lt;element name="District" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DistrictCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DistrictName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PublicLevel" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="Arrange" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "district"
})
@XmlRootElement(name = "DistrictList")
public class DistrictList {

    @XmlElement(name = "District", required = true)
    protected List<DistrictList.District> district;

    /**
     * Gets the value of the district property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the district property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistrictList.District }
     * 
     * 
     */
    public List<DistrictList.District> getDistrict() {
        if (district == null) {
            district = new ArrayList<DistrictList.District>();
        }
        return this.district;
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
     *         &lt;element name="DistrictCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DistrictName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PublicLevel" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="Arrange" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "districtCode",
        "districtName",
        "provinceCode",
        "publicLevel",
        "arrange",
        "status"
    })
    public static class District {

        @XmlElement(name = "DistrictCode", required = true)
        protected String districtCode;
        @XmlElement(name = "DistrictName", required = true)
        protected String districtName;
        @XmlElement(name = "ProvinceCode", required = true)
        protected String provinceCode;
        @XmlElement(name = "PublicLevel")
        protected long publicLevel;
        @XmlElement(name = "Arrange")
        protected long arrange;
        @XmlElement(name = "Status")
        protected int status;

        /**
         * Gets the value of the districtCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistrictCode() {
            return districtCode;
        }

        /**
         * Sets the value of the districtCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistrictCode(String value) {
            this.districtCode = value;
        }

        /**
         * Gets the value of the districtName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistrictName() {
            return districtName;
        }

        /**
         * Sets the value of the districtName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistrictName(String value) {
            this.districtName = value;
        }

        /**
         * Gets the value of the provinceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvinceCode() {
            return provinceCode;
        }

        /**
         * Sets the value of the provinceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvinceCode(String value) {
            this.provinceCode = value;
        }

        /**
         * Gets the value of the publicLevel property.
         * 
         */
        public long getPublicLevel() {
            return publicLevel;
        }

        /**
         * Sets the value of the publicLevel property.
         * 
         */
        public void setPublicLevel(long value) {
            this.publicLevel = value;
        }

        /**
         * Gets the value of the arrange property.
         * 
         */
        public long getArrange() {
            return arrange;
        }

        /**
         * Sets the value of the arrange property.
         * 
         */
        public void setArrange(long value) {
            this.arrange = value;
        }

        /**
         * Gets the value of the status property.
         * 
         */
        public int getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         */
        public void setStatus(int value) {
            this.status = value;
        }

    }

}
