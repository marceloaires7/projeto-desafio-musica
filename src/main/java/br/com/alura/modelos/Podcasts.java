package br.com.alura.modelos;

public class Podcasts extends Audio {
    private String apresentador;
    private String descricao;

    public Podcasts(String apresentador, String descricao, String titulo, int duracao) {
        super(titulo, duracao);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("Reproduzindo podcast: " + getTitulo());
    }

    @Override
    public void curtir() {
        super.curtir();
        System.out.println("Curtindo podcast: " + getTitulo());
    }

    @Override
    public String toString() {
        return String.format("""
                Apresentador:              %s
                Descrição:                 %s
                Título:                    %s
                Duração:                   %d
                Total de Reproduções:      %d
                Total de Curtidas:         %d
                Classificação:             %d
                """, apresentador, descricao, getTitulo(), getDuracao(), getTotalReproducoes(), getTotalCurtidas(),
                getClassificacao());
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 5;
        } else if (this.getTotalCurtidas() > 100) {
            return 4;
        } else if (this.getTotalCurtidas() > 50) {
            return 3;
        } else if (this.getTotalCurtidas() > 10) {
            return 2;
        } else {
            return 1;
        }
    }
}
