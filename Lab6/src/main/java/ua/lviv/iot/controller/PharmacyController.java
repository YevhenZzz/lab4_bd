package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.model.Pharmacy;
import ua.lviv.iot.service.PharmacyService;

import java.util.List;

@RestController
@RequestMapping("/Database_lab3_Bufan")
public class PharmacyController {
    @Autowired
    PharmacyService pharmacyervice;

    @GetMapping("/pharmacy")
    public List<Pharmacy> findAll() throws Exception {
        return pharmacyervice.findAll();
    }

    @GetMapping("/pharmacy/{id}")
    public Pharmacy findById(@PathVariable Integer id) throws Exception {
        return pharmacyervice.findById(id);
    }

    @PostMapping("/pharmacy")
    public void create(@RequestBody Pharmacy entity) throws Exception {
        pharmacyervice.create(entity);
    }

    @PutMapping("/pharmacy/{id}")
    public void update(@PathVariable Integer id, @RequestBody Pharmacy entity) throws Exception {
        entity.setId(id);
        pharmacyervice.update(entity);
    }

    @DeleteMapping("/pharmacy/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        pharmacyervice.delete(id);
    }
}
