package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Pharmacy;
import ua.lviv.iot.repository.PharmacyRepository;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class PharmacyService {
    @Autowired
    PharmacyRepository pharmacyRepository;

    public List<Pharmacy> findAll() throws Exception {
        List<Pharmacy> pharmacy = new LinkedList<>(pharmacyRepository.findAll());
        if (pharmacy.isEmpty()) {
            return null;
        }
        return pharmacy;
    }

    public Pharmacy findById(Integer id) throws Exception {
        if (pharmacyRepository.findById(id).isPresent()) {
            return pharmacyRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Pharmacy entity) throws Exception {
        if (entity != null) {
            pharmacyRepository.save(entity);
        }
    }

    @Transactional
    public void update(Pharmacy entity) throws Exception {
        pharmacyRepository.findById(entity.getId())
                .map(oldEntity -> {
                    oldEntity.setName(entity.getName());
                    oldEntity.setLocation(entity.getLocation());
                    oldEntity.setPopularity(entity.getPopularity());
                    oldEntity.setProducts(entity.getProducts());
                    oldEntity.setChain(entity.getChain());
                    return pharmacyRepository.save(oldEntity);
                })
                .orElseGet(() -> pharmacyRepository.save(entity));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (pharmacyRepository.findById(id).isPresent()) {
            pharmacyRepository.deleteById(id);
        }
    }
}
