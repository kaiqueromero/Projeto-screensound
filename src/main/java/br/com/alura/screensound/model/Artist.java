package br.com.alura.screensound.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artists")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private ArtistType type;

    @OneToMany(mappedBy = "artist")
    private List<Songs> songs = new ArrayList<>();

    public Artist(){}

    public Artist(String artistName, ArtistType artistType) {
        this.name = artistName;
        this.type = artistType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() { return name;}

    public void setName(String name) {
        this.name = name;
    }

    public ArtistType getType() {
        return type;
    }

    public void setType(ArtistType type) {
        this.type = type;
    }

    public List<Songs> getSongs() {
        return songs;
    }

    public void setSongs(List<Songs> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "\nArtista: " + name +
                ", Tipo: " + type +
                ", Músicas:" + songs;
    }
}
