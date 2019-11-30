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
import ua.lviv.iot.model.Manufacturer;
import ua.lviv.iot.service.ManufacturerService;

import java.util.List;

@RestController
@RequestMapping("/Database_lab3_Bufan")
public class ManufacturerController {
    @Autowired
    ManufacturerService manufacturerervice;

    @GetMapping("/manufacturer")
    public List<Manufacturer> findAll() throws Exception {
        return manufacturerervice.findAll();
    }

    @GetMapping("/manufacturer/{id}")
    public Manufacturer findById(@PathVariable Integer id) throws Exception {
        return manufacturerervice.findById(id);
    }

    @PostMapping("/manufacturer")
    public void create(@RequestBody Manufacturer entity) throws Exception {
        manufacturerervice.create(entity);
    }

    @PutMapping("/manufacturer/{id}")
    public void update(@PathVariable Integer id, @RequestBody Manufacturer entity) throws Exception {
        entity.setId(id);
        manufacturerervice.update(entity);
    }

    @DeleteMapping("/manufacturer/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        manufacturerervice.delete(id);
    }
}
