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
        String type = "";
        String name = "";
        MainWindow1 instance = new MainWindow1();
        instance.createNetItem(type, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of publishItem method, of class MainWindow1.
     */
    @Test
    public void testPublishItem_VM() {
        System.out.println("publishItem");
        VM item = null;
        MainWindow1 instance = new MainWindow1();
        instance.publishItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of publishItem method, of class MainWindow1.
     */
    @Test
    public void testPublishItem_Hub() {
        System.out.println("publishItem");
        Hub item = null;
        MainWindow1 instance = new MainWindow1();
        instance.publishItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteItem method, of class MainWindow1.
     */
    @Test
    public void testDeleteItem() {
        System.out.println("deleteItem");
        String name = "";
        MainWindow1 instance = new MainWindow1();
        boolean expResult = false;
        boolean result = instance.deleteItem(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConsole method, of class MainWindow1.
     */
    @Test
    public void testSetConsole() {
        System.out.println("setConsole");
        String text = "";
        MainWindow1 instance = new MainWindow1();
        instance.setConsole(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVmItems method, of class MainWindow1.
     */
    @Test
    public void testGetVmItems() {
        System.out.println("getVmItems");
        MainWindow1 instance = new MainWindow1();
        HashMap<String, VM> expResult = null;
        HashMap<String, VM> result = instance.getVmItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHubItems method, of class MainWindow1.
     */
    @Test
    public void testGetHubItems() {
        System.out.println("getHubItems");
        MainWindow1 instance = new MainWindow1();
        HashMap<String, Hub> expResult = null;
        HashMap<String, Hub> result = instance.getHubItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MainWindow1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainWindow1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
