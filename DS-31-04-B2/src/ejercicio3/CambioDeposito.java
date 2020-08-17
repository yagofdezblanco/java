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
public class CambioDeposito extends Cambio{
    
    @Override
    public ArrayList<Moneda> devolucion(int gasto){
        ArrayList<Moneda> devol=new <Moneda> ArrayList();
        while(!getMonedas().isEmpty() || gasto>0){
            Moneda gastada;
            if((gastada=valorJusto(gasto))!=null){
                gasto=0;
                getMonedas().remove(gastada);
            }else{
                gasto=gasto-min().getValor();
                getMonedas().remove(min());
            }
        }
        anhadirCambio(gasto*(-1));
        devol.addAll(getMonedas());
        getMonedas().removeAll(getMonedas());
        return devol;
    }
    
    public void anhadirCambio(int gasto){
        while (gasto!=0){
            int n=0;
            if(gasto>=200){
                gasto=gasto-200;
                getMonedas().add(Moneda.EURO2);
            }else if(gasto>=100){
                gasto=gasto-100;
                getMonedas().add(Moneda.EURO1);
            }else if(gasto>=50){
                gasto=gasto-50;
                getMonedas().add(Moneda.CENT50);
            }else if(gasto>=20){
                gasto=gasto-20;
                getMonedas().add(Moneda.CENT20);
            }else if(gasto>=10){
                gasto=gasto-10;
                getMonedas().add(Moneda.CENT10);
            }else if(gasto>=5){
                gasto=gasto-5;
                getMonedas().add(Moneda.CENT5);
            }else if(gasto>=2){
                gasto=gasto-2;
                getMonedas().add(Moneda.CENT2);
            }else if(gasto>=1){
                gasto=gasto-1;
                getMonedas().add(Moneda.CENT1);
            }
        }
    }
}
