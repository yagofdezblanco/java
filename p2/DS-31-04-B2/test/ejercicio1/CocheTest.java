package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CocheTest {
    
    @Test
    public void testCoche() {
        Coche coche=new Coche(1234,20000,600,250,170,"Ferrari","Enzo");
        assertEquals(coche.getN_bastidor(),1234);
        assertEquals(coche.getPrecio(),20000);
        coche.setPrecio(10000);
        assertEquals(coche.getPrecio(),10000);
        assertEquals(coche.getCaballos(),600);
        assertEquals(coche.getLongitud(),250);
        assertEquals(coche.getAltura(),170);
        assertEquals(coche.getMarca(),"Ferrari");
        assertEquals(coche.getModelo(),"Enzo");        
    }
    
    @Test
    public void testImprimir(){
        Coche coche=new Coche(1234,10000,600,250,170,"Ferrari","Enzo");
        assertEquals(coche.imprimirDatos(),"Numero de bastidor: 1234, Marca: Ferrari, Modelo: Enzo, Caballos: 600, Longitud: 250, Altura: 170, Precio: 10000");

    }
    
    @Test
    public void testComparar(){
        Coche coche=new Coche(1234,10000,600,250,170,"Ferrari","Enzo");
        Coche coche2=new Coche(4321,10000,600,250,170,"Ferrari2","Enzo2");
        Coche coche3=new Coche(4321,10000,600,250,170,"Ferrari3","Enzo3");
//        assertEquals(coche.compareTo(coche2),-1);
//        assertEquals(coche2.compareTo(coche),1);
//        assertEquals(coche3.compareTo(coche2),0);
    
    }
    
}
