package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.dto.TaiXeDto;
import com.hqtcsdl.foodorder.entity.TaiXe;

import java.util.List;

public interface TaiXeService {
    List<TaiXe> findAll();

    TaiXe save(TaiXe taiXe);

    void updateinfor(TaiXeDto dto);

    TaiXe findByMaTaiXe(Long mataixe);



}
