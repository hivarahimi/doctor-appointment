package com.example.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class AppointmentEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 8670690323718875356L;

    private Date day;
    private LocalTime start;
    private LocalTime end;
    private AppointmentStatus status;
    private DoctorEntity doctor;
    private UserEntity user;

    public enum AppointmentStatus {
        open,
        booked,
        canceled,
        deleted;

    }

}
