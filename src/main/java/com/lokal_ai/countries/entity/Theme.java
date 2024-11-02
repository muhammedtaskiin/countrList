package com.lokal_ai.countries.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Theme {
//    @Id
//    private Long id;
    private String theme_id;
    private String theme_def_letter;
    private String theme_def;
    private String theme_def_text;
    private String theme_description;



}
