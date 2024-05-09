package Practica1.Model;


import java.util.*;

/**
 *
 * @author alcoh
 */
/**
 *
 * @version 17.0
 */
public class Pistas {

    public Pistas(String Pista) {    
        this.Pista = Pista;
        this.Precio = 10;
    }

    private String Pista;

    
    private int Precio;

    /**
     * @return pista
     */
    public String getPista() {
        return this.Pista;
    }

    /**
     * @param pistaNueva
     */
    public void setPista(String pistaNueva) {
        this.Pista = pistaNueva;
    }

    /**
     * @return precio de la pista
     */
    public int getPrecio() {
        return this.Precio;
    }

    /**
     * @param precioNuevo
     */
    public void setPrecio(int precioNuevo) {
        this.Precio = precioNuevo;
    }

}