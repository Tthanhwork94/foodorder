package com.hqtcsdl.foodorder.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "nhanvien")
@Data
public class NhanVien implements Serializable {

    @Id
    @Column(name = "manhanvien")
    private Long manhanvien;

    @OneToOne
    @JoinColumn(name="manhanvien",referencedColumnName = "mataikhoan")
    private TaiKhoan taikhoan;

    @Column(name = "hoten")
    private String hoten;
}
