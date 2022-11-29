package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.entity.KhachHang;
import com.hqtcsdl.foodorder.repository.KhachHangRepo;
import com.hqtcsdl.foodorder.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
