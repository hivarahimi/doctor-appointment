package com.example.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Data
public class DoctorEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 5801039601942163060L;

    private String specialize;
    private String email;
    private String address;
    private String description;
    private Set<AppointmentEntity> appointments;


}
