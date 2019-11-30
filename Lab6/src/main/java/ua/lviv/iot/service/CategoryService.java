package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.model.Category;
import ua.lviv.iot.repository.CategoryRepository;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll() throws Exception {
        List<Category> category = new LinkedList<>(categoryRepository.findAll());
        if (category.isEmpty()) {
            return null;
        }
        return category;
    }

    public Category findById(Integer id) throws Exception {
        if (categoryRepository.findById(id).isPresent()) {
            return categoryRepository.findById(id).get();
        }
        return null;
    }

    @Transactional
    public void create(Category entity) throws Exception {
        if (entity != null) {
            categoryRepository.save(entity);
        }
    }

    @Transactional
    public void update(Category entity) throws Exception {
        categoryRepository.findById(entity.getId())
                .map(oldEntity -> {
                    oldEntity.setName(entity.getName());
                    oldEntity.setType(entity.getType());
                    oldEntity.setQuantity(entity.getQuantity());
                    return categoryRepository.save(oldEntity);
                })
                .orElseGet(() -> categoryRepository.save(entity));
    }

    @Transactional
    public void delete(Integer id) throws Exception {
        if (categoryRepository.findById(id).isPresent()) {
            categoryRepository.deleteById(id);
        }
    }
}
