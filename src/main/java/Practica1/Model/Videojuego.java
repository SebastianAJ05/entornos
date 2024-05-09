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
public class Videojuego {

    private Caratula caratula;
    private Pistas pista;
    private String Nombre;
    private int Anio_lanzamiento;
    private String Distribuidora;

    public Videojuego(Caratula caratula, Pistas pista, String Nombre, int Anio_lanzamiento, String Distribuidora) {
        this.caratula = caratula;
        this.pista = pista;
        this.Nombre = Nombre;
        this.Anio_lanzamiento = Anio_lanzamiento;
        this.Distribuidora = Distribuidora;
    }
    
    /**
     * @return objeto caratula
     */
    public Caratula getCaratula(){
        return this.caratula;
    }
    /**
     * @return nombre del juego
     */
    public String getNombre() {
        return this.Nombre;
    }
    /**
     * @param nombreNuevo
     */
    public void setNombre(String nombreNuevo) {
        this.Nombre = nombreNuevo;
    }
    /**
     * @return año de lanzamiento
     */
    public int getAnio_lanzamiento() {
        return this.Anio_lanzamiento;
    }

    /**
     * @param anioNuevo
     */
    public void setAnio_lanzamiento(int anioNuevo) {
        this.Anio_lanzamiento = anioNuevo;
    }

    /**
     * @return distribuidora del videojuego
     */
    public String getDistribuidora() {
        return this.Distribuidora;
    }

    /**
     * @param distribuidoraNueva
     */
    public void setDistribuidora(String distribuidoraNueva) {
        this.Distribuidora = distribuidoraNueva;
    }
    /**
     * @return pista del videojuego
     */
    public Pistas getPista() {
        return this.pista;
    }
    /**
     * @param pistaNueva
     */
    public void setPista(Pistas pistaNueva) {
        this.pista = pistaNueva;
    }
}