package com.hqtcsdl.foodorder.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonHangChiTietDto {
    private Long madondathang;
    private Long mamon;
    private Integer soluong;
    private Float gia;
}
