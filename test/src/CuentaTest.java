/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

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
    public void testSacarDinero() {
        System.out.println("sacarDinero");
        float dinero = 0.0F;
        Cuenta instance = new Cuenta();
        instance.sacarDinero(dinero);
    }

    /**
     * Test of meterDinero method, of class Cuenta.
     */
    @Test
    public void testMeterDinero() {
        System.out.println("meterDinero");
        float dinero = 0.0F;
        Cuenta instance = new Cuenta();
        instance.meterDinero(dinero);
    }
    
}
