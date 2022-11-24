package com.hqtcsdl.foodorder.entity;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hopdongchitiet")
@Data
public class HopDongChiTiet implements Serializable {

    @Id
    @Column(name = "mahopdong")
    private Long mahopdong;

    @Id
    @Column(name = "machinhanh")
    private Long machinhanh;

    @ManyToOne
    @JoinColumn(name = "mahopdong",referencedColumnName = "mahopdong")
    private HopDong hopdong;

    @ManyToOne
    @JoinColumn(name = "machinhanh",referencedColumnName = "machinhanh")
    private ChiNhanh chinhanh;
}
