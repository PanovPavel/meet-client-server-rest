package org.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
@Data
public class Location {
    @Id
    @Column
    private int id;
    @Column
    private String name;
}
