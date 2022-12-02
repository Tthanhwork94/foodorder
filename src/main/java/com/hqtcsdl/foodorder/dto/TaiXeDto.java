package com.hqtcsdl.foodorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaiXeDto {
    private Long mataixe;
    private String hoten;
    private String cmnd;
    private String sodienthoai;
    private String diachi;
    private String biensoxe;
    private String khuvuchoatdong;
    private String email;
    private String sotaikhoan;
}
