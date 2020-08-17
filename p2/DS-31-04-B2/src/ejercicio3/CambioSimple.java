/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author alberto.carreno.pineiro
 */
public class CambioSimple {
    ArrayList<Moneda> monedas;
    
    public CambioSimple() {
        monedas=new <Moneda>ArrayList();
    }
    
    public void introducirMoneda(Moneda m){
        monedas.add(m);
    }
    
    public Moneda devolucion(int gasto){
        return monedas.get(0);
    }
}
