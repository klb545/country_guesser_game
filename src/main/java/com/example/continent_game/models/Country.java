package com.example.continent_game.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "GDP")
    private long GDP;

    @Column(name = "capital")
    private String capital;

    @Column(name = "population")
    private int population;

    @ManyToOne
    @JoinColumn(name = "continent_id", nullable = false)
    private Continent continent;

    public Country(String name, long GDP, String capital, int population, Continent continent){

        this.name = name;
        this.GDP = GDP;
        this.capital = capital;
        this.population = population;
        this.continent = continent;
    }
    public Country(){

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

    public long getGDP() {
        return GDP;
    }

    public void setGDP(long GDP) {
        this.GDP = GDP;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }


//    @Entity
//@Table(name = "countries")
//public class Country {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private Long id;
//    @Column
//    private String name;
//    @Column
//    private long GDP;
//    @Column
//    private String capital;
//    @Column
//    private int population;
//    @JsonIgnoreProperties({"countries"})
//    @ManyToOne
//    @JoinTable(name = "continents")
//    private List<Continent> continent;
//
//    public Country(String name, long GDP, String capital, int population){
//
//        this.name = name;
//        this.GDP = GDP;
//        this.capital = capital;
//        this.population = population;
//        this.continent = new ArrayList<>();
//    }
//    public Country(){
//
//    }
////    Methods
//
////    Getters/Setters
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public long getGDP() {
//        return GDP;
//    }
//
//    public void setGDP(long GDP) {
//        this.GDP = GDP;
//    }
//
//    public String getCapital() {
//        return capital;
//    }
//
//    public void setCapital(String capital) {
//        this.capital = capital;
//    }
//
//    public int getPopulation() {
//        return population;
//    }
//
//    public void setPopulation(int population) {
//        this.population = population;
//    }
//
//    public List<Continent> getContinent() {
//        return continent;
//    }
//
//    public void setContinent(List<Continent> continent) {
//        this.continent = continent;
//    }
//}




}
