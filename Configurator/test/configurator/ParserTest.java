/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import java.util.HashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison
 */
public class ParserTest {
    
    public ParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getVmMap method, of class Parser.
     */
    @Test
    public void testGetVmMap() {
        System.out.println("getVmMap");
        Parser instance = null;
        HashMap<String, VM> expResult = null;
        HashMap<String, VM> result = instance.getVmMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHubMap method, of class Parser.
     */
    @Test
    public void testGetHubMap() {
        System.out.println("getHubMap");
        Parser instance = null;
        HashMap<String, Hub> expResult = null;
        HashMap<String, Hub> result = instance.getHubMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMap method, of class Parser.
     */
    @Test
    public void testPrintMap() {
        System.out.println("printMap");
        Map map = null;
        Parser.printMap(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
