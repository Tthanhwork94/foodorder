package com.hqtcsdl.foodorder.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chinhanh")
@Data
public class ChiNhanh implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "machinhanh")
    private Long machinhanh;

    @Column(name = "tenchinhanh")
    private String tenchinhanh;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "giomocua")
    private Integer giomocua;

    @Column(name = "giodongcua")
    private Integer giodongcua;

    @Column(name = "tinhtrang")
    private String tinhtrang;

    @ManyToOne
    @JoinColumn(name = "madoitac", referencedColumnName = "madoitac")
    private DoiTac doitac;


}
