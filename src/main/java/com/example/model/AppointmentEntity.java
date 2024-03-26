package com.example.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "APPOINTMENT")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class AppointmentEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 8670690323718875356L;

    private static final String APPOINTMENT_ENTITY_GENERATOR = "appointment_entity_generator";
    private static final String APPOINTMENT_SEQUENCE = "appointment_sequence";

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = APPOINTMENT_ENTITY_GENERATOR)
    @SequenceGenerator(name = APPOINTMENT_ENTITY_GENERATOR, sequenceName = APPOINTMENT_SEQUENCE, initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NAME", length = 20)
    private Date day;
    @Column(name = "NAME", length = 20)
    private LocalTime start;
    @Column(name = "NAME", length = 20)
    private LocalTime end;
    @Enumerated(EnumType.ORDINAL)
    private AppointmentStatus status;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID")
    private DoctorEntity doctor;




    public enum AppointmentStatus {
        open,
        booked,
        canceled,
        deleted;

    }

}
