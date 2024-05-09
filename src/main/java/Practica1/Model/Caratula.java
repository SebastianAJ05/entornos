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
public class Caratula {

    public Caratula(String NombreVideojuego, int ID) {
        this.NombreVideojuego = NombreVideojuego;
        this.ID = ID;
        this.Altura = 40;
        this.Anchura = 30;
    }

    
    
    private int Anchura;
    private int Altura;

    /**
     * 
     */
    private String NombreVideojuego;

    /**
     * 
     */
    private int ID;

    /**
     * 
     */
    /**
     * @return anchura de la carátula
     */
    public int getAnchura() {
        // TODO implement here
        return 0;
    }

    /**
     * @param anchuraNueva
     */
    public void setAnchura(int anchuraNueva) {
        this.Anchura = anchuraNueva;
    }

    /**
     * @return altura
     */
    public int getAltura() {
        return this.Altura;
    }

    /**
     * @param alturaNueva
     */
    public void setAltura(int alturaNueva) {
        this.Altura = alturaNueva;
    }

    /**
     * @return nombre del videojuego
     */
    public String getNombreVideojuego() {
        return this.NombreVideojuego;
    }

    /**
     * @param nombreNuevo
     */
    public void setNombreVideojuego(String nombreNuevo) {
        this.NombreVideojuego = nombreNuevo;
    }
    
    /**
     * @return ID
     */
    public int getID() {
        return this.ID;
    }

    /**
     * @param IDnuevo
     */
    public void setID(int IDnuevo) {
        this.ID = IDnuevo;
    }
}