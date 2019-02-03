/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fuzigeng
 */
public class BenchmarkTest {
    
    public BenchmarkTest() {
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
     * Test of run method, of class Benchmark.
     */
    @Test
    public void testRun_GenericType_int() {
        System.out.println("run");
        Object t = null;
        int m = 0;
        Benchmark instance = null;
        double expResult = 0.0;
        double result = instance.run(t, m);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Benchmark.
     */
    @Test
    public void testRun_Supplier_int() {
        System.out.println("run");
        Benchmark instance = null;
        double expResult = 0.0;
        double result = instance.run(null);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Benchmark.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Benchmark.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
