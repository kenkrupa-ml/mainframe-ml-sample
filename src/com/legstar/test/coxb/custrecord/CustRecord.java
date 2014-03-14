
package com.legstar.test.coxb.custrecord;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for CustRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="custName" type="{http://coxb.test.legstar.com/custrecord}CustName"/>
 *         &lt;element name="streetAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="city">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="usState">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="otherStateProvince">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="countryCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="postalCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="notes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "CustRecord", propOrder = {
    "custId",
    "custName",
    "streetAddress",
    "city",
    "usState",
    "otherStateProvince",
    "countryCode",
    "postalCode",
    "notes"
})
public class CustRecord
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @CobolElement(cobolName = "CUST-ID", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 5, picture = "9(5)", usage = "PACKED-DECIMAL", srceLine = 2)
    protected long custId;
    @XmlElement(required = true)
    @CobolElement(cobolName = "CUST-NAME", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 3)
    protected CustName custName;
    @XmlElement(required = true)
    @CobolElement(cobolName = "STREET-ADDRESS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", srceLine = 6)
    protected String streetAddress;
    @XmlElement(required = true)
    @CobolElement(cobolName = "CITY", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", srceLine = 7)
    protected String city;
    @XmlElement(required = true)
    @CobolElement(cobolName = "US-STATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(02)", srceLine = 8)
    protected String usState;
    @XmlElement(required = true)
    @CobolElement(cobolName = "OTHER-STATE-PROVINCE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", srceLine = 9)
    protected String otherStateProvince;
    @XmlElement(required = true)
    @CobolElement(cobolName = "COUNTRY-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(3)", srceLine = 10)
    protected String countryCode;
    @XmlElement(required = true)
    @CobolElement(cobolName = "POSTAL-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(10)", srceLine = 11)
    protected String postalCode;
    @XmlElement(required = true)
    @CobolElement(cobolName = "NOTES", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(40)", srceLine = 12)
    protected String notes;

    /**
     * Gets the value of the custId property.
     * 
     */
    public long getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     */
    public void setCustId(long value) {
        this.custId = value;
    }

    public boolean isSetCustId() {
        return true;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link CustName }
     *     
     */
    public CustName getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustName }
     *     
     */
    public void setCustName(CustName value) {
        this.custName = value;
    }

    public boolean isSetCustName() {
        return (this.custName!= null);
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    public boolean isSetStreetAddress() {
        return (this.streetAddress!= null);
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    public boolean isSetCity() {
        return (this.city!= null);
    }

    /**
     * Gets the value of the usState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsState() {
        return usState;
    }

    /**
     * Sets the value of the usState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsState(String value) {
        this.usState = value;
    }

    public boolean isSetUsState() {
        return (this.usState!= null);
    }

    /**
     * Gets the value of the otherStateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStateProvince() {
        return otherStateProvince;
    }

    /**
     * Sets the value of the otherStateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStateProvince(String value) {
        this.otherStateProvince = value;
    }

    public boolean isSetOtherStateProvince() {
        return (this.otherStateProvince!= null);
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    public boolean isSetCountryCode() {
        return (this.countryCode!= null);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public boolean isSetPostalCode() {
        return (this.postalCode!= null);
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    public boolean isSetNotes() {
        return (this.notes!= null);
    }

}
