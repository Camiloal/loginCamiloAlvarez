
package com.mycompany.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SakaiLogin", targetNamespace = "http://webservices.sakaiproject.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SakaiLogin {


    /**
     * 
     * @param pw
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String loginToServerGET(
        @WebParam(name = "id", partName = "id")
        String id,
        @WebParam(name = "pw", partName = "pw")
        String pw);

    /**
     * 
     * @param pw
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String loginToServer(
        @WebParam(name = "id", partName = "id")
        String id,
        @WebParam(name = "pw", partName = "pw")
        String pw);

    /**
     * 
     * @param sessionid
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean logout(
        @WebParam(name = "sessionid", partName = "sessionid")
        String sessionid);

    /**
     * 
     * @param pw
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String login(
        @WebParam(name = "id", partName = "id")
        String id,
        @WebParam(name = "pw", partName = "pw")
        String pw);

    /**
     * 
     * @param pw
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String loginGET(
        @WebParam(name = "id", partName = "id")
        String id,
        @WebParam(name = "pw", partName = "pw")
        String pw);

    /**
     * 
     * @param sessionid
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean logoutGET(
        @WebParam(name = "sessionid", partName = "sessionid")
        String sessionid);
    
    /**
     * 
     * @param pw
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String loginCamiloAlvarez(
        @WebParam(name = "id", partName = "id")
        String id,
        @WebParam(name = "pw", partName = "pw")
        String pw);

}
