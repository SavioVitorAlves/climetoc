package com.saviodev.climetoc.Service;
import com.saviodev.climetoc.Model.Weather;
import com.saviodev.climetoc.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    public List<Weather> findAll() {
        return weatherRepository.findAll();
    }

    public Weather save(Weather weather) {
        return weatherRepository.save(weather);
    }

    public Weather findById(Long id) {
        return weatherRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        weatherRepository.deleteById(id);
    }
}
