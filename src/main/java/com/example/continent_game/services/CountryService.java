package com.example.continent_game.services;

import com.example.continent_game.models.Country;
import com.example.continent_game.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //Create

    public Country createCountry(String name, long GDP, String capital, int population) {
        Country country = new Country(name, GDP, capital, population);
        return countryRepository.save(country);

    }

    //Read
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Optional <Country> getCountry(Long id) {
        return countryRepository.findById(id);
    }

//   TODO: Double check update country
    //UPDATE

    public Country updateCountry(Long id, String name, long GDP, String capital, int population) {
        Optional<Country> optionalCountry = countryRepository.findById(id);
        if (optionalCountry.isPresent()) {
            Country country = optionalCountry.get();
            country.setName(name);
            country.setGDP(GDP);
            country.setPopulation(population);
            return countryRepository.save(country); //return the updated object.
        }

        return null; // If the country doesn't exist.
    }

    //Delete

    public boolean deleteCountry(Long id) {
        Optional<Country> optionalCountry = countryRepository.findById(id);
        if (optionalCountry.isPresent()) { //check if it is in country object
            countryRepository.deleteById(id); //delete the country object with given id
            return true; //successfully deleted
        }
        return false; //if not found in the repository it can not be deleted
    }
}