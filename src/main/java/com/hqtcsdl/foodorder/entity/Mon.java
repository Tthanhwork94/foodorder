package com.hqtcsdl.foodorder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mon")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mamon")
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
