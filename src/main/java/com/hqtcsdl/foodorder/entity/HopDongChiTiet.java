package com.hqtcsdl.foodorder.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hopdongchitiet")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(HopDongChiTiet.class)
public class HopDongChiTiet implements Serializable {

    @Id
    @Column(name = "mahopdong")
    private Long mahopdong;

    @Id
    @Column(name = "machinhanh")
    private Long machinhanh;

//    @ManyToOne
//    @JoinColumn(name = "mahopdong")
//    private HopDong hopdong;
//
//    @ManyToOne
//    @JoinColumn(name = "machinhanh")
//    private ChiNhanh chinhanh;
}
