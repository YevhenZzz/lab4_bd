package ua.lviv.iot.DAO.implementation;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.lviv.iot.DAO.ICategoryDAO;
import ua.lviv.iot.model.CategoryEntity;
import ua.lviv.iot.session.SessionManager;

import java.util.LinkedList;
import java.util.List;

public class CategoryDAO implements ICategoryDAO {
    @Override
    public List<CategoryEntity> findAll() throws Exception {
        List<CategoryEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();
        Query query = session.createQuery("FROM CategoryEntity");
        for (Object obj : query.list()) {
            allEntities.add((CategoryEntity) obj);
        }

        return allEntities;
    }

    @Override
    public CategoryEntity findById(Integer id) throws Exception {
        Session session = SessionManager.getSession();
        return session.get(CategoryEntity.class, id);
    }

    @Override
    public void create(CategoryEntity entity) throws Exception {
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
    public void update(CategoryEntity entity) throws Exception {
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
        CategoryEntity accountEntity = session.get(CategoryEntity.class, id);
        if (accountEntity != null) {
            session.delete(accountEntity);
        } else {
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}