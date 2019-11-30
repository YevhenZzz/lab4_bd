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
import ua.lviv.iot.model.Category;
import ua.lviv.iot.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/Database_lab3_Bufan")
public class CategoryController {
    @Autowired
    CategoryService categoryervice;

    @GetMapping("/category")
    public List<Category> findAll() throws Exception {
        return categoryervice.findAll();
    }

    @GetMapping("/category/{id}")
    public Category findById(@PathVariable Integer id) throws Exception {
        return categoryervice.findById(id);
    }

    @PostMapping("/category")
    public void create(@RequestBody Category entity) throws Exception {
        categoryervice.create(entity);
    }

    @PutMapping("/category/{id}")
    public void update(@PathVariable Integer id, @RequestBody Category entity) throws Exception {
        entity.setId(id);
        categoryervice.update(entity);
    }

    @DeleteMapping("/category/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        categoryervice.delete(id);
    }
}
