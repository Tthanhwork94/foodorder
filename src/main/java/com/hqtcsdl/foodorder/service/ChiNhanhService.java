package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.dto.ChinhanhDto;
import com.hqtcsdl.foodorder.entity.ChiNhanh;

import java.util.List;

public interface ChiNhanhService {
    List<ChiNhanh> findChiNhanhByMaDoiTac(Long madoitac);

    ChiNhanh findChiNhanhByMachinhanh(Long machinhanh);

    ChinhanhDto updateChinhanh(ChinhanhDto dto);

    ChinhanhDto insertChinhanh(ChinhanhDto dto);
}
