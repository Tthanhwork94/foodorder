package com.hqtcsdl.foodorder.service.serviceImpl;


import com.hqtcsdl.foodorder.entity.TaiKhoan;
import com.hqtcsdl.foodorder.repository.TaiKhoanRepo;
import com.hqtcsdl.foodorder.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {

    @Autowired
    private TaiKhoanRepo repo;

    @Override
    public List<TaiKhoan> findAll() {
        return repo.findAll();
    }
}
