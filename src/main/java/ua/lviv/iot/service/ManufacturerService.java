package ua.lviv.iot.service;

import ua.lviv.iot.DAO.implementation.ManufacturerDAO;
import ua.lviv.iot.model.ManufacturerEntity;

import java.util.List;

public class ManufacturerService {
    public List<ManufacturerEntity> findAll() throws Exception {
        return new ManufacturerDAO().findAll();
    }

    public ManufacturerEntity findById(Integer id) throws Exception {
        return new ManufacturerDAO().findById(id);
    }

    public void create(ManufacturerEntity entity) throws Exception {
        new ManufacturerDAO().create(entity);
    }

    public void update(ManufacturerEntity entity) throws Exception {
        new ManufacturerDAO().update(entity);
    }

    public void delete(Integer id) throws Exception {
        new ManufacturerDAO().delete(id);
    }
}