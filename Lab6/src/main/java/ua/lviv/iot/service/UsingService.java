package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Using;
import ua.lviv.iot.repository.UsingRepository;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class UsingService {
    @Autowired
    UsingRepository usingRepository;

    public List<Using> findAll() throws Exception {
        List<Using> using = new LinkedList<>(usingRepository.findAll());
        if (using.isEmpty()) {
            return null;
        }
        return using;
    }

    public Using findById(Integer id) throws Exception {
        if (usingRepository.findById(id).isPresent()) {
            return usingRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Using entity) throws Exception {
        if (entity != null) {
            usingRepository.save(entity);
        }
    }

    @Transactional
    public void update(Using entity) throws Exception {
        usingRepository.findById(entity.getId())
                .map(oldEntity -> {
                    oldEntity.setName(entity.getName());
                    oldEntity.setType_of_using(entity.getType_of_using());
                    oldEntity.setNumber(entity.getNumber());
                    oldEntity.setTime(entity.getTime());
                    oldEntity.setUsingcol(entity.getUsingcol());
                    oldEntity.setContrainidation(entity.getContrainidation());
                    return usingRepository.save(oldEntity);
                })
                .orElseGet(() -> usingRepository.save(entity));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (usingRepository.findById(id).isPresent()) {
            usingRepository.deleteById(id);
        }
    }
}
