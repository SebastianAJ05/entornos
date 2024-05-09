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
public class Historial {
    private int PreguntasRespondidas;
    private int RespuestasCorrectas;
    private int RepuestasFallidas;

    public Historial() {
        this.PreguntasRespondidas =0;
        this.RepuestasFallidas =0;
        this.RespuestasCorrectas =0;
    }

    /**
     * 
     */
    
    /**
     * @return número de preguntas respondidas
     */
    public int getPreguntasRespondidas() {
        return this.PreguntasRespondidas;
    }

    /**
     * @param PreguntasRespondidas
     */
    
    public void setPreguntasRespondidas(int PreguntasRespondidas){
        this.PreguntasRespondidas =PreguntasRespondidas;
    }

    public void resetearHistorial() {
        this.PreguntasRespondidas =0;
        this.RespuestasCorrectas =0;
        this.RepuestasFallidas = 0;
    }
    /**
     * @return preguntas acertadas
     */
    public int getRespuestasCorrectas() {
        return this.RespuestasCorrectas;
    }

    /**
     * @param RespuestasCorrectas
     */
    public void setRespuestasCorrectas(int RespuestasCorrectas) {    
        this.RespuestasCorrectas = RespuestasCorrectas;
    }

    /**
     * @return preguntas falladas
     */
    public int getRepuestasFallidas() {
        return this.RepuestasFallidas;
    }
    /**
     * @param RepuestasFallidas
     */
    public void setRepuestasFallidas(int RepuestasFallidas) {
        this.RepuestasFallidas = RepuestasFallidas;
    }
    /**
     * @return preguntas acertadas
     */
    public int acertar(){
        this.PreguntasRespondidas++;
        this.RespuestasCorrectas++;
        return this.RespuestasCorrectas;
    }
    /**
     * @return preguntas falladas
     */
    public int fallar(){
        this.PreguntasRespondidas++;
        this.RepuestasFallidas++;
        return this.RepuestasFallidas;
    }

}