package com.hqtcsdl.foodorder.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "dondathang")
@Data
public class DonDatHang implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "madondathang")
    private Long madondathang;

    @Column(name = "ngaylap")
    private Timestamp ngaylap;

    @Column(name = "sdtkhachhang")
    private String sdtkhachhang;

    @Column(name = "diachigiaohang")
    private String diachigiaohang;

    @Column(name = "trangthai")
    private String trangthai;

    @Column(name = "tongsoluong")
    private Integer tongsoluong;

    @Column(name = "phigiaohang")
    private Double phigiaohang;

    @Column(name = "thanhtien")
    private Double thanhtien;

    @Column(name = "tuychon")
    private String tuychon;

    @Column(name = "makhachhang")
    private Long makhachhang;

    @Column(name = "tenkhachhang")
    private String tenkhachhang;

    @Column(name = "mataixe")
    private Long mataixe;

    @Column(name = "tentaixe")
    private String tentaixe;

    @Column(name = "madoitac")
    private Long madoitac;

    @Column(name = "diachichinhanh")
    private String diachichinhanh;

    @Column(name = "tenchinhanh")
    private String tenchinhanh;

}
