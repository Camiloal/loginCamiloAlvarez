package com.mycompany.webservice;

import com.mycompany.interfaces.SakaiLogin;
import java.net.MalformedURLException;
import java.net.URL;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.3.2 Generated source
 * version: 2.2
 *
 */
@WebServiceClient(name = "SakaiLoginService", targetNamespace = "http://webservices.sakaiproject.org/", wsdlLocation = "https://qa12-mysql.nightly.sakaiproject.org/sakai-ws/soap/login?wsdl")
public class SakaiLoginService
        extends Service implements SakaiLogin {

    private final static URL SAKAILOGINSERVICE_WSDL_LOCATION;
    private final static WebServiceException SAKAILOGINSERVICE_EXCEPTION;
    private final static QName SAKAILOGINSERVICE_QNAME = new QName("http://webservices.sakaiproject.org/", "SakaiLoginService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://qa12-mysql.nightly.sakaiproject.org/sakai-ws/soap/login?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAKAILOGINSERVICE_WSDL_LOCATION = url;
        SAKAILOGINSERVICE_EXCEPTION = e;
    }

    public SakaiLoginService() {
        super(__getWsdlLocation(), SAKAILOGINSERVICE_QNAME);
    }

    public SakaiLoginService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAKAILOGINSERVICE_QNAME, features);
    }

    public SakaiLoginService(URL wsdlLocation) {
        super(wsdlLocation, SAKAILOGINSERVICE_QNAME);
    }

    public SakaiLoginService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAKAILOGINSERVICE_QNAME, features);
    }

    public SakaiLoginService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SakaiLoginService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return returns SakaiLogin
     */
    @WebEndpoint(name = "SakaiLoginPort")
    public SakaiLogin getSakaiLoginPort() {
        return super.getPort(new QName("http://webservices.sakaiproject.org/", "SakaiLoginPort"), SakaiLogin.class);
    }

    /**
     *
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to
     * configure on the proxy. Supported features not in the
     * <code>features</code> parameter will have their default values.
     * @return returns SakaiLogin
     */
    @WebEndpoint(name = "SakaiLoginPort")
    public SakaiLogin getSakaiLoginPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.sakaiproject.org/", "SakaiLoginPort"), SakaiLogin.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAKAILOGINSERVICE_EXCEPTION != null) {
            throw SAKAILOGINSERVICE_EXCEPTION;
        }
        return SAKAILOGINSERVICE_WSDL_LOCATION;
    }

    @Override
    public String loginToServerGET(String id, String pw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String loginToServer(String id, String pw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean logout(String sessionid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String login(String id, String pw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String loginGET(String id, String pw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean logoutGET(String sessionid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String loginCamiloAlvarez(String id, String pw) {
        String sesion = "";

        try {
            if (id.equals("admin") && pw.equals("1234")) {
                FacesContext facesContext = FacesContext.getCurrentInstance();
                HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
                sesion = (String) session.getAttribute("group");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sesion;
    }

}
