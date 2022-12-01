package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.dto.DoiTacDto;
import com.hqtcsdl.foodorder.dto.MonDto;
import com.hqtcsdl.foodorder.entity.ChiNhanh;
import com.hqtcsdl.foodorder.entity.DoiTac;
import com.hqtcsdl.foodorder.entity.Mon;

import java.util.List;

public interface DoiTacService {
    List<DoiTac> findAll();

    DoiTac save(DoiTac doiTac);

    List<Mon> findMenu(Integer madoitac);

    DoiTac findByMaDoiTac(Long madoitac);

    Void changeInfor(DoiTacDto dto);

}
