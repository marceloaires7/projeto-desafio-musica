package br.com.alura.modelos;

public class Audio implements Reproduzivel {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalReproducoes = 0;
        this.totalCurtidas = 0;
        this.classificacao = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public void curtir() {
        this.totalCurtidas++;
    }

    @Override
    public void reproduzir() {
        this.totalReproducoes++;
    }
}
