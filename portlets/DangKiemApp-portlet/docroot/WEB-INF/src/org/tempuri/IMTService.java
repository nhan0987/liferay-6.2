/**
 * IMTService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IMTService extends java.rmi.Remote {
    public java.lang.String receiveResultFromMT(java.lang.String XMLData) throws java.rmi.RemoteException;
    public java.lang.String receive(java.lang.String XMLData) throws java.rmi.RemoteException;
    public java.lang.String receive2(java.lang.String XMLData) throws java.rmi.RemoteException;
    public java.lang.String CheckAvailable() throws java.rmi.RemoteException;
}
