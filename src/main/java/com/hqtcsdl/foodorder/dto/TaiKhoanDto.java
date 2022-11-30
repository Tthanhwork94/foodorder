package com.hqtcsdl.foodorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaiKhoanDto {
    private Long mataikhoan;
    private String tendangnhap;
    private String matkhaucu;
    private String matkhaumoi;
}
