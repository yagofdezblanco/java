package ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplejoTest {
    
    /**
     * Test of suma method, of class Complejo.
     */
    @Test
    public void testSuma() {
        Complejo c = new Complejo (0.1,0.53);
        //assertTrue(c.suma(new Complejo(2,3)).equals(new Complejo (3,3)));
        //assertTrue(c.suma(new Complejo(1,2)).equals(new Complejo (5,6)));
        //assertTrue(c.suma(new Complejo(10,4)).equals(new Complejo (17,6)));
        assertFalse(c.suma(new Complejo(2,3)).equals(new Complejo (5,3)));
        assertFalse(c.suma(new Complejo(6,3)).equals(new Complejo (9,3)));
        assertFalse(c.suma(new Complejo(2,8)).equals(new Complejo (2,3)));
    }
    
}
