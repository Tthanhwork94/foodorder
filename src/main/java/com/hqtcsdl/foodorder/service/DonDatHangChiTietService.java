package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.entity.DonDatHangChiTiet;

import java.util.List;

public interface DonDatHangChiTietService {
    List<DonDatHangChiTiet> findByMaDonHang(Long madonhang);
}
