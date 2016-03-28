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
public class EditWindowHubTest {
    
    public EditWindowHubTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class EditWindowHub.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = {"test"};
        EditWindowHub.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNetItem method, of class EditWindowHub.
     */
    @Test
    public void testSetNetItem() {
        System.out.println("setNetItem");
        Hub net = new Hub("test");
        MainWindow1 instance = new MainWindow1();
        instance.setNetItem(net);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of changeName method, of class EditWindowHub.
     */
    @Test
    public void testChangeName() {
        System.out.println("changeName");
        String newText = "";
        EditWindowHub instance = null;
        instance.changeName(newText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeInf method, of class EditWindowHub.
     */
    @Test
    public void testChangeInf() {
        System.out.println("changeInf");
        String newText = "";
        EditWindowHub instance = null;
        instance.changeInf(newText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeSubnet method, of class EditWindowHub.
     */
    @Test
    public void testChangeSubnet() {
        System.out.println("changeSubnet");
        String newText = "";
        EditWindowHub instance = null;
        instance.changeSubnet(newText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeMask method, of class EditWindowHub.
     */
    @Test
    public void testChangeMask() {
        System.out.println("changeMask");
        String newText = "";
        EditWindowHub instance = null;
        instance.changeMask(newText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNetItemProps method, of class EditWindowHub.
     */
    @Test
    public void testSetNetItemProps() {
        System.out.println("setNetItemProps");
        EditWindowHub instance = new EditWindowHub();
        instance.setNetItemProps();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
