
package ejercicio3;

/*
Creamos un enumerado que contenga las monedas con sus correspondientes valores
 */
public enum Moneda {
    EURO2(200), EURO1(100), CENT50(50), CENT20(20), CENT10(10), CENT5(5), CENT2(2), CENT1(1);
    private final int valor;
    
    public int getValor() {
        return valor;
    }
    
    Moneda(int valor) {
        this.valor = valor;
    }
}
