package com.lokal_ai.countries.controller;

import com.lokal_ai.countries.entity.Country;
import com.lokal_ai.countries.service.countries.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/country")
public class CountriesController {

    @Autowired
    private CountriesService countriesService;


    @GetMapping("/countryList")
    public ResponseEntity<List<Country>> getCountryList() throws Exception {

        List<Country> countryList;
        countryList = countriesService.getCountryList();
        if (Objects.nonNull(countryList)) {
            return new ResponseEntity<>(countryList, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }


}
