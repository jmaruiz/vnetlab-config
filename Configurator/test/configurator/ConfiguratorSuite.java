/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
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
    
}
