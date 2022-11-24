package com.hqtcsdl.foodorder.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mon")
@Data
public class Mon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mamon;

    @Column(name = "tenmon")
    private String tenmon;

    @Column(name = "mieuta")
    private String mieuta;

    @Column(name = "gia")
    private Double gia;

    @Column(name = "tinhtrang")
    private String tinhtrang;

    @ManyToOne
    @JoinColumn(name = "madoitac", referencedColumnName = "madoitac")
    private DoiTac doitac;
}
