/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison
 */
public class configFilterTest {
    
    public configFilterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDescription method, of class configFilter.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        configFilter instance = new configFilter();
        String expResult = "Config files (*.cfg)";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDescription2() {
        System.out.println("getDescription");
        configFilter instance = new configFilter();
        String expResult = "test";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
}
