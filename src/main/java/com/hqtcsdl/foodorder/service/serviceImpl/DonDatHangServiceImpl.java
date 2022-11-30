package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.entity.DonDatHang;
import com.hqtcsdl.foodorder.repository.DonHangRepo;
import com.hqtcsdl.foodorder.service.DonDatHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonDatHangServiceImpl implements DonDatHangService {

    @Autowired
    private DonHangRepo repo;


    @Override
    public List<DonDatHang> findDonDatHangByMaDoiTac(Long madoitac) {
        return repo.findDonDatHangByMaDoiTac(madoitac);
    }
}
