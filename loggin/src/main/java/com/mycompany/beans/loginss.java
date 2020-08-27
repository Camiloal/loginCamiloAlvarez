/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import com.mycompany.interfaces.SakaiLogin;
import com.mycompany.webservice.SakaiLoginService;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MAGG
 */
public class loginss {

    SakaiLoginService loginSer = new SakaiLoginService();
    SakaiLogin loginCon = loginSer.getSakaiLoginPort();

    public void inicioSesion() {
        System.out.println("nananann");

        String nombre = null;
        String clave = null;

        String sesion;
        sesion = loginCon.loginCamiloAlvarez("admin", "1234");
        System.out.println("nananann"+sesion);

    }

}
