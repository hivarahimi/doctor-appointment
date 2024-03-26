package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "DOCTOR")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DoctorEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 5801039601942163060L;

    private static final String DOCTOR_ENTITY_GENERATOR = "doctor_entity_generator";
    private static final String DOCTOR_SEQUENCE = "doctor_sequence";

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = DOCTOR_ENTITY_GENERATOR)
    @SequenceGenerator(name = DOCTOR_ENTITY_GENERATOR, sequenceName = DOCTOR_SEQUENCE, allocationSize = 1)
    private Long id;

    @Column(name = "SPECIALIZE", length = 20)
    private String specialize;
    @Column(name = "EMAIL", length = 20)
    private String email;
    @Column(name = "ADDRESS", length = 250)
    private String address;
    @Column(name = "DESCRIPTION", length = 250)
    private String description;

    @OneToMany(mappedBy = "appointments", fetch = FetchType.LAZY)
    private Set<AppointmentEntity> appointments = new HashSet<>();


}
