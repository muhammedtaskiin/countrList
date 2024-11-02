package com.lokal_ai.countries.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Country {
//    @Id
//    private Long id;
    private String countryCode;
    private String countryName;
    private List<City> cities;
    private List<Theme> themes;

}