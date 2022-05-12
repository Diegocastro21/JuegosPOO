package packageprincipal;

import packagelogica.Juego;

import java.util.ArrayList;
import java.util.List;

public class JuegoPrincipal {
    public static void main(String[] args) {

        List<Juego> listaJuegos = new ArrayList<Juego>();

        Juego video1 = new Juego(123, "Banjo Kazooie", "Nintendo 64"
                , 4, "Plataforma");
        Juego video2 = new Juego(456, "Mario Party", "Nintendo 64"
                , 4, "Plataforma");
        Juego video3 = new Juego(789, "Age of Empire", "PC"
                , 1, "Estrategia");
        Juego video4 = new Juego(146, "Counter Strike", "PC"
                , 1, "Shooter");
        Juego video5 = new Juego(170, "Mario Kart 64", "Nintendo 64"
                , 4, "Plataforma");

        listaJuegos.add(video1);
        listaJuegos.add(video2);
        listaJuegos.add(video3);
        listaJuegos.add(video4);
        listaJuegos.add(video5);

        listaJuegos.forEach(video-> System.out.println("Titulo: "+ video.getTitulo() + " Consola: " + video.getConsola()
                + " Cant Jugadores: "+video.getCantJugadores()));
        System.out.println("\n\n");
        video1.setTitulo("Banjo Kazooie II");
        video1.setCantJugadores(2);

        video5.setTitulo("Super Mario Kart 64");
        video5.setCantJugadores(4);

        listaJuegos.forEach(video-> {
            if (video.getConsola().equals("Nintendo 64")) {
                System.out.println(video.toString());
            }
        });



    }
}
