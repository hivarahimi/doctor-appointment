package com.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@MappedSuperclass
@Data
public abstract class BaseEntity {

    @Column(name = "REGISTER_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    private Date registerDate;
    @Column(name = "UPDATE_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    private Date updateDate;

    @PrePersist
    public void onPrePersist() {
        registerDate = new Date();
    }

    @PreUpdate
    public void onPreUpdate() {
        updateDate = new Date();
    }

}

