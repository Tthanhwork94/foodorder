package com.hqtcsdl.foodorder.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dondathangchitiet")
@Data
public class DonDatHangChiTiet implements Serializable {

    @Id
    @Column(name = "madondathang")
    private Long madondathang;

    @Id
    @Column(name = "mamon")
    private Long mamon;

    @ManyToOne
    @JoinColumn(name = "madondathang", referencedColumnName = "madondathang")
    private DonDatHang dondathang;

    @ManyToOne
    @JoinColumn(name = "mamon", referencedColumnName = "mamon")
    private Mon mon;

    @Column(name = "soluong")
    private Integer soluong;

    @Column(name = "dongia")
    private Double dongia;

    @Column(name = "tuychon")
    private String tuychon;
}
