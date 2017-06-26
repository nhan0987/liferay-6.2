package org.tempuri;

public class PublishServiceSoapProxy implements org.tempuri.PublishServiceSoap {
  private String _endpoint = null;
  private org.tempuri.PublishServiceSoap publishServiceSoap = null;
  
  public PublishServiceSoapProxy() {
    _initPublishServiceSoapProxy();
  }
  
  public PublishServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPublishServiceSoapProxy();
  }
  
  private void _initPublishServiceSoapProxy() {
    try {
      publishServiceSoap = (new org.tempuri.PublishServiceLocator()).getPublishServiceSoap();
      if (publishServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)publishServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)publishServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (publishServiceSoap != null)
      ((javax.xml.rpc.Stub)publishServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.PublishServiceSoap getPublishServiceSoap() {
    if (publishServiceSoap == null)
      _initPublishServiceSoapProxy();
    return publishServiceSoap;
  }
  
  public java.lang.String importAndPublishInv(java.lang.String account, java.lang.String ACpass, java.lang.String xmlInvData, java.lang.String username, java.lang.String password, java.lang.String pattern, java.lang.String serial, int convert) throws java.rmi.RemoteException{
    if (publishServiceSoap == null)
      _initPublishServiceSoapProxy();
    return publishServiceSoap.importAndPublishInv(account, ACpass, xmlInvData, username, password, pattern, serial, convert);
  }
  
  public java.lang.String importInv(java.lang.String xmlInvData, java.lang.String username, java.lang.String password, int convert) throws java.rmi.RemoteException{
    if (publishServiceSoap == null)
      _initPublishServiceSoapProxy();
    return publishServiceSoap.importInv(xmlInvData, username, password, convert);
  }
  
  public java.lang.String publishInv(int[] invIDs, java.lang.String username, java.lang.String password, java.lang.String pattern, java.lang.String serial) throws java.rmi.RemoteException{
    if (publishServiceSoap == null)
      _initPublishServiceSoapProxy();
    return publishServiceSoap.publishInv(invIDs, username, password, pattern, serial);
  }
  
  public int updateCus(java.lang.String XMLCusData, java.lang.String username, java.lang.String pass, int convert) throws java.rmi.RemoteException{
    if (publishServiceSoap == null)
      _initPublishServiceSoapProxy();
    return publishServiceSoap.updateCus(XMLCusData, username, pass, convert);
  }
  
  public int setCusCert(java.lang.String certSerial, java.lang.String certString, java.lang.String cusCode, java.lang.String username, java.lang.String pass) throws java.rmi.RemoteException{
    if (publishServiceSoap == null)
      _initPublishServiceSoapProxy();
    return publishServiceSoap.setCusCert(certSerial, certString, cusCode, username, pass);
  }
  
  
}