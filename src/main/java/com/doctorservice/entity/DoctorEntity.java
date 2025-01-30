package com.doctorservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Data
@Entity

public class DoctorEntity implements Serializable {

    private static final long serialVersionUID = -12087825791928114L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long doctorId;
    private String doctorName;
    private String email;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SPECIALIZATION_ID")
    private Specialization specialization;

}
