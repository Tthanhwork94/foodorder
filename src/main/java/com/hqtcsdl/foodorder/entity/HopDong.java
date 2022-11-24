package com.hqtcsdl.foodorder.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "hopdong")
@Data
public class HopDong implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahopdong")
    private Long mahopdong;

    @CreationTimestamp
    @Column(name = "ngaylap")
    private Timestamp ngaylap;

    @Column(name = "sotaikhoan")
    private String sotaikhoan;

    @Column(name = "nganhang")
    private String nganhang;

    @Column(name = "trangthai")
    private String trangthai;

    @ManyToOne
    @JoinColumn(name = "madoitac",referencedColumnName = "madoitac")
    private DoiTac doitac;

    @ManyToOne
    @JoinColumn(name = "manhanvien",referencedColumnName = "manhanvien",nullable = true)
    private NhanVien nhanvien;
}
