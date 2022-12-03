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

    List<DonDatHang> findAll();

    void txnhandon(Long mataixe,Long madonhang);

    void txlaydon(Long mataixe,Long madonhang);

    void txgiaothanhcong(Long mataixe,Long madonhang);

    List<DonDatHang> findByMaTaiXe(Long mataixe);

    List<Float> thongke(Long mataixe, Integer nam);

    List<Float> thongketongtien(int nam);

    List<Float> thongkesoluong(int nam);

    void doitacxacnhandon(String trangthai, Long madonhang);

}
