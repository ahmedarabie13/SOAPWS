package com.arabie.handler;

import jakarta.xml.ws.handler.LogicalHandler;
import jakarta.xml.ws.handler.LogicalMessageContext;
import jakarta.xml.ws.handler.MessageContext;

public class MyLogicalHandler implements LogicalHandler<LogicalMessageContext> {
    
    public boolean handleMessage(LogicalMessageContext messageContext) {
        System.out.println(messageContext);
        System.out.println("handle Message method");
        return true;
    }
    
    public boolean handleFault(LogicalMessageContext messageContext){
        System.out.println(messageContext);
        System.out.println("handle fault method");
        return true;
    }
    
    public void close(MessageContext context) {
        System.out.println(context);
        System.out.println("close method");
    }

}