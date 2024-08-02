package br.com.alura.screensound.main;

import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);

    public void showMenu() {
        int option;
        do {
            var menu = """
                    \n\n*** Screen Sound Musics ***
                    \n1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                    5- Pesquisar sobre um artista
                    \n9- Sair
                    """;

            System.out.println(menu);
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    registerArtist();
                    break;
                case 2:
                    registerSongs();
                    break;
                case 3:
                    listSongs();
                    break;
                case 4:
                    searchMusicByArtists();
                    break;
                case 5:
                    searchForArtistData();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (option != 9);
    }

    private void registerArtist() {
    }

    private void registerSongs() {
    }

    private void listSongs() {
    }

    private void searchMusicByArtists() {
    }

    private void searchForArtistData() {
    }
}
