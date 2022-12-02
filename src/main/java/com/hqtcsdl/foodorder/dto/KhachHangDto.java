package com.hqtcsdl.foodorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhachHangDto {
    private Long makhachhang;
    private String hoten;
    private String sodienthoai;
    private String diachi;
    private String email;
}
