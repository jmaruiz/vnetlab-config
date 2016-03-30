/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import java.util.HashMap;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Edison
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({configurator.NetworkItemTest.class, configurator.images.ImagesSuite.class, configurator.configFilterTest.class, configurator.WriterTest.class, configurator.EditWindowTest.class, configurator.ParserTest.class, configurator.EditWindowHubTest.class, configurator.MainWindow1Test.class, configurator.VMTest.class, configurator.HubTest.class})
public class ConfiguratorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Test
    public void testCreateNetItem() {
        System.out.println("createNetItem");
        String type = "vm";
        String name = "test";
        MainWindow1 instance = new MainWindow1();
        instance.createNetItem(type, name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of publishItem method, of class MainWindow1.
     */
    @Test
    public void testPublishItem_VM() {
        System.out.println("publishItem");
        VM item = new VM("test");
        MainWindow1 instance = new MainWindow1();
        instance.publishItem(item);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of publishItem method, of class MainWindow1.
     */
    @Test
    public void testPublishItem_Hub() {
        System.out.println("publishItem");
        Hub item = new Hub("test");
        MainWindow1 instance = new MainWindow1();
        instance.publishItem(item);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setConsole method, of class MainWindow1.
     */
    @Test
    public void testSetConsole() {
        System.out.println("setConsole");
        String text = "This is a test";
        MainWindow1 instance = new MainWindow1();
        instance.setConsole(text);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVmItems method, of class MainWindow1.
     */
    @Test
    public void testGetVmItems() {
        System.out.println("getVmItems");
        MainWindow1 instance = new MainWindow1();
        HashMap<String, VM> expResult = new HashMap();
        HashMap<String, VM> result = instance.getVmItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHubItems method, of class MainWindow1.
     */
    @Test
    public void testGetHubItems() {
        System.out.println("getHubItems");
        MainWindow1 instance = new MainWindow1();
        HashMap<String, Hub> expResult = new HashMap();
        HashMap<String, Hub> result = instance.getHubItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MainWindow1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = {"test"};
        MainWindow1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
}
}