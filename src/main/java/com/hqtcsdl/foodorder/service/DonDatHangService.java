package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.entity.DonDatHang;

import java.util.List;

public interface DonDatHangService {

    List<DonDatHang> findDonDatHangByMaDoiTac(Long madoitac);
}
