package ua.lviv.iot.DAO.implementation;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.lviv.iot.DAO.IPharmacyDAO;
import ua.lviv.iot.model.PharmacyEntity;
import ua.lviv.iot.session.SessionManager;

import java.util.LinkedList;
import java.util.List;

public class PharmacyDAO implements IPharmacyDAO {
    @Override
    public List<PharmacyEntity> findAll() throws Exception {
        List<PharmacyEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();
        Query query = session.createQuery("FROM PharmacyEntity");
        for (Object obj : query.list()) {
            allEntities.add((PharmacyEntity) obj);
        }

        return allEntities;
    }

    @Override
    public PharmacyEntity findById(Integer id) throws Exception {
        Session session = SessionManager.getSession();
        return session.get(PharmacyEntity.class, id);
    }

    @Override
    public void create(PharmacyEntity entity) throws Exception {
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
    public void update(PharmacyEntity entity) throws Exception {
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
        PharmacyEntity accountEntity = session.get(PharmacyEntity.class, id);
        if (accountEntity != null) {
            session.delete(accountEntity);
        } else {
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}