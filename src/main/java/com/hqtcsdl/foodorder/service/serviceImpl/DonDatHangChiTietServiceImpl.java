package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.DonHangChiTietDto;
import com.hqtcsdl.foodorder.entity.DonDatHangChiTiet;
import com.hqtcsdl.foodorder.repository.DonDatHangChiTietRepo;
import com.hqtcsdl.foodorder.service.DonDatHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DonDatHangChiTietServiceImpl implements DonDatHangChiTietService {

    @Autowired
    private DonDatHangChiTietRepo repo;


    @Override
    public List<DonDatHangChiTiet> findByMaDonHang(Long madonhang) {
        return repo.findByMaDonHang(madonhang);
    }

    @Override
    @Transactional(rollbackOn = {Exception.class, Error.class})
    public void insertDonHangChiTiet(DonHangChiTietDto dto) {
        repo.insertDonHangChiTiet(dto.getMadondathang(),dto.getMamon(),dto.getSoluong());
    }
}
