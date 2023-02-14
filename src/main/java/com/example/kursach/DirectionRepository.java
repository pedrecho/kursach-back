package com.example.kursach;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface DirectionRepository extends JpaRepository<Direction, Long> {
    @Query("SELECT p FROM Direction p WHERE CONCAT(p.name, ' ', p.description) LIKE %?1%")
    List<Direction> search(String keyword);
}