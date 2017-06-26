/**
 * PublishServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PublishServiceLocator extends org.apache.axis.client.Service implements org.tempuri.PublishService {

    public PublishServiceLocator() {
    }


    public PublishServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PublishServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PublishServiceSoap
    //for prodserver
    private java.lang.String PublishServiceSoap_address = "https://vradmin.vnpt-invoice.com.vn/PublishService.asmx";
    
    //for testserver 
   // private java.lang.String PublishServiceSoap_address = "https://vradmintest.vnpt-invoice.com.vn/PublishService.asmx";

    public java.lang.String getPublishServiceSoapAddress() {
        return PublishServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PublishServiceSoapWSDDServiceName = "PublishServiceSoap";

    public java.lang.String getPublishServiceSoapWSDDServiceName() {
        return PublishServiceSoapWSDDServiceName;
    }

    public void setPublishServiceSoapWSDDServiceName(java.lang.String name) {
        PublishServiceSoapWSDDServiceName = name;
    }

    public org.tempuri.PublishServiceSoap getPublishServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PublishServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPublishServiceSoap(endpoint);
    }

    public org.tempuri.PublishServiceSoap getPublishServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.PublishServiceSoapStub _stub = new org.tempuri.PublishServiceSoapStub(portAddress, this);
            _stub.setPortName(getPublishServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPublishServiceSoapEndpointAddress(java.lang.String address) {
        PublishServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.PublishServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.PublishServiceSoapStub _stub = new org.tempuri.PublishServiceSoapStub(new java.net.URL(PublishServiceSoap_address), this);
                _stub.setPortName(getPublishServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PublishServiceSoap".equals(inputPortName)) {
            return getPublishServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "PublishService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "PublishServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PublishServiceSoap".equals(portName)) {
            setPublishServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
