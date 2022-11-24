package com.hqtcsdl.foodorder.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "taixe")
@Data
public class TaiXe implements Serializable {

    @Id
    @Column(name = "mataixe")
    private Long mataixe;

    @OneToOne
    @JoinColumn(name = "mataixe",referencedColumnName = "mataikhoan")
    private TaiKhoan taikhoan;

    @Column(name = "hoten")
    private String hoten;

    @Column(name = "cmnd")
    private String cmnd;

    @Column(name = "sodienthoai")
    private String sodienthoai;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "biensoxe")
    private String biensoxe;

    @Column(name = "khuvuchoatdong")
    private String khuvuchoatdong;

    @Column(name = "email")
    private String email;

    @Column(name = "sotaikhoan")
    private String sotaikhoan;

}
