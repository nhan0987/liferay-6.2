//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.17 at 07:23:04 PM ICT 
//


package vn.dtt.gt.dk.nsw.fac;

import javax.xml.bind.annotation.XmlRegistry;

import vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the vn package. 
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
public class ConfirmCertificateCancellationFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: vn
     * 
     */
    public ConfirmCertificateCancellationFactory() {
    }

    /**
     * Create an instance of {@link ConfirmCertificateCancellation }
     * 
     */
    public ConfirmCertificateCancellation createConfirmCertificateCancellation() {
        return new ConfirmCertificateCancellation();
    }

    /**
     * Create an instance of {@link ConfirmCertificateCancellation.CertificateDetails }
     * 
     */
    public ConfirmCertificateCancellation.CertificateDetails createConfirmCertificateCancellationCertificateDetails() {
        return new ConfirmCertificateCancellation.CertificateDetails();
    }

    /**
     * Create an instance of {@link ConfirmCertificateCancellation.AttachedFile }
     * 
     */
    public ConfirmCertificateCancellation.AttachedFile createConfirmCertificateCancellationAttachedFile() {
        return new ConfirmCertificateCancellation.AttachedFile();
    }

}
