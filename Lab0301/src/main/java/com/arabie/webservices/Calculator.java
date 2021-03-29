package com.arabie.webservices;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.ParameterStyle;
import jakarta.jws.soap.SOAPBinding.Style;
import jakarta.jws.soap.SOAPBinding.Use;
// @WebService
@WebService(name = "myPortTypeName",targetNamespace = "myTargetNameSpace")
@SOAPBinding(style = Style.RPC,parameterStyle = ParameterStyle.WRAPPED,use =Use.LITERAL)
public interface Calculator {
    // @WebMethod(operationName = "AddToNums")
    @WebMethod(exclude = true)
    public int add(int operand1, int operand2);
    
    @WebMethod
    public void testStatus(int status);
    
    @WebMethod
    @WebResult(name = "myResultName",header = true)
    // @WebResult(name = "myResultName",header = true,partName = "myPartNameResult")
    // @WebResult(name = "myResultName",header = false,partName = "myPartNameResult")
    public int echo(@WebParam(name = "myParamName")int input);
}
