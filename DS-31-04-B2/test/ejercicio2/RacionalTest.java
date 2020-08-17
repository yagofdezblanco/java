package ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

public class RacionalTest {
    
    /**
     * Test of Racional method, of class Racional.
     */
    @Test
    public void testRacional() {
        Racional r = new Racional (1,3);
        Racional r2 = new Racional (r);
        assertEquals(r2.getDen(),3);
        assertEquals(r2.getNum(),1);
        
    }
    
    /**
     * Test of suma method, of class Racional.
     */
    @Test
    public void testSuma() {
        Racional r = new Racional (1,3);
        assertTrue(r.suma(new Racional(2,3)).equals(new Racional (3,3)));
        assertTrue(r.suma(new Racional(1,2)).equals(new Racional (5,6)));
        assertTrue(r.suma(new Racional(10,4)).equals(new Racional (17,6)));
        assertFalse(r.suma(new Racional(2,3)).equals(new Racional (5,3)));
        assertFalse(r.suma(new Racional(6,3)).equals(new Racional (9,3)));
        assertFalse(r.suma(new Racional(2,8)).equals(new Racional (2,3)));
    }
    
     /**
     * Test of resta method, of class Racional.
     */
     @Test
    public void testResta() {
        Racional r = new Racional (1,3);
        assertTrue(r.resta(new Racional(2,3)).equals(new Racional (-1,3)));
        assertTrue(r.resta(new Racional(1,4)).equals(new Racional (1,12)));
        assertTrue(r.resta(new Racional(1,5)).equals(new Racional (2,15)));
        assertFalse(r.resta(new Racional(2,3)).equals(new Racional (5,3)));
        assertFalse(r.resta(new Racional(6,3)).equals(new Racional (9,3)));
        assertFalse(r.resta(new Racional(2,8)).equals(new Racional (2,3)));
    }

    /**
     * Test of multiplicacion method, of class Racional.
     */
    @Test
    public void testMultiplicacion() {
        Racional r = new Racional (1,3);
        assertTrue(r.multiplicacion(new Racional(2,3)).equals(new Racional (2,9)));
        assertTrue(r.multiplicacion(new Racional(3,4)).equals(new Racional (1,4)));
        assertTrue(r.multiplicacion(new Racional(2,7)).equals(new Racional (2,21)));
        assertFalse(r.multiplicacion(new Racional(2,3)).equals(new Racional (5,3)));
        assertFalse(r.multiplicacion(new Racional(6,3)).equals(new Racional (9,3)));
        assertFalse(r.multiplicacion(new Racional(2,8)).equals(new Racional (2,3)));
    }

    /**
     * Test of division method, of class Racional.
     */
    @Test
    public void testDivision() {
        Racional r = new Racional (1,3);
        assertTrue(r.division(new Racional(2,3)).equals(new Racional (1,2)));
        assertTrue(r.division(new Racional(4,5)).equals(new Racional (5,12)));
        assertTrue(r.division(new Racional(1,5)).equals(new Racional (5,3)));
        assertFalse(r.division(new Racional(2,3)).equals(new Racional (5,3)));
        assertFalse(r.division(new Racional(6,3)).equals(new Racional (9,3)));
        assertFalse(r.division(new Racional(2,8)).equals(new Racional (2,3)));        
    }

    /**
     * Test of toString method, of class Racional.
     */
    @Test
    public void testToString() {
        Racional r = new Racional (1,3);
        assertEquals(r.toString(),"1/3");
        Racional r1 = new Racional (5,3);
        assertEquals(r1.toString(),"5/3");
        Racional r2 = new Racional (6,4);
        assertEquals(r2.toString(),"6/4");
        Racional r3 = new Racional (7,2);
        assertEquals(r3.toString(),"7/2");
    }

    /**
     * Test of equals method, of class Racional.
     */
    @Test
    public void testEquals() {
        Racional r = new Racional (1,2);
        Racional r2 = new Racional (3,6);
        assertTrue(r.equals(r2));
        Racional r3 = new Racional (1,3);
        Racional r4 = new Racional (2,6);
        assertTrue(r3.equals(r4));
        Racional r5 = new Racional (1,5);
        Racional r6 = new Racional (3,15);
        assertTrue(r5.equals(r6));
        Racional r7 = new Racional (1,5);
        Racional r8 = new Racional (3,5);
        assertFalse(r7.equals(r8));
        Racional r9 = new Racional (2,3);
        Racional r10 = new Racional (3,4);
        assertFalse(r9.equals(r10));
        Racional r11= new Racional();
        assertFalse(r11.equals(1));
        Racional r12= new Racional();
        assertFalse(r12.equals(null));
        
    }
    /**
     * Test of hashCode method, of class Racional.
     */
    @Test
    public void testHashCode() {
        Racional racional1 = new Racional (3,1);
        Racional racional2 = new Racional (5,1);
        assertTrue(racional1.hashCode()==racional2.hashCode());
    }
}
