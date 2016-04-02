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
     * Test of generateString method, of class VM.
     */
    @Test
    public void testGenerateString() {
        System.out.println("generateString");
        VM instance = null;
        String expResult = "";
        String result = instance.generateString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolutionString method, of class VM.
     */
    @Test
    public void testGetSolutionString() {
        System.out.println("getSolutionString");
        VM instance = null;
        String expResult = "";
        String result = instance.getSolutionString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addConn method, of class VM.
     */
    @Test
    public void testAddConn() {
        System.out.println("addConn");
        String port = "";
        String conn = "";
        VM instance = null;
        String expResult = "";
        String result = instance.addConn(port, conn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeConn method, of class VM.
     */
    @Test
    public void testRemoveConn() {
        System.out.println("removeConn");
        String port = "";
        VM instance = null;
        String expResult = "";
        String result = instance.removeConn(port);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeHub method, of class VM.
     */
    @Test
    public void testRemoveHub() {
        System.out.println("removeHub");
        String hub = "";
        VM instance = null;
        instance.removeHub(hub);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class VM.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        VM instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class VM.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        VM instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSrc method, of class VM.
     */
    @Test
    public void testGetSrc() {
        System.out.println("getSrc");
        VM instance = null;
        String expResult = "";
        String result = instance.getSrc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSrc method, of class VM.
     */
    @Test
    public void testSetSrc() {
        System.out.println("setSrc");
        String src = "";
        VM instance = null;
        instance.setSrc(src);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVer method, of class VM.
     */
    @Test
    public void testGetVer() {
        System.out.println("getVer");
        VM instance = null;
        String expResult = "";
        String result = instance.getVer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVer method, of class VM.
     */
    @Test
    public void testSetVer() {
        System.out.println("setVer");
        String ver = "";
        VM instance = null;
        instance.setVer(ver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOs method, of class VM.
     */
    @Test
    public void testGetOs() {
        System.out.println("getOs");
        VM instance = null;
        String expResult = "";
        String result = instance.getOs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOs method, of class VM.
     */
    @Test
    public void testSetOs() {
        System.out.println("setOs");
        String os = "";
        VM instance = null;
        instance.setOs(os);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEth0 method, of class VM.
     */
    @Test
    public void testGetEth0() {
        System.out.println("getEth0");
        VM instance = null;
        String expResult = "";
        String result = instance.getEth0();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEth0 method, of class VM.
     */
    @Test
    public void testSetEth0() {
        System.out.println("setEth0");
        String eth0 = "";
        VM instance = null;
        instance.setEth0(eth0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEth1 method, of class VM.
     */
    @Test
    public void testGetEth1() {
        System.out.println("getEth1");
        VM instance = null;
        String expResult = "";
        String result = instance.getEth1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEth1 method, of class VM.
     */
    @Test
    public void testSetEth1() {
        System.out.println("setEth1");
        String eth1 = "";
        VM instance = null;
        instance.setEth1(eth1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEth2 method, of class VM.
     */
    @Test
    public void testGetEth2() {
        System.out.println("getEth2");
        VM instance = null;
        String expResult = "";
        String result = instance.getEth2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEth2 method, of class VM.
     */
    @Test
    public void testSetEth2() {
        System.out.println("setEth2");
        String eth2 = "";
        VM instance = null;
        instance.setEth2(eth2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
