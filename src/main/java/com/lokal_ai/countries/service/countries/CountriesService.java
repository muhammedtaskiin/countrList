package com.lokal_ai.countries.service.countries;

import com.lokal_ai.countries.entity.Country;

import java.util.List;

public interface CountriesService {

    List<Country> getCountryList() throws Exception;

}
