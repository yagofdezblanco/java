/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author alberto
 */
public enum Producto {
    PRODUCTO1(600), PRODUCTO2(300), PRODUCTO3(200), PRODUCTO4(150), PRODUCTO5(100), PRODUCTO6(95), PRODUCTO7(45), PRODUCTO8(35);
    private final int coste;
    
    public int getCoste() {
        return coste;
    }
    
    Producto(int coste) {
        this.coste = coste;
    }
}
