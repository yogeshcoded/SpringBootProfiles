package com.doctorservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Specialization implements Serializable {

    private static final long serialVersionUID = -248149750704505493L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long specializationId;
    private String specializationName;
    private String description;
}
