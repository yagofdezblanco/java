package ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplejoTest {
    
    @Test
    public void testComplejo() {
        Complejo c = new Complejo (1.5,3.8);
        Complejo c2 = new Complejo ();
        Complejo c3 = new Complejo (c);
        assertEquals(c.getA(),1.5,0.001);
        assertEquals(c.getB(),3.8,0.001);
        assertEquals(c3.getA(),1.5,0.001);
        assertEquals(c3.getB(),3.8,0.001);
        
    }
    

    @Test
    public void testSuma() {
        Complejo c = new Complejo (0.1,0.53);
        Complejo c5=(c.suma(new Complejo(2,3)));
        assertFalse(c.suma(new Complejo(2,3)).equals(3));
        assertFalse(c.suma(new Complejo(6,3)).equals(new Complejo (9,3)));
        assertFalse(c.suma(new Complejo(2,8)).equals(new Complejo (2,3)));
        assertFalse(c.suma(new Complejo(2,8)).equals(null));
    }
    @Test
    public void testResta() {
        Complejo c = new Complejo (0.1,0.53);
        assertFalse(c.resta(new Complejo(2,3)).equals(3));
        assertFalse(c.resta(new Complejo(6,3)).equals(new Complejo (9,3)));
        assertFalse(c.resta(new Complejo(2,8)).equals(new Complejo (2,3)));
        assertFalse(c.resta(new Complejo(2,8)) == null);
    }
    
    @Test
    public void testMultiplicacion() {
        Complejo c = new Complejo (0.1,0.53);
        assertFalse(c.multiplicacion(new Complejo(2,3)).equals(3));
        assertFalse(c.multiplicacion(new Complejo(6,3)).equals(new Complejo (9,3)));
        assertFalse(c.multiplicacion(new Complejo(2,8)).equals(new Complejo (2,3)));
        assertFalse(c.multiplicacion(new Complejo(2,8)) == null);
    }
    
    @Test
    public void testDivision() {
        Complejo c = new Complejo (0.1,0.53);
        assertFalse(c.division(new Complejo(2,3)).equals(3));
        assertFalse(c.division(new Complejo(6,3)).equals(new Complejo (9,3)));
        assertFalse(c.division(new Complejo(2,8)).equals(new Complejo (2,3)));
        assertFalse(c.division(new Complejo(2,8)) == null);
    }

    @Test
    public void testHascode(){
        Complejo c = new Complejo (0.1,0.53);
        assertEquals(c.hashCode(),4235);
    }
}
