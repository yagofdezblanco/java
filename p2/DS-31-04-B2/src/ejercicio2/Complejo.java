package ejercicio2;

public class Complejo implements Operable<Complejo>{
    private double a, b;

    public Complejo() {
    }
    
    public Complejo(double a, double b) {
        this.a = a;
        this.b = b;
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
}