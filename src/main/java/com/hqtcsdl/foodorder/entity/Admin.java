package com.hqtcsdl.foodorder.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "admin")
@Data
public class Admin implements Serializable {

    @Id
    @Column(name = "maad")
    private Long maad;

    @OneToOne
    @JoinColumn(name="maad",referencedColumnName = "mataikhoan")
    private TaiKhoan taiKhoan;

    @Column(name = "hoten")
    private String hoten;
}
