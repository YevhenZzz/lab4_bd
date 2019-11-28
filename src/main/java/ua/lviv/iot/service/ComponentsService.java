package ua.lviv.iot.service;

import ua.lviv.iot.DAO.implementation.ComponentsDAO;
import ua.lviv.iot.model.ComponentsEntity;

import java.util.List;

public class ComponentsService {
    public List<ComponentsEntity> findAll() throws Exception {
        return new ComponentsDAO().findAll();
    }

    public ComponentsEntity findById(Integer id) throws Exception {
        return new ComponentsDAO().findById(id);
    }

    public void create(ComponentsEntity entity) throws Exception {
        new ComponentsDAO().create(entity);
    }

    public void update(ComponentsEntity entity) throws Exception {
        new ComponentsDAO().update(entity);
    }

    public void delete(Integer id) throws Exception {
        new ComponentsDAO().delete(id);
    }
}