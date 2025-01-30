package com.doctorservice.service.impl;


import com.doctorservice.entity.DoctorEntity;
import com.doctorservice.repository.IDoctorRepository;
import com.doctorservice.service.IDoctorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class DoctorServiceImpl implements IDoctorService {
    @Autowired
    private IDoctorRepository doctorRepository;

    @Override
    public DoctorEntity registerDoctor(DoctorEntity doctorEntity) {
        return doctorRepository.save(doctorEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DoctorEntity> getAllDoctors() {
        return doctorRepository.findAll();
    }


    @Override
    @Cacheable(value="Doctor", key="#doctorId")
    @Transactional(readOnly = true)
    public DoctorEntity getOneDoctor(Long doctorId) {
        log.info("Doctor Data Coming From DB Doctor_ID: "+doctorId);
        return doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor id not found " + doctorId));
    }

    @Override
    @Transactional
    @CachePut(value="Doctor", key="#doctorEntity.getDoctorId()")
    public DoctorEntity updateDoctorData(DoctorEntity doctorEntity) {
        return doctorRepository.findById(doctorEntity.getDoctorId())
                .map(repo->doctorRepository.save(doctorEntity))
                .orElseThrow(()->new RuntimeException("Doctor Id Not present "+doctorEntity.getDoctorId()))

                ;
    }
}
