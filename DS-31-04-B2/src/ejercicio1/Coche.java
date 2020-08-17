package ejercicio1;


public class Coche implements Comparable{
    private int n_bastidor, precio, caballos, longitud, altura; //el precio será dado en centimos y las medidas en cm
    private String marca, modelo;
    
    public Coche(){}

    public Coche(int n_bastidor, int precio, int caballos, int longitud, int altura, String marca, String modelo) {
        this.n_bastidor = n_bastidor;
        this.precio = precio;
        this.caballos = caballos;
        this.longitud = longitud;
        this.altura = altura;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getN_bastidor() {
        return n_bastidor;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCaballos() {
        return caballos;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getAltura() {
        return altura;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /*El unico valor que puede ser modificado ya que puede variar con el tiempo 
    y por tanto tiene el set, es el precio*/
    
    public String imprimirDatos(){
        String salida="Numero de bastidor: "+ this.getN_bastidor()+", Marca: "+
                    this.getMarca()+", Modelo: "+this.getModelo()+", Caballos: "+
                    this.getCaballos()+", Longitud: "+this.getLongitud()+", Altura: "+
                    this.getAltura()+", Precio: "+this.getPrecio();
        return salida;
    }

    @Override
    public int compareTo(Object o) {
        Coche coche=(Coche)o;
        if(coche.getN_bastidor()<n_bastidor)
            return -1;
        else if(coche.getN_bastidor()>n_bastidor)
            return 1;
        else return 0;
    }
}
