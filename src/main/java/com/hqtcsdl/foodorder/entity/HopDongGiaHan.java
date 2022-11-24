package com.hqtcsdl.foodorder.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "hopdonggiahan")
@Data
public class HopDongGiaHan implements Serializable {

    @Id
    @Column(name = "mahopdong")
    private Long mahopdong;

    @ManyToOne
    @JoinColumn(name = "mahopdong",referencedColumnName = "mahopdong")
    private HopDong hopdong;

    @Column(name = "phihoahong")
    private Integer phihoahong;

    @Column(name = "thoigianhieuluc")
    private Integer thoigianhieuluc;

    @Id
    @Column(name = "ngaygiahan")
    private Timestamp ngaygiahan;
}
