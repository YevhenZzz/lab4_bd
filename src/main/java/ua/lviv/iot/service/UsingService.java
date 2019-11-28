package ua.lviv.iot.service;

import ua.lviv.iot.DAO.implementation.UsingDAO;
import ua.lviv.iot.model.UsingEntity;

import java.util.List;

public class UsingService {
    public List<UsingEntity> findAll() throws Exception {
        return new UsingDAO().findAll();
    }

    public UsingEntity findById(Integer id) throws Exception {
        return new UsingDAO().findById(id);
    }

    public void create(UsingEntity entity) throws Exception {
        new UsingDAO().create(entity);
    }

    public void update(UsingEntity entity) throws Exception {
        new UsingDAO().update(entity);
    }

    public void delete(Integer id) throws Exception {
        new UsingDAO().delete(id);
    }
}