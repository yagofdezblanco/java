package ejercicio5;

import java.util.ArrayList;

public class Bicola {
    private ArrayList <Object> bicola;
    
    public Bicola() {
        bicola=new <Object> ArrayList();
    }

    public void insertarDch(Object n ) {
        bicola.add(n);
    }
    
    public void insertarIzq(Object n) {
        bicola.add(0,n);
    }
        
    public Object obtenerIzq(){
        return bicola.get(0);
    }
    
    public Object obtenerDch() {
        return bicola.get(bicola.size()-1);
    }    

    public Object sacarIzq(){
        Object sacar = bicola.get(0);
        bicola.remove(0);
        return sacar;
    }
    
    public Object sacarDch() {
        Object sacar = bicola.get(bicola.size()-1);
        bicola.remove(bicola.size()-1);
        return sacar;
    }    
    
    public int tamano(){
        return bicola.size()-1;
    }
    
}