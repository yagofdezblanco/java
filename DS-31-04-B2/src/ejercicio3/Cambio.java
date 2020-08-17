package ejercicio3;

import java.util.ArrayList;

public abstract class Cambio {
    private ArrayList<Moneda> monedas;
    
    public Cambio() {
        monedas=new <Moneda>ArrayList();
    }

    public ArrayList<Moneda> getMonedas() {
        return monedas;
    }
    
    public void introducirMoneda(Moneda m){
        monedas.add(m);
    }
    
    public abstract ArrayList<Moneda> devolucion(int gasto);
    
    public int valor(){
        int valor=0;
        for(int i=0;i<monedas.size();i++){
            valor=valor+monedas.get(i).getValor();
        }
        return valor;
    }
    
    public Moneda min(){
        if(monedas.isEmpty())
            return null;
        Moneda minimo=monedas.get(0);
        for (int i=0;i<monedas.size();i++){
            if(monedas.get(i).getValor()<minimo.getValor())
                minimo=monedas.get(i);
        }
        return minimo;
    }
    
    public Moneda valorJusto(int valor){
        if(monedas.isEmpty())
            return null;
        Moneda justo=null;
        if(valor<=200){
            for (int i=0;i<monedas.size();i++){
                if(monedas.get(i).getValor()==valor)
                    justo=monedas.get(i);
            }
        }
        return justo;
    }
    
    public ArrayList<Moneda> cancelar(){
        ArrayList<Moneda> devol=new <Moneda> ArrayList();
        devol.addAll(monedas);
        monedas.removeAll(monedas);
        return devol;
    }
}
