/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author alberto
 */
public class MaquinaElectronica {
    
    private Cambio c;
    private boolean comprando;
    
    public MaquinaElectronica(Cambio c){
        comprando=false;
        this.c=c;
    }

    public Cambio getC() {
        return c;
    }

    public boolean isComprando() {
        return comprando;
    }
    
    public void introducirMoneda(Moneda m){
        comprando=true;
        c.introducirMoneda(m);
    }
    
    public void setCambio(Cambio c){
        if(!comprando)
            this.c=c;
    }
    
    public ArrayList<Moneda> comprar(Producto p){
        if(c.valor()>=p.getCoste()){
            comprando=false;
            return c.devolucion(p.getCoste());
        }else{
            return null;
        }
    }
    
    public ArrayList<Moneda> cancelar(){
        comprando=false;
        return c.cancelar();
    }
}