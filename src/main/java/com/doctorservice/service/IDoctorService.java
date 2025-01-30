package com.doctorservice.service;


import com.doctorservice.entity.DoctorEntity;

import java.util.List;

public interface IDoctorService {
    DoctorEntity registerDoctor(DoctorEntity doctorEntity);
    List<DoctorEntity> getAllDoctors();
    DoctorEntity getOneDoctor(Long doctorId);
    DoctorEntity updateDoctorData(DoctorEntity doctorEntity);
}
