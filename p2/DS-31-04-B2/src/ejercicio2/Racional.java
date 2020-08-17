package ejercicio2;

public class Racional implements Operable<Racional>{
    private int den, num;
    
    public Racional(){}
    public Racional(int num, int den){
        this.den=den;
        this.num=num;
    }
    public Racional(Racional r){
        this.den=r.getDen();
        this.num=r.getNum();
    }

    public int getDen() {
        return den;
    }
    
    public int getNum() {
        return num;
    }
    
    @Override
    public Racional suma(Racional r){
        Racional resultado=new Racional(num*r.getDen()+den*r.getNum(), den*r.getDen());
        return resultado;
    }
    
    @Override
    public Racional resta(Racional r){
        Racional resultado=new Racional(num*r.getDen()-den*r.getNum(), den*r.getDen());
        return resultado;
    }
    
    @Override
    public Racional multiplicacion(Racional r){
        Racional resultado=new Racional(num*r.getNum(), den*r.getDen());
        return resultado;
    }
    
    @Override
    public Racional division(Racional r){
        Racional resultado=new Racional(num*r.getDen(), den*r.getNum());
        return resultado;
    }
    
    @Override
    public String toString(){
        return String.valueOf(num)+"/"+String.valueOf(den);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + num/num;
        hash = 29 * hash + den/den;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if (getClass()!=obj.getClass())
            return false;
        Racional r=(Racional) obj;
        if(num*r.getDen()!=den*r.getNum())
            return false;
        return true;
    }
}
