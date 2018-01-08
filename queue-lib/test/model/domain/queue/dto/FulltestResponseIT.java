/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.queue.dto;

import br.net.gvt.efika.model.entity.fulltest.FullTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class FulltestResponseIT {
    
    public FulltestResponseIT() {
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
     * Test of getFulltest method, of class FulltestResponse.
     */
    @Test
    public void testGetFulltest() {
        System.out.println("getFulltest");
        FulltestResponse instance = new FulltestResponse();
        System.out.println("name:" + instance.getClass().getName());

    }

    /**
     * Test of setFulltest method, of class FulltestResponse.
     */
    @Test
    public void testSetFulltest() {
        System.out.println("setFulltest");
        FullTest fulltest = null;
        FulltestResponse instance = new FulltestResponse();
        instance.setFulltest(fulltest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
