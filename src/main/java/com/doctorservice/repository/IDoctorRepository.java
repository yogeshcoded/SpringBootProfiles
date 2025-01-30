package com.doctorservice.repository;

import com.doctorservice.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepository extends JpaRepository<DoctorEntity,Long> {
}
