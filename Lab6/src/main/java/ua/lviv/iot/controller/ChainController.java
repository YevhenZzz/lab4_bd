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
import ua.lviv.iot.model.Chain;
import ua.lviv.iot.service.ChainService;

import java.util.List;

@RestController
@RequestMapping("/Database_lab3_Bufan")
public class ChainController {
    @Autowired
    ChainService chainervice;

    @GetMapping("/chain")
    public List<Chain> findAll() throws Exception {
        return chainervice.findAll();
    }

    @GetMapping("/chain/{id}")
    public Chain findById(@PathVariable Integer id) throws Exception {
        return chainervice.findById(id);
    }

    @PostMapping("/chain")
    public void create(@RequestBody Chain entity) throws Exception {
        chainervice.create(entity);
    }

    @PutMapping("/chain/{id}")
    public void update(@PathVariable Integer id, @RequestBody Chain entity) throws Exception {
        entity.setId(id);
        chainervice.update(entity);
    }

    @DeleteMapping("/chain/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        chainervice.delete(id);
    }
}
