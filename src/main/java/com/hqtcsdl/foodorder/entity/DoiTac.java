package com.hqtcsdl.foodorder.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "doitac")
@Data
public class DoiTac implements Serializable {

    @Id
    @Column(name = "madoitac")
    private Long madoitac;

    @OneToOne
    @JoinColumn(name="madoitac",referencedColumnName = "mataikhoan")
    private TaiKhoan taikhoan;

    @Column(name = "email")
    private String email;

    @Column(name = "tenquan")
    private String tenquan;

    @Column(name = "nguoidaidien")
    private String nguoidaidien;

    @Column(name = "slchinhanh")
    private Integer slchinhanh;

    @Column(name = "donhangdukien")
    private Integer donhangdukien;

    @Column(name = "loaiamthuc")
    private String loaiamthuc;

    @Column(name = "diachichinhanh")
    private String diachichinhanh;

    @Column(name = "sdt")
    private String sdt;
}
