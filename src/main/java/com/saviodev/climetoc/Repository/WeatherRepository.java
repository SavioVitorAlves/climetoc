package com.saviodev.climetoc.Repository;
import com.saviodev.climetoc.Model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
}