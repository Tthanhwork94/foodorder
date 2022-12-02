package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.KhachHangDto;
import com.hqtcsdl.foodorder.entity.KhachHang;
import com.hqtcsdl.foodorder.repository.KhachHangRepo;
import com.hqtcsdl.foodorder.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    private KhachHangRepo repo;

    @Override
    public List<KhachHang> findAll() {
        return repo.findAll();
    }

    @Override
    public KhachHang save(KhachHang khachHang) {
        return repo.save(khachHang);
    }

    @Override
    public KhachHang findByMaKhachHang(Long makhachhang) {
        return repo.findByMakhachhang(makhachhang);
    }

    @Override
    @Transactional(rollbackOn = {Error.class, Exception.class})
    public void updateInfor(KhachHangDto dto) {
        repo.updateInfor(dto.getHoten(), dto.getSodienthoai(), dto.getDiachi(), dto.getEmail(), dto.getMakhachhang());
    }
}
