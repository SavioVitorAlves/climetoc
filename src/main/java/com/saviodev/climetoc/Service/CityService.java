package com.saviodev.climetoc.Service;
import com.saviodev.climetoc.Model.City;
import com.saviodev.climetoc.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public City save(City city) {
        return cityRepository.save(city);
    }

    public City findById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }
}
