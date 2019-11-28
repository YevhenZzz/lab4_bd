package ua.lviv.iot.service;

import ua.lviv.iot.DAO.implementation.CategoryDAO;
import ua.lviv.iot.model.CategoryEntity;

import java.util.List;

public class CategoryService {
    public List<CategoryEntity> findAll() throws Exception {
        return new CategoryDAO().findAll();
    }

    public CategoryEntity findById(Integer id) throws Exception {
        return new CategoryDAO().findById(id);
    }

    public void create(CategoryEntity entity) throws Exception {
        new CategoryDAO().create(entity);
    }

    public void update(CategoryEntity entity) throws Exception {
        new CategoryDAO().update(entity);
    }

    public void delete(Integer id) throws Exception {
        new CategoryDAO().delete(id);
    }
}