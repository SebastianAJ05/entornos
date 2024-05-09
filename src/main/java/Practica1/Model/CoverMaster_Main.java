package Practica1.Model;

import Practica1.Model.Caratula;
import Practica1.Model.Pistas;
import Practica1.Model.Usuario;
import Practica1.Model.Videojuego;
import java.util.Scanner;

public class CoverMaster_Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        Usuario user = new Usuario("niosdfvos", "FHJSDOFHS", "vhosdfhvos");
        Pistas BuscaminasPist = new Pistas("Bombas, bombas");
        Pistas TetrisPist = new Pistas("No encajas");
        Pistas FIFAPist = new Pistas("Métela!!");
        Pistas NBAPist = new Pistas("Triiiiple!!");
        Pistas KirbyPist = new Pistas("Vaya bola rosa mas glotona");
        Pistas MarioPist = new Pistas("Wahoooo!!!");
        Pistas SonicPist = new Pistas("El erizo azul");
        Pistas GTAPist = new Pistas("Atracos y robos");

        Caratula BuscaminasCar = new Caratula("Buscaminas", 1);
        Caratula TetrisCar = new Caratula("Tetris", 2);
        Caratula FIFACar = new Caratula("FIFA", 3);
        Caratula NBACar = new Caratula("NBA", 4);
        Caratula KirbysCar = new Caratula("Kirby", 5);
        Caratula MarioCar = new Caratula("Mario", 6);
        Caratula SonicCar = new Caratula("Sonic", 7);
        Caratula GTACar = new Caratula("GTA V", 8);

        Videojuego Buscaminas = new Videojuego(BuscaminasCar, BuscaminasPist, "Buscaminas", 1995, "HFEDHFO");
        Videojuego Tetris = new Videojuego(TetrisCar, TetrisPist, "Tetris", 1980, "biosfvhbos");
        Videojuego FIFA = new Videojuego(FIFACar, FIFAPist, "FIFA", 2010, "EA");
        Videojuego NBA = new Videojuego(NBACar, NBAPist, "NBA", 2005, "2K");
        Videojuego Kirby = new Videojuego(KirbysCar, KirbyPist, "Kirby", 2022, "Nintendo");
        Videojuego Mario = new Videojuego(MarioCar, MarioPist, "Super Mario", 2017, "Nintendo");
        Videojuego Sonic = new Videojuego(SonicCar, SonicPist, "Sonic The Hedhehog", 2021, "SEGA");
        Videojuego GTA = new Videojuego(GTACar, GTAPist, "GTA V", 2013, "Rockstar");
        user.videojuegos.add(Buscaminas);
        user.videojuegos.add(Tetris);
        user.videojuegos.add(FIFA);
        user.videojuegos.add(NBA);
        user.videojuegos.add(Kirby);
        user.videojuegos.add(Mario);
        user.videojuegos.add(Sonic);
        user.videojuegos.add(GTA);

        int ale1 = (int) (Math.random() * user.videojuegos.size());
        int ale2 = (int) (Math.random() * user.videojuegos.size());
        if (ale2 == ale1) {
            do {
                ale2 = (int) (Math.random() * user.videojuegos.size());
            } while (ale2 == ale1);
        }
        int ale3 = (int) (Math.random() * user.videojuegos.size());
        if (ale3 == ale1 || ale3 == ale2) {
            do {
                ale3 = (int) (Math.random() * user.videojuegos.size());
            } while (ale3 == ale1 || ale3 == ale2);
        }
        int ale4 = (int) (Math.random() * user.videojuegos.size());
        if (ale4 == ale1 || ale4 == ale2 || ale4 == ale3) {
            do {
                ale4 = (int) (Math.random() * user.videojuegos.size());
            } while (ale4 == ale1 || ale4 == ale2 || ale4 == ale3);
        }
        Videojuego opciones[] = new Videojuego[4];
        opciones[0] = user.videojuegos.get(ale1);
        opciones[1] = user.videojuegos.get(ale2);
        opciones[2] = user.videojuegos.get(ale3);
        opciones[3] = user.videojuegos.get(ale4);
        int aleCorrecta = (int) (Math.random() * opciones.length);
        System.out.println("Ésta es la imagen del videojuego:");
        System.out.println("Imagen: " + opciones[aleCorrecta].getCaratula().getID());
        System.out.println("1. " + opciones[0].getNombre());
        System.out.println("2. " + opciones[1].getNombre());
        System.out.println("3. " + opciones[2].getNombre());
        System.out.println("4. " + opciones[3].getNombre());
        do {
            System.out.println("¿Cuál es este videojuego? (1-4)");
            opcion = teclado.nextInt();
            if (opcion < 1 || opcion > 4) {
                System.out.println("METE UN NÚMERO DEL 1 AL 4.");
            }
        } while (opcion < 1 || opcion > 4);
        if (opcion == aleCorrecta + 1) {
            System.out.println("HAS ACERTADO");
            user.getPuntuacion().sumarPuntuacion(10);
            user.getHistorial().acertar();
        } else {
            System.out.println("HAS FALLADO");
            user.getHistorial().fallar();
        }
    }

}
