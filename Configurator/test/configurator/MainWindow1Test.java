/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edison
 */
public class MainWindow1Test {
    
    public MainWindow1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createNetItem method, of class MainWindow1.
     */
    @Test
    public void testCreateNetItem() {
        System.out.println("createNetItem");
        String type = "vm";
        String name = "test";
        MainWindow1 instance = new MainWindow1();
        instance.createNetItem(type, name);
    }

    @Test
    public void testCreateNetItem2() {
        System.out.println("createNetItem");
        String type = "test";
        String name = "test";
        MainWindow1 instance = new MainWindow1();
        instance.createNetItem(type, name);
    }
    
    @Test
    public void testCreateNetItem3() {
        System.out.println("createNetItem");
        String type = "vm";
        String name = "test";
        MainWindow1 instance = null;
        instance.createNetItem(type, name);
    }
    
    /**
     * Test of deleteItem method, of class MainWindow1.
     */
    @Test
    public void testDeleteItem() {
        System.out.println("deleteItem");
        String name = "test";
        MainWindow1 instance = new MainWindow1();
        boolean expResult = false;
        boolean result = instance.deleteItem(name);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of deleteItem method, of class MainWindow1.
     */
    @Test
    public void testDeleteItem2() {
        System.out.println("deleteItem");
        String name = "test";
        MainWindow1 instance = new MainWindow1();
        boolean expResult = true;
        boolean result = instance.deleteItem(name);
        assertEquals(expResult, result);
    }    
}
