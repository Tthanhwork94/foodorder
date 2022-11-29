package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.entity.NhanVien;
import com.hqtcsdl.foodorder.repository.NhanVienRepo;
import com.hqtcsdl.foodorder.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepo repo;



    @Override
    public List<NhanVien> findALl() {
        return repo.findAll();
    }
}
