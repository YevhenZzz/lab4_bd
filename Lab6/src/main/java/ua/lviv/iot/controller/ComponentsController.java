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
import ua.lviv.iot.model.Components;
import ua.lviv.iot.service.ComponentsService;

import java.util.List;

@RestController
@RequestMapping("/Database_lab3_Bufan")
public class ComponentsController {
    @Autowired
    ComponentsService componentservice;

    @GetMapping("/components")
    public List<Components> findAll() throws Exception {
        return componentservice.findAll();
    }

    @GetMapping("/components/{id}")
    public Components findById(@PathVariable Integer id) throws Exception {
        return componentservice.findById(id);
    }

    @PostMapping("/components")
    public void create(@RequestBody Components entity) throws Exception {
        componentservice.create(entity);
    }

    @PutMapping("/components/{id}")
    public void update(@PathVariable Integer id, @RequestBody Components entity) throws Exception {
        entity.setId(id);
        componentservice.update(entity);
    }

    @DeleteMapping("/components/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        componentservice.delete(id);
    }
}
