package com.castilb.todoapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "list")
public class List {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private boolean state;
    private Date createAt;
    private Date updateAt;
    @ManyToOne
    private Proyect proyect;
}
