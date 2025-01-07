# Projeto Desafio Música

Este projeto é uma aplicação Java que simula a reprodução e curtidas de músicas e podcasts.

## Estrutura do Projeto

- `Main.java`: Classe principal que executa a aplicação.
- `Reproduzivel.java`: Interface que define os métodos `curtir` e `reproduzir`.
- `Audio.java`: Classe base que implementa a interface `Reproduzivel`.
- `Musicas.java`: Classe que representa uma música, estendendo `Audio`.
- `Podcasts.java`: Classe que representa um podcast, estendendo `Audio`.

## Como Executar

1. Clone o repositório:
    ```sh
    git clone <URL_DO_REPOSITORIO>
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd projeto-desafio-musica
    ```

3. Compile o projeto:
    ```sh
    javac -d bin src/main/java/br/com/alura/principal/Main.java
    ```

4. Execute o projeto:
    ```sh
    java -cp bin br.com.alura.principal.Main
    ```

## Exemplo de Saída

A saída do programa será semelhante a:
```
Reproduzindo música: Forever
Curtindo música: Forever
...
Reproduzindo podcast: Podcast da Alura
Curtindo podcast: Podcast da Alura
...

Artista:                   Kiss
Álbum:                     Forever
Gênero:                    Rock
Título:                    Forever
Duração:                   120
Total de Reproduções:      1000
Total de Curtidas:         50
Classificação:             0

Apresentador:              Marcus Mendes
Descrição:                 Bolha dev
Título:                    Podcast da Alura
Duração:                   110
Total de Reproduções:      5000
Total de Curtidas:         1000
Classificação:             0
```

## Contribuição

Sinta-se à vontade para contribuir com o projeto. Para isso, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma nova branch:
    ```sh
    git checkout -b minha-nova-feature
    ```
3. Faça suas alterações e commit:
    ```sh
    git commit -m 'Adiciona nova feature'
    ```
4. Envie para o repositório remoto:
    ```sh
    git push origin minha-nova-feature
    ```
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
