/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author alberto.carreno.pineiro
 */
public class Complejo implements Operable<Complejo>{
    private double a, b;

    public Complejo() {
    }
    
    public Complejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complejo (Complejo c){
        this.a=c.getA();
        this.b=c.getB();
    }
        
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    @Override
    public Complejo suma(Complejo c){
        Complejo resultado=new Complejo(a+c.getA(), b+c.getB());
        return resultado;
    }
    @Override
    public Complejo resta(Complejo c){
        Complejo resultado=new Complejo(a-c.getA(), b-c.getB());
        return resultado;
    }
    @Override
    public Complejo multiplicacion(Complejo c){
        Complejo resultado=new Complejo((a*c.getA()-b*c.getB()), (a*c.getB()+b*c.getA()));
        return resultado;
    }
    @Override
    public Complejo division(Complejo c){
        double den=(c.getA()*c.getA()+c.getB()*c.getB());
        Complejo resultado=new Complejo((a*c.getA()+b*c.getB())/den,(b*c.getA()-a*c.getB())/den);
        return resultado;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash+ (int)(a/a);
        hash = 29 * hash+ (int)(b/b);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if (getClass()!=obj.getClass())
            return false;
        Complejo c=(Complejo) obj;
        if(a*c.getA()!=b*c.getB())
            return false;
        return true;
    }
}