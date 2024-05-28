package com.saviodev.climetoc.Service;
import com.saviodev.climetoc.Model.Period;
import com.saviodev.climetoc.Repository.PeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodService {
    @Autowired
    private PeriodRepository periodRepository;

    public List<Period> findAll() {
        return periodRepository.findAll();
    }

    public Period save(Period period) {
        return periodRepository.save(period);
    }

    public Period findById(Long id) {
        return periodRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        periodRepository.deleteById(id);
    }
}
