package com.example.demo.repositories;

import com.example.demo.models.BusModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<BusModel, Long> {
}
