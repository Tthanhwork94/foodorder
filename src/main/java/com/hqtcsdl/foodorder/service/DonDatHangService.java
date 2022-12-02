package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.dto.DonHangChiTietDto;
import com.hqtcsdl.foodorder.dto.DonHangDto;
import com.hqtcsdl.foodorder.entity.DonDatHang;

import java.util.List;

public interface DonDatHangService {

    List<DonDatHang> findDonDatHangByMaDoiTac(Long madoitac);

    Integer insertDonHang(DonHangDto dto);

    List<DonDatHang> findDonHangByMaKhachHang(Long makhachhang);

    Integer huydonhang(Long madonhang);

}
