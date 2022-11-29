package com.hqtcsdl.foodorder.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HopDongDto {
    private Long mahopdong;
    private Timestamp ngaylap;
    private Integer sochinhanhdk;
    private String sotaikhoan;
    private String nganhang;
    private String trangthai;
    private Long madoitac;
    private Long manhanvien;
}
