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

    @Column(name = "phigiaohang")
    private Double phigiaohang;

    @Column(name = "thanhtien")
    private Double thanhtien;

    @ManyToOne
    @JoinColumn(name = "makhachhang",referencedColumnName = "makhachhang")
    private KhachHang khachhang;

    @ManyToOne
    @JoinColumn(name = "machinhanh",referencedColumnName = "machinhanh")
    private ChiNhanh chinhanh;

    @ManyToOne
    @JoinColumn(name = "mataixe",referencedColumnName = "mataixe")
    private TaiXe taixe;

}
