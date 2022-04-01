package org.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organizer")
@Data
public class Organizer {
    @Id
    @Column
    private int id;

    @Column
    private String user;

    @Column
    private String password;


}
