package com.doctorservice.controller;


import com.doctorservice.entity.DoctorEntity;
import com.doctorservice.service.IDoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DoctorController {

    private final IDoctorService doctorService;

    @PostMapping("/add")
    public DoctorEntity doctorRegistration(@RequestBody DoctorEntity doctorEntity) {
        return doctorService.registerDoctor(doctorEntity);

    }

    @GetMapping("/all")
    public List<DoctorEntity> getAllDoctors() {
        return doctorService.getAllDoctors();

    }

    @GetMapping("/{doctorId}")
    public ResponseEntity<DoctorEntity> getDoctorByID(@PathVariable Long doctorId) {
        return new ResponseEntity<>(doctorService.getOneDoctor(doctorId),HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<DoctorEntity> modifyDoctor(@RequestBody DoctorEntity doctorEntity) {
        return new ResponseEntity<>(doctorService.updateDoctorData(doctorEntity),HttpStatus.OK);
    }
}
