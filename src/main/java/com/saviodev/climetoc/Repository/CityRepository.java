package com.saviodev.climetoc.Repository;
import com.saviodev.climetoc.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}