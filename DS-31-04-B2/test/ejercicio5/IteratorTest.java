/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

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
public class IteratorTest {
    
    public IteratorTest() {
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
     * Test of hasIterator method, of class iterator.
     */
    @Test
    public void testIterator() {
        Object n = 1;
        Object n2 = 2;
        Object n3 = 3;
        Object n4=4;     
        
        Bicola instance = new Bicola();        
        instance.insertarDch(n);
        instance.insertarDch(n2);
        instance.insertarDch(n3);
        instance.insertarDch(n4);
        Iterador it =new Iterador(0,instance.tamano());
        assertFalse(it.hasPrevious());
        assertTrue(it.hasNext());
        it.next();
        assertTrue(it.hasPrevious());
        it.previous();
        assertFalse(it.hasPrevious());
                
    }
    
    @Test(expected=Exception.class)
    public void testExcepprev(){
        Bicola instance = new Bicola();        
        Iterador it =new Iterador(0,instance.tamano());
        it.previous();     
    }
    
    @Test(expected=Exception.class)
    public void testExcepnext(){
        Bicola instance = new Bicola();        
        Iterador it =new Iterador(0,instance.tamano());
        it.next();        
    }
   
}
