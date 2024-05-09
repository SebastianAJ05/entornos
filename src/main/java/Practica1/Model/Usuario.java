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
public class Usuario {

    private Puntuacion puntuacion;
    private Historial historial;
    private String Nickname;
    private String Email;
    private String Contrasenia;
    ArrayList<Videojuego> videojuegos = new ArrayList<>();
    ArrayList<Videojuego> videojuegos_acertados = new ArrayList<>();

    public Usuario(String Nickname, String Email, String Contrasenia) {
        this.puntuacion = new Puntuacion();
        this.historial = new Historial();
        this.Nickname = Nickname;
        this.Email = Email;
        this.Contrasenia = Contrasenia;
    }

    public void adivinarVideojuego(int opcion) {

        int ale1 = (int) (Math.random() * this.videojuegos.size());
        int ale2 = (int) (Math.random() * this.videojuegos.size());
        if (ale2 == ale1) {
            do {
                ale2 = (int) (Math.random() * this.videojuegos.size());
            } while (ale2 == ale1);
        }
        int ale3 = (int) (Math.random() * this.videojuegos.size());
        if (ale3 == ale1 || ale3 == ale2) {
            do {
                ale3 = (int) (Math.random() * this.videojuegos.size());
            } while (ale3 == ale1 || ale3 == ale2);
        }
        int ale4 = (int) (Math.random() * this.videojuegos.size());
        if (ale4 == ale1 || ale4 == ale2 || ale4 == ale3) {
            do {
                ale4 = (int) (Math.random() * this.videojuegos.size());
            } while (ale4 == ale1 || ale4 == ale2 || ale4 == ale3);
        }
        Videojuego opciones[] = new Videojuego[4];
        opciones[0] = this.videojuegos.get(ale1);
        opciones[1] = this.videojuegos.get(ale2);
        opciones[2] = this.videojuegos.get(ale3);
        opciones[3] = this.videojuegos.get(ale4);
        int aleCorrecta = (int) (Math.random() * opciones.length);
        System.out.println("Ésta es la imagen del videojuego:");
        System.out.println("Imagen: " + this.videojuegos.get(aleCorrecta).getCaratula().getID());
        System.out.println("1. " + this.videojuegos.get(ale1).getNombre());
        System.out.println("2. " + this.videojuegos.get(ale2).getNombre());
        System.out.println("3. " + this.videojuegos.get(ale3).getNombre());
        System.out.println("4. " + this.videojuegos.get(ale4).getNombre());
        if (opcion == aleCorrecta) {
            this.puntuacion.sumarPuntuacion(10);
            this.historial.acertar();
        } else {
            this.historial.fallar();
        }
    }

    public void verPuntuación() {
        System.out.println("Ahora mismo tienes " + puntuacion.getPuntos() + " puntos");
    }

    public void verHistorial() {
        System.out.println("Has respondido: " + historial.getPreguntasRespondidas() + " preguntas");
        System.out.println("Has acertado: " + historial.getRespuestasCorrectas() + " preguntas");
        System.out.println("Has fallado: " + historial.getRepuestasFallidas() + " preguntas");
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * @param nicknameNuevo
     */
    public void setNickname(String nicknameNuevo) {
        this.Nickname = nicknameNuevo;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * @param emailNuevo
     */
    public void setEmail(String emailNuevo) {
        this.Email = emailNuevo;
    }

    /**
     * @return contrasenia del usuario
     */
    public String getContrasenia() {
        return this.Contrasenia;
    }

    /**
     * @param contraseniaNueva
     */
    public void setContrasenia(String contraseniaNueva) {
        this.Contrasenia = contraseniaNueva;
    }

    /**
     * @return objeto Puntuación
     */
    public Puntuacion getPuntuacion() {
        return this.puntuacion;
    }
    /**
     * @return objeto Historial
     */
    public Historial getHistorial() {
        return this.historial;
    }
}
