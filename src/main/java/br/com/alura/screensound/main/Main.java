package br.com.alura.screensound.main;

import br.com.alura.screensound.model.Artist;
import br.com.alura.screensound.model.ArtistType;
import br.com.alura.screensound.repository.ArtistRepository;

import java.util.Scanner;

public class Main {

    private final ArtistRepository repository;
    Scanner input = new Scanner(System.in);

    public Main(ArtistRepository repository) {
        this.repository = repository;
    }

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
        var response = "S";
        ArtistType artistType = null;
        
        while (response.equalsIgnoreCase("S")){
            System.out.println("Informe o nome desse artista: ");
            var artistName = input.nextLine();

            System.out.println("Informe o tipo de artista: (solo, dupla ou banda)");
            var type = input.nextLine();
            
            if (type.equalsIgnoreCase("solo")) {
                artistType = ArtistType.SOIL;
            } else if (type.equalsIgnoreCase("dupla")) {
                artistType = ArtistType.DUAL;
            } else if (type.equalsIgnoreCase("banda")) {
                artistType = ArtistType.BAND;
            } else {
                System.out.println("Tipo de artista invalido! ");
                break;
            }

            Artist artist = new Artist(artistName, artistType);
            repository.save(artist);
            System.out.println("Deseja cadastrar outro artista? (S/N)");
            response = input.nextLine();
        }

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
