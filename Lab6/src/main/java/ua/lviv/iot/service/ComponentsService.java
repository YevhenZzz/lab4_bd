package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Components;
import ua.lviv.iot.repository.ComponentsRepository;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class ComponentsService {
    @Autowired
    ComponentsRepository componentsRepository;

    public List<Components> findAll() throws Exception {
        List<Components> components = new LinkedList<>(componentsRepository.findAll());
        if (components.isEmpty()) {
            return null;
        }
        return components;
    }

    public Components findById(Integer id) throws Exception {
        if (componentsRepository.findById(id).isPresent()) {
            return componentsRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Components entity) throws Exception {
        if (entity != null) {
            componentsRepository.save(entity);
        }
    }

    @Transactional
    public void update(Components entity) throws Exception {
        componentsRepository.findById(entity.getId())
                .map(oldEntity -> {
                    oldEntity.setName(entity.getName());
                    oldEntity.setProperties(entity.getProperties());
                    oldEntity.setContents(entity.getContents());
                    return componentsRepository.save(oldEntity);
                })
                .orElseGet(() -> componentsRepository.save(entity));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (componentsRepository.findById(id).isPresent()) {
            componentsRepository.deleteById(id);
        }
    }
}
