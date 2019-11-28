package ua.lviv.iot.DAO.implementation;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.lviv.iot.DAO.IManufacturerDAO;
import ua.lviv.iot.model.ManufacturerEntity;
import ua.lviv.iot.session.SessionManager;

import java.util.LinkedList;
import java.util.List;

public class ManufacturerDAO implements IManufacturerDAO {
    @Override
    public List<ManufacturerEntity> findAll() throws Exception {
        List<ManufacturerEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();
        Query query = session.createQuery("FROM ManufacturerEntity");
        for (Object obj : query.list()) {
            allEntities.add((ManufacturerEntity) obj);
        }

        return allEntities;
    }

    @Override
    public ManufacturerEntity findById(Integer id) throws Exception {
        Session session = SessionManager.getSession();
        return session.get(ManufacturerEntity.class, id);
    }

    @Override
    public void create(ManufacturerEntity entity) throws Exception {
        Session session = SessionManager.getSession();

        if (entity != null) {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } else {
            System.out.println("No entity to save");
        }
    }

    @Override
    public void update(ManufacturerEntity entity) throws Exception {
        Session session = SessionManager.getSession();

        if (entity != null) {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } else {
            System.out.println("No entity to update");
        }
    }

    @Override
    public void delete(Integer id) throws Exception {
        Session session = SessionManager.getSession();

        session.beginTransaction();
        ManufacturerEntity accountEntity = session.get(ManufacturerEntity.class, id);
        if (accountEntity != null) {
            session.delete(accountEntity);
        } else {
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}