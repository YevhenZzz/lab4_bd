package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Chain;

@Repository
public interface ChainRepository extends JpaRepository<Chain, Integer> {
}
