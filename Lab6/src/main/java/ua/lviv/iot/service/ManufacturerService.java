package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Manufacturer;
import ua.lviv.iot.repository.ManufacturerRepository;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class ManufacturerService {
    @Autowired
    ManufacturerRepository manufacturerRepository;

    public List<Manufacturer> findAll() throws Exception {
        List<Manufacturer> manufacturer = new LinkedList<>(manufacturerRepository.findAll());
        if (manufacturer.isEmpty()) {
            return null;
        }
        return manufacturer;
    }

    public Manufacturer findById(Integer id) throws Exception {
        if (manufacturerRepository.findById(id).isPresent()) {
            return manufacturerRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Manufacturer entity) throws Exception {
        if (entity != null) {
            manufacturerRepository.save(entity);
        }
    }

    @Transactional
    public void update(Manufacturer entity) throws Exception {
        manufacturerRepository.findById(entity.getId())
                .map(oldEntity -> {
                    oldEntity.setCountry(entity.getCountry());
                    oldEntity.setType_of_drugs(entity.getType_of_drugs());
                    oldEntity.setSafety(entity.getSafety());
                    oldEntity.setStock(entity.getStock());
                    return manufacturerRepository.save(oldEntity);
                })
                .orElseGet(() -> manufacturerRepository.save(entity));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (manufacturerRepository.findById(id).isPresent()) {
            manufacturerRepository.deleteById(id);
        }
    }
}
