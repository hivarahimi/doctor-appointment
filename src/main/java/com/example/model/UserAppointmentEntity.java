package com.example.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "USER_APPOINTMENT")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserAppointmentEntity extends BaseEntity implements Serializable {


    private static final String USER_APPOINTMENT_ENTITY_GENERATOR = "user_appointment_entity_generator";
    private static final String USER_APPOINTMENT_SEQUENCE = "user_appointment_sequence";

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = USER_APPOINTMENT_ENTITY_GENERATOR)
    @SequenceGenerator(name = USER_APPOINTMENT_ENTITY_GENERATOR, sequenceName = USER_APPOINTMENT_SEQUENCE,  allocationSize = 1)
    private Long id;

    private boolean isOnline;
    private boolean isPayed;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserEntity user;

}
