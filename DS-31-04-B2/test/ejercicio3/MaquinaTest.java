package ejercicio3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class MaquinaTest {
    
    @Test
    public void MaquinaTest(){
        CambioSimple cambio = new CambioSimple();
        MaquinaElectronica maquina =new MaquinaElectronica(cambio);
        assertEquals(maquina.isComprando(), false);
        assertEquals(maquina.getC(), cambio);
    }
    
    public void testSetCambio(){
        CambioSimple cambios = new CambioSimple();
        CambioDeposito cambiod = new CambioDeposito();
        MaquinaElectronica maquina =new MaquinaElectronica(cambios);
        assertEquals(maquina.getC(), cambios);
        maquina.introducirMoneda(Moneda.EURO1);
        maquina.setCambio(cambiod);
        assertEquals(maquina.getC(), cambios);
        maquina.cancelar();
        maquina.setCambio(cambiod);
        assertEquals(maquina.getC(), cambiod);
    }
    
    @Test
    public void testComprar(){
        CambioSimple cambio = new CambioSimple();
        MaquinaElectronica maquina =new MaquinaElectronica(cambio);
        ArrayList<Moneda> monedas = new <Moneda>ArrayList();
        maquina.introducirMoneda(Moneda.EURO2);
        maquina.introducirMoneda(Moneda.EURO1);
        maquina.introducirMoneda(Moneda.EURO1);
        monedas.add(Moneda.EURO1);
        assertEquals(maquina.comprar(Producto.PRODUCTO2), monedas);
        monedas.remove(Moneda.EURO1);
        assertEquals(maquina.getC().getMonedas(), monedas);
        maquina.setCambio(new CambioDeposito());
        maquina.introducirMoneda(Moneda.EURO2);
        maquina.introducirMoneda(Moneda.EURO1);
        maquina.introducirMoneda(Moneda.CENT50);
        maquina.introducirMoneda(Moneda.CENT20);
        maquina.introducirMoneda(Moneda.CENT10);
        maquina.introducirMoneda(Moneda.CENT5);
        maquina.introducirMoneda(Moneda.CENT2);
        maquina.introducirMoneda(Moneda.CENT1);
        maquina.introducirMoneda(Moneda.EURO2);
        maquina.introducirMoneda(Moneda.EURO1);
        monedas.add(Moneda.EURO2);
        monedas.add(Moneda.EURO1);
        monedas.add(Moneda.CENT50);
        monedas.add(Moneda.CENT20);
        monedas.add(Moneda.CENT10);
        monedas.add(Moneda.CENT5);
        monedas.add(Moneda.CENT2);
        monedas.add(Moneda.CENT1);
        assertEquals(maquina.comprar(Producto.PRODUCTO2), monedas);
        assertEquals(maquina.comprar(Producto.PRODUCTO2), null);
        
    }
    
    @Test
    public void testCancelar(){
        CambioSimple cambio = new CambioSimple();
        MaquinaElectronica maquina =new MaquinaElectronica(cambio);
        ArrayList<Moneda> monedas = new <Moneda>ArrayList();
        maquina.introducirMoneda(Moneda.EURO2);
        maquina.introducirMoneda(Moneda.EURO1);
        maquina.introducirMoneda(Moneda.EURO1);
        monedas.add(Moneda.EURO2);
        monedas.add(Moneda.EURO1);
        monedas.add(Moneda.EURO1);
        assertEquals(maquina.cancelar(), monedas);
        maquina.setCambio(new CambioDeposito());
        maquina.introducirMoneda(Moneda.EURO2);
        maquina.introducirMoneda(Moneda.EURO1);
        maquina.introducirMoneda(Moneda.EURO1);
        assertEquals(maquina.cancelar(), monedas);
    }
}
