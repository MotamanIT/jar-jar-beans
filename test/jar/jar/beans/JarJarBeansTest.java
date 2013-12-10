/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jar.jar.beans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Phoenix
 */
public class JarJarBeansTest {
    
    public JarJarBeansTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addition method, of class JarJarBeans.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        int nb1 = 0;
        int nb2 = 0;
        int expResult = 0;
        int result = JarJarBeans.addition(nb1, nb2);
        assertEquals(expResult, result);
    }

    /**
     * Test of pow method, of class JarJarBeans.
     */
    @Test
    public void testPow() {
        System.out.println("pow");
        Double nb1 = new Double(2);
        JarJarBeans.pow(nb1);
        assertEquals(new Double(2), nb1);
    }
}