
package com.legstar.test.coxb.custrecord;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for CustName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custLastName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="custFirstName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
@XmlType(name = "CustName", propOrder = {
    "custLastName",
    "custFirstName"
})
public class CustName
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @CobolElement(cobolName = "CUST-LAST-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 10, picture = "X(15)", srceLine = 4)
    protected String custLastName;
    @XmlElement(required = true)
    @CobolElement(cobolName = "CUST-FIRST-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 10, picture = "X(10)", srceLine = 5)
    protected String custFirstName;

    /**
     * Gets the value of the custLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLastName() {
        return custLastName;
    }

    /**
     * Sets the value of the custLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLastName(String value) {
        this.custLastName = value;
    }

    public boolean isSetCustLastName() {
        return (this.custLastName!= null);
    }

    /**
     * Gets the value of the custFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustFirstName() {
        return custFirstName;
    }

    /**
     * Sets the value of the custFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustFirstName(String value) {
        this.custFirstName = value;
    }

    public boolean isSetCustFirstName() {
        return (this.custFirstName!= null);
    }

}
