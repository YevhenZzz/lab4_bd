package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Components;

@Repository
public interface ComponentsRepository extends JpaRepository<Components, Integer> {
}
