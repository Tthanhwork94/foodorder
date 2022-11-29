package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.entity.HopDong;

import java.util.List;

public interface HopDongService {

    List<HopDong> findHopDongByMaDoiTac(Long madoitac);
}
