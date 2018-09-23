/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.queue.model.dto.input;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class CadastroInputIT {
    
    public CadastroInputIT() {
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
     * Test of getInstancia method, of class CadastroInput.
     */
    @Test
    public void testGetInstancia() {
        System.out.println("getInstancia");
        CadastroInput instance = new CadastroInput();
        String expResult = "";
        String result = instance.getInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInstancia method, of class CadastroInput.
     */
    @Test
    public void testSetInstancia() {
        System.out.println("setInstancia");
        String instancia = "";
        CadastroInput instance = new CadastroInput();
        instance.setInstancia(instancia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
