package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.dto.HopDongDto;
import com.hqtcsdl.foodorder.entity.HopDong;

import java.util.List;

public interface HopDongService {

    List<HopDong> findHopDongByMaDoiTac(Long madoitac);

    Long insertHopDong(HopDongDto dto);

    List<HopDong> findAll();

    void settranthai(String trangthai,Long mahopdong,Long manhanvien);
}
