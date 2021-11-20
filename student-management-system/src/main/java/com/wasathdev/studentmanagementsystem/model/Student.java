package com.wasathdev.studentmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    Long id;
    String first_name;
    String last_name;
    String email;
}
