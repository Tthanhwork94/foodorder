package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.repository.HopDongChiTietRepo;
import com.hqtcsdl.foodorder.service.HopDongChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class HopDongChiTietServiceImpl implements HopDongChiTietService {

    @Autowired
    private HopDongChiTietRepo repo;

    @Override
    @Transactional(rollbackOn = {Exception.class, Error.class})
    public void insertHopDongChiTiet(Long mahopdong, Long machinhanh) {
        repo.insertHopDongChiTiet(mahopdong,machinhanh);
    }
}
