package br.com.alura.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 4) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos! NOTA: "
                    + audio.getClassificacao());
        } else if (audio.getClassificacao() >= 3) {
            System.out.println(audio.getTitulo() + " é considerado um sucesso! NOTA: " + audio.getClassificacao());
        } else if (audio.getClassificacao() >= 2) {
            System.out.println(
                    audio.getTitulo() + " é considerado um sucesso moderado! NOTA: " + audio.getClassificacao());
        } else {
            System.out.println(audio.getTitulo() + " não é considerado um sucesso! NOTA: " + audio.getClassificacao());
        }
    }
}
