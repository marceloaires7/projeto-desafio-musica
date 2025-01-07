package br.com.alura.modelos;

public class Musicas extends Audio {
    private String artista;
    private String album;
    private String genero;

    public Musicas(String artista, String album, String genero, String titulo, int duracao) {
        super(titulo, duracao);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("Reproduzindo música: " + getTitulo());

    }

    @Override
    public void curtir() {
        super.curtir();
        System.out.println("Curtindo música: " + getTitulo());
    }

    @Override
    public String toString() {
        return String.format("""

                Artista:                   %s
                Álbum:                     %s
                Gênero:                    %s
                Título:                    %s
                Duração:                   %d
                Total de Reproduções:      %d
                Total de Curtidas:         %d
                Classificação:             %d
                """, artista, album, genero, getTitulo(), getDuracao(), getTotalReproducoes(), getTotalCurtidas(),
                getClassificacao());
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 5;
        } else if (this.getTotalReproducoes() > 500) {
            return 4;
        } else if (this.getTotalReproducoes() > 100) {
            return 3;
        } else if (this.getTotalReproducoes() > 50) {
            return 2;
        } else {
            return 1;
        }
    }
}
