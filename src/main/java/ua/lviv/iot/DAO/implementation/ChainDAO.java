package ua.lviv.iot.DAO.implementation;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.lviv.iot.DAO.IChainDAO;
import ua.lviv.iot.model.ChainEntity;
import ua.lviv.iot.session.SessionManager;

import java.util.LinkedList;
import java.util.List;

public class ChainDAO implements IChainDAO {
    @Override
    public List<ChainEntity> findAll() throws Exception {
        List<ChainEntity> allEntities = new LinkedList<>();

        Session session = SessionManager.getSession();
        Query query = session.createQuery("FROM ChainEntity");
        for (Object obj : query.list()) {
            allEntities.add((ChainEntity) obj);
        }

        return allEntities;
    }

    @Override
    public ChainEntity findById(Integer id) throws Exception {
        Session session = SessionManager.getSession();
        return session.get(ChainEntity.class, id);
    }

    @Override
    public void create(ChainEntity entity) throws Exception {
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
    public void update(ChainEntity entity) throws Exception {
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
        ChainEntity accountEntity = session.get(ChainEntity.class, id);
        if (accountEntity != null) {
            session.delete(accountEntity);
        } else {
            System.out.println("No entity to delete");
        }
        session.getTransaction().commit();
    }
}