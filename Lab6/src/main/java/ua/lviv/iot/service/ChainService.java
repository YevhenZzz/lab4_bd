package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Chain;
import ua.lviv.iot.repository.ChainRepository;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class ChainService {
    @Autowired
    ChainRepository chainRepository;

    public List<Chain> findAll() throws Exception {
        List<Chain> chain = new LinkedList<>(chainRepository.findAll());
        if (chain.isEmpty()) {
            return null;
        }
        return chain;
    }

    public Chain findById(Integer id) throws Exception {
        if (chainRepository.findById(id).isPresent()) {
            return chainRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Chain entity) throws Exception {
        if (entity != null) {
            chainRepository.save(entity);
        }
    }

    @Transactional
    public void update(Chain entity) throws Exception {
        chainRepository.findById(entity.getId())
                .map(oldEntity -> {
                    oldEntity.setPodorozhnik(entity.getPodorozhnik());
                    oldEntity.setZe(entity.getZe());
                    oldEntity.setDs(entity.getDs());
                    return chainRepository.save(oldEntity);
                })
                .orElseGet(() -> chainRepository.save(entity));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (chainRepository.findById(id).isPresent()) {
            chainRepository.deleteById(id);
        }
    }
}
