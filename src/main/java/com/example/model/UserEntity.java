package com.example.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -5642316864869647346L;

    private Long id;
    private String name;
    private String family;
    private String phone;
    private String username;
    private String password;
    private Set<AppointmentEntity> appointments = new HashSet<>();
}
