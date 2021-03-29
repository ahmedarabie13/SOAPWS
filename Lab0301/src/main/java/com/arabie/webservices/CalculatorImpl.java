package com.arabie.webservices;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.arabie.webservices.Calculator", portName = "myPortName", serviceName = "myServiceName")
public class CalculatorImpl implements Calculator {

    @Override
    public int add(int operand1, int operand2) {
        System.out.println(operand1+operand2);
        return operand1+operand2;
    }

    @Override
    public void testStatus(int status) {
        System.out.println("this is testStatus method: "+status);
    }

    @Override
    public int echo(int input) {
        return input;
    }
    
}
