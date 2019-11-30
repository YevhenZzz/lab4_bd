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
import ua.lviv.iot.model.Using;
import ua.lviv.iot.service.UsingService;

import java.util.List;

@RestController
@RequestMapping("/Database_lab3_Bufan")
public class UsingController {
    @Autowired
    UsingService usingervice;

    @GetMapping("/using")
    public List<Using> findAll() throws Exception {
        return usingervice.findAll();
    }

    @GetMapping("/using/{id}")
    public Using findById(@PathVariable Integer id) throws Exception {
        return usingervice.findById(id);
    }

    @PostMapping("/using")
    public void create(@RequestBody Using entity) throws Exception {
        usingervice.create(entity);
    }

    @PutMapping("/using/{id}")
    public void update(@PathVariable Integer id, @RequestBody Using entity) throws Exception {
        entity.setId(id);
        usingervice.update(entity);
    }

    @DeleteMapping("/using/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        usingervice.delete(id);
    }
}
