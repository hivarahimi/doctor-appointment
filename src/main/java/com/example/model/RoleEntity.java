package com.example.model;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class RoleEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 5944412245721325182L;

    private Long id;
    private String name;
    private Integer code;
}
