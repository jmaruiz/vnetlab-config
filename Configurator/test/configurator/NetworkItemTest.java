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
public class NetworkItemTest {
    
    public NetworkItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of generateString method, of class NetworkItem.
     */
    @Test
    public void testGenerateString() {
        System.out.println("generateString");
        NetworkItem instance = new NetworkItem();
        String expResult = "test";
        String result = instance.generateString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addConn method, of class NetworkItem.
     */
    @Test
    public void testAddConn() {
        System.out.println("addConn");
        String port = "23";
        String conn = "4";
        NetworkItem instance = new NetworkItem();
        String expResult = "23,4";
        String result = instance.addConn(port, conn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeConn method, of class NetworkItem.
     */
    @Test
    public void testRemoveConn() {
        System.out.println("removeConn");
        String port = "";
        NetworkItem instance = new NetworkItem();
        String expResult = "";
        String result = instance.removeConn(port);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
