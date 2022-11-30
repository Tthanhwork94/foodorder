package com.hqtcsdl.foodorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoiTacDto {
    private Long madoitac;
    private String email;
    private String tenquan;
    private String nguoidaidien;
    private Integer soluongchinhanh;
    private Integer donhangdukien;
    private String loaiamthuc;
    private String diachikinhdoanh;
}
