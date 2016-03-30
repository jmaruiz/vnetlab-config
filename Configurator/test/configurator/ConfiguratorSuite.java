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
@Suite.SuiteClasses({configurator.NetworkItemTest.class, configurator.images.ImagesSuite.class, configurator.configFilterTest.class, configurator.MainWindow1Test.class, configurator.VMTest.class, configurator.HubTest.class})
public class ConfiguratorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("The tests have started.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("The tests have finished.");
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
