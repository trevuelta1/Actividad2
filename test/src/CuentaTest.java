/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CuentaTest extends TestCase{
    
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sacarDinero method, of class Cuenta.
     */
    @Test
    public void cuenta12345() {
        try {
            System.out.println("Cuenta #12345");
            Cuenta instance = new Cuenta();
            instance.sacarDinero(200);
            instance.meterDinero(100);
            instance.sacarDinero(200);
            System.out.println("Balance: " + instance.getBalance() + "€");
        } catch (Exception ex) {
            Logger.getLogger(CuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of meterDinero method, of class Cuenta.
     */
    @Test
    public void cuenta67890() {
        try {
            System.out.println("Cuenta #67890");
            Cuenta instance = new Cuenta();
            instance.sacarDinero(350);
            instance.sacarDinero(200);
            instance.sacarDinero(150);
            instance.meterDinero(50);
            instance.sacarDinero(100);
            System.out.println("Balance: " + instance.getBalance() + "€");
        } catch (Exception ex) {
            Logger.getLogger(CuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
