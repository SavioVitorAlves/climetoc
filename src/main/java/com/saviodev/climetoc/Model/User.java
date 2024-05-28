package com.saviodev.climetoc.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
/**
 * User
 */
@Entity
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        private String username;
    
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "city_id", referencedColumnName = "id")
        private City city;
    
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "period_id", referencedColumnName = "id")
        private Period period;
    
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "weather_id", referencedColumnName = "id")
        private Weather weather;

        // Getters and Setters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public City getCity() {
                return city;
        }

        public void setCity(City city) {
                this.city = city;
        }

        public Period getPeriod() {
                return period;
        }

        public void setPeriod(Period period) {
                this.period = period;
        }

        public Weather getWeather() {
                return weather;
        }

        public void setWeather(Weather weather) {
                this.weather = weather;
        }
    
        
    
}