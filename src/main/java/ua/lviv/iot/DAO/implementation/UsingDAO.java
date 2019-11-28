package ua.lviv.iot.DAO.implementation;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.lviv.iot.DAO.IUsingDAO;
import ua.lviv.iot.model.UsingEntity;
import ua.lviv.iot.session.SessionManager;

import java.util.LinkedList;
import java.util.List;

public class UsingDAO implements IUsingDAO {

    @Override
    public List<UsingEntity> findAll() throws Exception {
        List<UsingEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();
        Query query = session.createQuery("FROM UsingEntity");
        for (Object obj : query.list()) {
            allEntities.add((UsingEntity) obj);
        }

        return allEntities;
    }

    @Override
    public UsingEntity findById(Integer id) throws Exception {
        Session session = SessionManager.getSession();
        return session.get(UsingEntity.class, id);
    }

    @Override
    public void create(UsingEntity entity) throws Exception {
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
    public void update(UsingEntity entity) throws Exception {
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
        UsingEntity accountEntity = session.get(UsingEntity.class, id);
        if (accountEntity != null) {
            session.delete(accountEntity);
        } else {
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}