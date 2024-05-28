// UserController.java
package com.saviodev.climetoc.Controller;

import com.saviodev.climetoc.Model.Period;
import com.saviodev.climetoc.Service.PeriodService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/periods")
public class PeriodController {
    @Autowired
    private PeriodService periodService;

    @GetMapping
    public List<Period> getAllperiods() {
        return periodService.findAll();
    }

    @PostMapping
    public Period createPeriod(@RequestBody Period period) {
        return periodService.save(period);
    }

    @GetMapping("/{id}")
    public Period getPeriodById(@PathVariable Long id) {
        return periodService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePeriod(@PathVariable Long id) {
        periodService.deleteById(id);
    }
}