/**
 * PublishServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface PublishServiceSoap extends java.rmi.Remote {
    public java.lang.String importAndPublishInv(java.lang.String account, java.lang.String ACpass, java.lang.String xmlInvData, java.lang.String username, java.lang.String password, java.lang.String pattern, java.lang.String serial, int convert) throws java.rmi.RemoteException;
    public java.lang.String importInv(java.lang.String xmlInvData, java.lang.String username, java.lang.String password, int convert) throws java.rmi.RemoteException;
    public java.lang.String publishInv(int[] invIDs, java.lang.String username, java.lang.String password, java.lang.String pattern, java.lang.String serial) throws java.rmi.RemoteException;
    public int updateCus(java.lang.String XMLCusData, java.lang.String username, java.lang.String pass, int convert) throws java.rmi.RemoteException;
    public int setCusCert(java.lang.String certSerial, java.lang.String certString, java.lang.String cusCode, java.lang.String username, java.lang.String pass) throws java.rmi.RemoteException;
}
