package ua.lviv.iot.DAO.implementation;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.lviv.iot.DAO.IComponentsDAO;
import ua.lviv.iot.model.ComponentsEntity;
import ua.lviv.iot.session.SessionManager;

import java.util.LinkedList;
import java.util.List;

public class ComponentsDAO implements IComponentsDAO {
    @Override
    public List<ComponentsEntity> findAll() throws Exception {
        List<ComponentsEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();
        Query query = session.createQuery("FROM ComponentsEntity");
        for (Object obj : query.list()) {
            allEntities.add((ComponentsEntity) obj);
        }

        return allEntities;
    }

    @Override
    public ComponentsEntity findById(Integer id) throws Exception {
        Session session = SessionManager.getSession();
        return session.get(ComponentsEntity.class, id);
    }

    @Override
    public void create(ComponentsEntity entity) throws Exception {
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
    public void update(ComponentsEntity entity) throws Exception {
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
        ComponentsEntity accountEntity = session.get(ComponentsEntity.class, id);
        if (accountEntity != null) {
            session.delete(accountEntity);
        } else {
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}