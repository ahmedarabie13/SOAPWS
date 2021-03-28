package com.arabie.handler;

import javax.xml.namespace.QName;
import java.util.*;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

public class MySoapHandler implements SOAPHandler<SOAPMessageContext> {

    public boolean handleMessage(SOAPMessageContext messageContext) {
        System.out.println(messageContext);
        System.out.println("in soap handleMessage method");
        return true;
    }
    public boolean handleFault(SOAPMessageContext messageContext){
        System.out.println(messageContext);
        System.out.println("in soap handle fault method");
        return true;
    }
    
    public void close(MessageContext context) {
        System.out.println(context);
        System.out.println("in soap close method");
    }
    public Set<QName> getHeaders(){
        System.out.println("in soap getHeaders method");
        return null;
    }
}