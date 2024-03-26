package com.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 6775413735010778867L;

    private Long id;
    private Long userId;
    private Long roleId;
    private boolean active;
    
}
