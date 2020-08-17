/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yago
 */
public class BicolaTest {
    
    public BicolaTest() {
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
     * Test of insertarDch method, of class Bicola.
     */
    @Test
    public void testBicola() {
        Object n = 1;
        Object n2 = 2;
        Object n3 = 3;
        Object n4=4;
        Bicola instance = new Bicola();
        instance.insertarDch(n);
        instance.insertarDch(n2);
        instance.insertarDch(n3);
        assertEquals(instance.obtenerDch(),n3);
        assertEquals(instance.obtenerIzq(),n);
        instance.insertarIzq(n4);
        assertEquals(instance.obtenerIzq(),n4);
        assertEquals(instance.sacarDch(),n3);
        assertEquals(instance.obtenerDch(),n2);
        assertEquals(instance.sacarIzq(),n4);
        assertEquals(instance.obtenerIzq(),n);
        
    }
    
    
}
