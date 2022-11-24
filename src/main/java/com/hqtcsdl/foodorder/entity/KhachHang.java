package com.hqtcsdl.foodorder.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "khachhang")
@Data
public class KhachHang implements Serializable {

    @Id
    @Column(name = "makhachhang")
    private Long makhachhang;

    @OneToOne
    @JoinColumn(name = "makhachhang", referencedColumnName = "mataikhoan")
    private TaiKhoan taikhoan;

    @Column(name = "hoten")
    private String hoten;

    @Column(name = "sodienthoai")
    private String sodienthoai;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "email")
    private String email;
}
