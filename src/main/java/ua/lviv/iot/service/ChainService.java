package ua.lviv.iot.service;

import ua.lviv.iot.DAO.implementation.ChainDAO;
import ua.lviv.iot.model.ChainEntity;

import java.util.List;

public class ChainService {
    public List<ChainEntity> findAll() throws Exception {
        return new ChainDAO().findAll();
    }

    public ChainEntity findById(Integer id) throws Exception {
        return new ChainDAO().findById(id);
    }

    public void create(ChainEntity entity) throws Exception {
        new ChainDAO().create(entity);
    }

    public void update(ChainEntity entity) throws Exception {
        new ChainDAO().update(entity);
    }

    public void delete(Integer id) throws Exception {
        new ChainDAO().delete(id);
    }
}