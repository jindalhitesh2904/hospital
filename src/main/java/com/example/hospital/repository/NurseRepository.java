package com.example.hospital.repository;

import com.example.hospital.model.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<Nurse,Long> {
    Nurse findByEmail(String email);
}
