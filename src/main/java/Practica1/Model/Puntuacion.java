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
public class Puntuacion {

    private int puntos;
    
    public Puntuacion() {
        this.puntos = 0;
    }

    /**
     * @return puntos ganados
     */
    /**
     * @param pganados
     * @return 
     */
    public int sumarPuntuacion(int pganados) {
        this.puntos += pganados;
        return this.puntos;
    }
    public void mostrarPuntuacion() {
        System.out.println("Ahora mismo tienes " + this.puntos + " puntos");
    }

    /**
     * @return puntos reseteados
     */
    /**
     * @param preset
     * @return 
     */
    public int resetearPuntos(int preset) {
        if (preset > this.puntos) {
            this.puntos = this.puntos;
        } else {
            this.puntos = preset;
        }
        return this.puntos;
    }

    /**
     * @return puntos que tiene el usuario
     */
    public int getPuntos() {
        return this.puntos;
    }

    /**
     * @param puntosNuevos
     */
    public void setPuntos(int puntosNuevos) {
        this.puntos = puntosNuevos;
    }

}
