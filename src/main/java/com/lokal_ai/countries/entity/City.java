package com.lokal_ai.countries.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City {
//    @Id
//    private Long id;
    private String cityCode;
    private String cityName;



}
