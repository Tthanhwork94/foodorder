package com.hqtcsdl.foodorder.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dondathangchitiet")
@Data
@IdClass(DonDatHangChiTiet.class)
public class DonDatHangChiTiet implements Serializable {

    @Id
    @Column(name = "madondathang")
    private Long madondathang;

    @Id
    @Column(name = "mamon")
    private Long mamon;

//    @ManyToOne
//    @JoinColumn(name = "madondathang",columnDefinition = "BINARY(8)",insertable = false, updatable = false)
//    private DonDatHang dondathang;
//
//    @ManyToOne
//    @JoinColumn(name = "mamon",columnDefinition = "BINARY(8)",insertable = false, updatable = false)
//    private Mon mon;
    @Transient
    private String tenmon;

    @Column(name = "soluong")
    private Integer soluong;

    @Column(name = "dongia")
    private Double dongia;

}
