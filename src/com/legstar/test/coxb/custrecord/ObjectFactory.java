
package com.legstar.test.coxb.custrecord;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.legstar.test.coxb.custrecord package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustRecord_QNAME = new QName("http://coxb.test.legstar.com/custrecord", "custRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.legstar.test.coxb.custrecord
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustName }
     * 
     */
    public CustName createCustName() {
        return new CustName();
    }

    /**
     * Create an instance of {@link CustRecord }
     * 
     */
    public CustRecord createCustRecord() {
        return new CustRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coxb.test.legstar.com/custrecord", name = "custRecord")
    public JAXBElement<CustRecord> createCustRecord(CustRecord value) {
        return new JAXBElement<CustRecord>(_CustRecord_QNAME, CustRecord.class, null, value);
    }

}
