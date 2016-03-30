/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison
 */
public class HubTest {
    
    public HubTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of getName method, of class Hub.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Hub instance = new Hub("test");
        String expResult = "test";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetName2() {
        System.out.println("getName");
        Hub instance = new Hub("test");
        String expResult = "bob";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setNetmask method, of class Hub.
     */
    @Test
    public void testSetNetmask() {
        System.out.println("setNetmask");
        String netmask = "255.255.255.0";
        Hub instance = new Hub("test");
        instance.setNetmask(netmask);
    }

    /**
     * Test of setNetmask method, of class Hub.
     */
    @Test
    public void testSetNetmask2() {
        System.out.println("setNetmask");
        String netmask = "255.255.255.0";
        Hub instance = null;
        instance.setNetmask(netmask);
    }
}
