package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Using;

@Repository
public interface UsingRepository extends JpaRepository<Using, Integer> {
}
