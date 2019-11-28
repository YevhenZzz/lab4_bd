package ua.lviv.iot.service;

import ua.lviv.iot.DAO.implementation.PharmacyDAO;
import ua.lviv.iot.model.PharmacyEntity;

import java.util.List;

public class PharmacyService {
    public List<PharmacyEntity> findAll() throws Exception {
        return new PharmacyDAO().findAll();
    }

    public PharmacyEntity findById(Integer id) throws Exception {
        return new PharmacyDAO().findById(id);
    }

    public void create(PharmacyEntity entity) throws Exception {
        new PharmacyDAO().create(entity);
    }

    public void update(PharmacyEntity entity) throws Exception {
        new PharmacyDAO().update(entity);
    }

    public void delete(Integer id) throws Exception {
        new PharmacyDAO().delete(id);
    }
}