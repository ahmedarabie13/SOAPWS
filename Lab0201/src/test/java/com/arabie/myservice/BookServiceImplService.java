
package com.arabie.myservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0-M2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookServiceImplService", targetNamespace = "http://webservices.arabie.com/", wsdlLocation = "http://localhost:9191/SOAPLab0201/ws/book?wsdl")
public class BookServiceImplService
    extends Service
{

    private final static URL BOOKSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException BOOKSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName BOOKSERVICEIMPLSERVICE_QNAME = new QName("http://webservices.arabie.com/", "BookServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9191/SOAPLab0201/ws/book?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        BOOKSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public BookServiceImplService() {
        super(__getWsdlLocation(), BOOKSERVICEIMPLSERVICE_QNAME);
    }

    public BookServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKSERVICEIMPLSERVICE_QNAME, features);
    }

    public BookServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, BOOKSERVICEIMPLSERVICE_QNAME);
    }

    public BookServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKSERVICEIMPLSERVICE_QNAME, features);
    }

    public BookServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceImplPort")
    public BookService getBookServiceImplPort() {
        return super.getPort(new QName("http://webservices.arabie.com/", "BookServiceImplPort"), BookService.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns BookService
     */
    @WebEndpoint(name = "BookServiceImplPort")
    public BookService getBookServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.arabie.com/", "BookServiceImplPort"), BookService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw BOOKSERVICEIMPLSERVICE_EXCEPTION;
        }
        return BOOKSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}