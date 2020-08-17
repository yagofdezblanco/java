package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConcesionarioTest {
    
    @Test
    public void testConcesionario(){
        Concesionario conce=new Concesionario();
        Coche c1=new Coche(552525, 32000, 145, 312, 105, "Audi", "a3");
        Coche c2=new Coche(552528, 75000, 200, 340, 105, "Audi", "a5");
        Coche c3=new Coche(552522, 125000, 350, 312, 85, "Audi", "TT");
        Coche c4=new Coche(552521, 15000, 110, 312, 105, "Wolkswagen", "Vento");
        
        conce.incluirCoche(c1);
        conce.incluirCoche(c2);
        conce.incluirCoche(c3);
        conce.incluirCoche(c4);
        
        //assertEquals(conce.listar(),);
    }
}
