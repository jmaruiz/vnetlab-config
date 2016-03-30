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
public class VMTest {
    
    public VMTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setEth0 method, of class VM.
     */
    @Test
    public void testSetEth0() {
        System.out.println("setEth0");
        String eth0 = "192.168.10.2";
        VM instance = new VM("test");
        instance.setEth0(eth0);
    }
    
    /**
     * Test of setEth0 method, of class VM.
     */
    @Test
    public void testSetEth02() {
        System.out.println("setEth0");
        String eth0 = "192.168.10.4";
        VM instance = null;
        instance.setEth0(eth0);
    }
}
