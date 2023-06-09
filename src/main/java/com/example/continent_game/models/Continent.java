package com.example.continent_game.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "continents")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @JsonIgnoreProperties({"continent", "games"})
    @OneToMany(mappedBy = "continent")
    private List<Country> countries;

    @JsonIgnoreProperties({"continent", "guesses", "player"})
    @OneToMany(mappedBy = "continent")
    private List<Game> games;

    public Continent (String name){
        this.name = name;
        this.countries = new ArrayList<>();
        this.games = new ArrayList<>();
    }
    public Continent(){

    }
//    Methods


//    Getters/Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }


}
