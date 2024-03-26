package com.example.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USER_ENTITY")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class UserEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -5642316864869647346L;

    private static final String USER_ENTITY_GENERATOR = "user_entity_generator";
    private static final String USER_SEQUENCE = "user_sequence";

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = USER_ENTITY_GENERATOR)
    @SequenceGenerator(name = USER_ENTITY_GENERATOR, sequenceName = USER_SEQUENCE, initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NAME", length = 20)
    private String name;
    @Column(name = "FAMILY", length = 50)
    private String family;
    @Column(name = "PHONE", length = 20)
    private String phone;
    @Column(name = "USERNAME", length = 20)
    private String username;
    @Column(name = "PASSWORD", length = 20)
    private String password;

    @OneToMany(mappedBy="appointments",fetch = FetchType.LAZY)
    private Set<UserAppointmentEntity> appointments = new HashSet<>();
}
