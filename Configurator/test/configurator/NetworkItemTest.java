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
     * Test of addConn method, of class NetworkItem.
     */
    @Test
    public void testAddConn() {
        System.out.println("addConn");
        String port = "23";
        String conn = "4";
        NetworkItem instance = new NetworkItem();
        String expResult = "Added solution 23, 4 to object null";
        String result = instance.addConn(port, conn);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testAddConn2() {
        System.out.println("addConn");
        String port = "4";
        String conn = "6";
        NetworkItem instance = new NetworkItem();
        String expResult = "23,6";
        String result = instance.addConn(port, conn);
        assertEquals(expResult, result);
    }
}
