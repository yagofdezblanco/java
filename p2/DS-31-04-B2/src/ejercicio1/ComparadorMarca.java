/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Comparator;

/**
 *
 * @author alberto.carreno.pineiro
 */
public class ComparadorMarca implements Comparator{
    
    @Override
    public int compare(Object o1, Object o2) {
        Coche c1=(Coche)o1;
        Coche c2=(Coche)o2;
        if(c1.getMarca().compareTo(c2.getMarca())==0){
            if(c1.getModelo().compareTo(c2.getModelo())==0)
                return 0;
            else if(c1.getModelo().compareTo(c2.getModelo())>0)
                return -1;
            else
                return 1;
        }else if(c1.getMarca().compareTo(c2.getMarca())>0){
            return -1;
        }else
            return 1;
    }
    
}
