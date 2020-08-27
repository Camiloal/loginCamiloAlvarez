/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.interfaces.SakaiLogin;
import com.mycompany.webservice.SakaiLoginService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MAGG
 */
public class test {

    @Test
    public void testLogin() {
        SakaiLoginService loginSer = new SakaiLoginService();
        SakaiLogin loginCon = loginSer.getSakaiLoginPort();
        String sesion = loginCon.loginCamiloAlvarez("admin", "admin");
        System.out.println("si: "+sesion);
    }

}
