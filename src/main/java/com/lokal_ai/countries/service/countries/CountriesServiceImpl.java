package com.lokal_ai.countries.service.countries;

import com.lokal_ai.countries.entity.City;
import com.lokal_ai.countries.entity.Country;
import com.lokal_ai.countries.entity.Theme;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountriesServiceImpl implements CountriesService {


    @Override
    public List<Country> getCountryList() throws Exception {
        Country country = new Country();

        List<Country> countryList = new ArrayList<>();

        try {

            country.setCountryName("Türkiye");
            country.setCountryCode("TR");
            country.setCities(getTrCityList());
            countryList.add(country);

            country = new Country();

            country.setCountryName("IT");
            country.setCountryCode("Italy");
            country.setCities(getItCityList());
            countryList.add(country);

            country = new Country();

            country.setCountryName("DE");
            country.setCountryCode("Germany");
            country.setCities(getGerCityList());
            countryList.add(country);
            country.setThemes(getThemeList());

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return countryList;
    }

    private List<City> getTrCityList() {
        List<City> cityList = new ArrayList<>();
        City city = new City();
        city.setCityCode("IST");
        city.setCityName("Istanbul");
        cityList.add(city);
        city = new City();

        city.setCityCode("ANK");
        city.setCityName("Ankara");
        cityList.add(city);
        city = new City();

        city.setCityCode("IZ");
        city.setCityName("Izmir");
        cityList.add(city);
        city = new City();

        city.setCityCode("AN");
        city.setCityName("Antalya");
        cityList.add(city);

        return cityList;
    }

    private List<City> getItCityList() {
        List<City> cityList = new ArrayList<>();
        City city = new City();
        city.setCityCode("ROM");
        city.setCityName("Rome");
        cityList.add(city);
        city = new City();

        city.setCityCode("MIL");
        city.setCityName("Milan");
        cityList.add(city);
        city = new City();

        city.setCityCode("NAP");
        city.setCityName("Naples");
        cityList.add(city);
        city = new City();

        city.setCityCode("VEN");
        city.setCityName("Venice");
        cityList.add(city);
        city = new City();

        city.setCityCode("FLR");
        city.setCityName("Florence");
        cityList.add(city);

        return cityList;
    }

    private List<City> getGerCityList() {
        List<City> cityList = new ArrayList<>();
        City city = new City();
        city.setCityCode("BER");
        city.setCityName("Berlin");
        cityList.add(city);
        city = new City();

        city.setCityCode("MUC");
        city.setCityName("Munich");
        cityList.add(city);
        city = new City();

        city.setCityCode("FRA");
        city.setCityName("Frankfurt");
        cityList.add(city);
        city = new City();

        city.setCityCode("HAM");
        city.setCityName("Hamburg");
        cityList.add(city);
        city = new City();

        city.setCityCode("STU");
        city.setCityName("Stuttgart");
        cityList.add(city);

        return cityList;
    }

    private List<Theme> getThemeList() {
        List<Theme> themeList = new ArrayList<>();
        Theme theme = new Theme();

        theme.setTheme_id("a");
        theme.setTheme_def("Art of the City");
        theme.setTheme_def_text("city_art");
        theme.setTheme_def_letter("aesthetic");
        theme.setTheme_description("art");
        themeList.add(theme);
        theme = new Theme();

        theme.setTheme_id("b");
        theme.setTheme_def("City Culture");
        theme.setTheme_def_text("city_culture");
        theme.setTheme_def_letter("historical");
        theme.setTheme_description("cultural");
        themeList.add(theme);
        theme = new Theme();

        theme.setTheme_id("c");
        theme.setTheme_def("Aesthetic Beauties");
        theme.setTheme_def_text("aesthetic_beauties");
        theme.setTheme_def_letter("great_views");
        theme.setTheme_description("architecture/art");
        themeList.add(theme);
        theme = new Theme();

        theme.setTheme_id("d");
        theme.setTheme_def("Religious Journeys");
        theme.setTheme_def_text("religious_journeys");
        theme.setTheme_def_letter("belief");
        theme.setTheme_description("spiritual");
        themeList.add(theme);
        theme = new Theme();

        theme.setTheme_id("e");
        theme.setTheme_def("History of the City");
        theme.setTheme_def_text("city_history");
        theme.setTheme_def_letter("great_views/aesthetic/natural");
        theme.setTheme_description("architecture/photography");
        themeList.add(theme);
        theme = new Theme();

        theme.setTheme_id("f");
        theme.setTheme_def("Photography");
        theme.setTheme_def_text("city_photography");
        theme.setTheme_def_letter("aesthetic");
        theme.setTheme_description("Lorem Ipsum");
        themeList.add(theme);
        theme = new Theme();

        theme.setTheme_id("g");
        theme.setTheme_def("Family Fun");
        theme.setTheme_def_text("city_fun");
        theme.setTheme_def_letter("for_kids");
        theme.setTheme_description("fun/photography");
        themeList.add(theme);
        theme = new Theme();

        theme.setTheme_id("i");
        theme.setTheme_def("Romantism");
        theme.setTheme_def_text("city_romantism");
        theme.setTheme_def_letter("great_views");
        theme.setTheme_description("romantic");
        themeList.add(theme);

        theme.setTheme_id("j");
        theme.setTheme_def("Modern View");
        theme.setTheme_def_text("modern_view");
        theme.setTheme_def_letter("modern");
        theme.setTheme_description("art");
        themeList.add(theme);

        theme.setTheme_id("k");
        theme.setTheme_def("Islands Tour");
        theme.setTheme_def_text("princess_islands");
        theme.setTheme_def_letter("historical/natural");
        theme.setTheme_description("cultural/fun");
        themeList.add(theme);

        return themeList;
    }
}
