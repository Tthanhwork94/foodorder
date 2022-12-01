package com.hqtcsdl.foodorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonHangDto {
    private Long madondathang;
    private Timestamp ngaylap;
    private String sdtkhachhang;
    private String diachigiaohang;
    private String trangthai;
    private Integer tongsoluong;
    private Float phigiaohang;
    private Float thanhtien;
    private Long makhachhang;
    private Long machinhanh;
    private Long mataixe;
    private String tuychon;
}
