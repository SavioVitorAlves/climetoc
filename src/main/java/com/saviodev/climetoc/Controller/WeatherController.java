// UserController.java
package com.saviodev.climetoc.Controller;

import com.saviodev.climetoc.Model.Weather;
import com.saviodev.climetoc.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weathers")
public class WeatherController {
    @Autowired
    private WeatherService watherService;

    @GetMapping
    public List<Weather> getAllweathers() {
        return watherService.findAll();
    }

    @PostMapping
    public Weather createWeather(@RequestBody Weather weather) {
        return watherService.save(weather);
    }

    @GetMapping("/{id}")
    public Weather getWeatherById(@PathVariable Long id) {
        return watherService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteWeather(@PathVariable Long id) {
        watherService.deleteById(id);
    }
}