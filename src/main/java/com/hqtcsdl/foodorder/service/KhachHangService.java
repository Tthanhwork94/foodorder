package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.dto.KhachHangDto;
import com.hqtcsdl.foodorder.entity.KhachHang;

import java.util.List;

public interface KhachHangService {
    List<KhachHang> findAll();

    KhachHang save(KhachHang khachHang);

    KhachHang findByMaKhachHang(Long makhachhang);

    void updateInfor(KhachHangDto dto);
}
