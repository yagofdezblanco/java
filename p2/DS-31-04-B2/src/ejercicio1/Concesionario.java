/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author alberto.carreno.pineiro
 */
public class Concesionario{
    private ArrayList<Coche> coches;

    public Concesionario() {
        coches=new <Coche>ArrayList();
    }
    
    public void incluirCoche(Coche coche){
        coches.add(coche);
    }
    
    public void extraerCoche(int n_bastidor){
        Coche coche=buscarCoche(n_bastidor);
        if(coche!=null)
            coches.remove(coche);
    }
    
    public Coche buscarCoche(int n_bastidor){
        Coche coche=null;
        for(int i=0;i<coches.size();i++)
            if(coches.get(i).getN_bastidor()==n_bastidor)
                coche=coches.get(i);
        return coche;
    }
    
    public String listar(){
        ArrayList<Coche> copia=new ArrayList<>();
        String salida=new String();
        copia.addAll(coches);
        while(copia.size()>0){
            Coche primero=copia.get(0);
            for(int i=1;i<copia.size();i++){
                if(primero.compareTo(copia.get(i))<0)
                    primero=copia.get(i);
            }
            salida=salida+primero.imprimirDatos()+"\n";
            copia.remove(primero);
        }
        
        return salida;
    }
    
    public String listar(Comparator c){
        ArrayList<Coche> copia=new ArrayList<>();
        copia.addAll(coches);
        String salida=new String();
        while(copia.size()>0){
            Coche primero=copia.get(0);
            for(int j=1;j<copia.size();j++){
                if(c.compare(primero, copia.get(j))<0)
                    primero=copia.get(j);
            }
            salida=salida+primero.imprimirDatos()+"\n";
            copia.remove(primero);
        }
        return salida;
    }
}
