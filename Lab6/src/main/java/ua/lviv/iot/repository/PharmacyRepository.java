package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Pharmacy;

@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {
}
