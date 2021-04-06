package com.example.demo.api.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rid;
    @Column(length = 100, nullable = false, unique = true)
    private String rname;
    @Column(length = 1000)
    private String rdetail;
    @Column(length = 50, nullable = false)
    private String rhours_operation;
    @Column(nullable = false)
    private float rrating;
    @Column(length = 50, nullable = false)
    private String rlocation;

}