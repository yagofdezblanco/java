package ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConcesionarioTest {
    
    @Test
    public void testConcesionario(){
        Concesionario conce=new Concesionario();
        Coche c1=new Coche(552525, 75000, 200, 312, 105, "Audi", "a3");
        Coche c2=new Coche(552528, 75000, 200, 340, 105, "Audi", "a5");
        Coche c3=new Coche(552522, 125000, 350, 312, 85, "Audi", "TT");
        Coche c4=new Coche(552521, 15000, 110, 312, 105, "Wolkswagen", "Vento");
        Coche c5=new Coche(552555, 15000, 110, 312, 105, "Wolkswagen", "Vento");
        Coche c6=new Coche(552528, 75000, 200, 340, 105, "Audi", "a5");
        
        conce.incluirCoche(c1);
        conce.incluirCoche(c2);
        conce.incluirCoche(c3);
        conce.incluirCoche(c4);
        
        
        conce.extraerCoche(552525);
        assertEquals(conce.listar(),"Numero de bastidor: 552521, Marca: Wolkswagen, Modelo: Vento, Caballos: 110, Longitud: 312, Altura: 105, Precio: 15000\n" +
        "Numero de bastidor: 552522, Marca: Audi, Modelo: TT, Caballos: 350, Longitud: 312, Altura: 85, Precio: 125000\n" +
        "Numero de bastidor: 552528, Marca: Audi, Modelo: a5, Caballos: 200, Longitud: 340, Altura: 105, Precio: 75000\n");
        conce.incluirCoche(c1);
        
        conce.incluirCoche(c5);
        assertEquals(conce.listar(new ComparadorMarca()),"Numero de bastidor: 552522, Marca: Audi, Modelo: TT, Caballos: 350, Longitud: 312, Altura: 85, Precio: 125000\n" +
        "Numero de bastidor: 552525, Marca: Audi, Modelo: a3, Caballos: 200, Longitud: 312, Altura: 105, Precio: 75000\n" +
        "Numero de bastidor: 552528, Marca: Audi, Modelo: a5, Caballos: 200, Longitud: 340, Altura: 105, Precio: 75000\n" +
        "Numero de bastidor: 552521, Marca: Wolkswagen, Modelo: Vento, Caballos: 110, Longitud: 312, Altura: 105, Precio: 15000\n" +
        "Numero de bastidor: 552555, Marca: Wolkswagen, Modelo: Vento, Caballos: 110, Longitud: 312, Altura: 105, Precio: 15000\n");
        conce.extraerCoche(552555);
        
        assertEquals(conce.listar(new ComparadorPrecio()),"Numero de bastidor: 552522, Marca: Audi, Modelo: TT, Caballos: 350, Longitud: 312, Altura: 85, Precio: 125000\n" +
        "Numero de bastidor: 552528, Marca: Audi, Modelo: a5, Caballos: 200, Longitud: 340, Altura: 105, Precio: 75000\n" +
        "Numero de bastidor: 552525, Marca: Audi, Modelo: a3, Caballos: 200, Longitud: 312, Altura: 105, Precio: 75000\n" +
        "Numero de bastidor: 552521, Marca: Wolkswagen, Modelo: Vento, Caballos: 110, Longitud: 312, Altura: 105, Precio: 15000\n");
        
        assertEquals(conce.listar(new ComparadorCilindrada()),"Numero de bastidor: 552522, Marca: Audi, Modelo: TT, Caballos: 350, Longitud: 312, Altura: 85, Precio: 125000\n" +
        "Numero de bastidor: 552528, Marca: Audi, Modelo: a5, Caballos: 200, Longitud: 340, Altura: 105, Precio: 75000\n" +
        "Numero de bastidor: 552525, Marca: Audi, Modelo: a3, Caballos: 200, Longitud: 312, Altura: 105, Precio: 75000\n" +
        "Numero de bastidor: 552521, Marca: Wolkswagen, Modelo: Vento, Caballos: 110, Longitud: 312, Altura: 105, Precio: 15000\n");
        
        conce.incluirCoche(c6);
        assertEquals(conce.listar(),"Numero de bastidor: 552521, Marca: Wolkswagen, Modelo: Vento, Caballos: 110, Longitud: 312, Altura: 105, Precio: 15000\n" +
        "Numero de bastidor: 552522, Marca: Audi, Modelo: TT, Caballos: 350, Longitud: 312, Altura: 85, Precio: 125000\n" +
        "Numero de bastidor: 552525, Marca: Audi, Modelo: a3, Caballos: 200, Longitud: 312, Altura: 105, Precio: 75000\n" +
        "Numero de bastidor: 552528, Marca: Audi, Modelo: a5, Caballos: 200, Longitud: 340, Altura: 105, Precio: 75000\n" +
        "Numero de bastidor: 552528, Marca: Audi, Modelo: a5, Caballos: 200, Longitud: 340, Altura: 105, Precio: 75000\n");
        
    }
}
