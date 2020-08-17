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
public class CambioSimple extends Cambio{
    
    @Override
    public ArrayList<Moneda> devolucion(int gasto){
        ArrayList<Moneda> devol=new <Moneda> ArrayList();
        while(!getMonedas().isEmpty() && gasto>0){
            Moneda gastada;
            if((gastada=valorJusto(gasto))!=null){
                gasto=0;
                getMonedas().remove(gastada);
            }else{
                gasto=gasto-min().getValor();
                getMonedas().remove(min());
                
            }
        }
        devol.addAll(getMonedas());
        System.out.println(getMonedas().toString());
        getMonedas().removeAll(getMonedas());
        
        return devol;
    }
}
