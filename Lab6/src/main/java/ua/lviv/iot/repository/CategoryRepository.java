package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
