package br.com.alura.principal;

import br.com.alura.modelos.MinhasPreferidas;
import br.com.alura.modelos.Musicas;
import br.com.alura.modelos.Podcasts;

public class Main {
    public static void main(String[] args) {

        Musicas minhaMusica = new Musicas("Kiss", "Forever", "Rock", "Forever", 120);

        Podcasts meuPodcast = new Podcasts("Marcus Mendes", "Podcast da Alura", "Bolha dev", 110);

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        System.out.println(minhaMusica);

        System.out.println();

        System.out.println(meuPodcast);

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}