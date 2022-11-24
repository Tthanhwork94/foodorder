package com.hqtcsdl.foodorder.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "taikhoan")
@Data
public class TaiKhoan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mataikhoan")
    private Long mataikhoan;

    @Column(name = "tendangnhap")
    private String tendangnhap;

    @Column(name = "matkhau")
    private String matkhau;

    @Column(name = "loaitaikhoan")
    private String loaitaikhoan;

    @Column(name = "trangthai")
    private String trangthai;
}
