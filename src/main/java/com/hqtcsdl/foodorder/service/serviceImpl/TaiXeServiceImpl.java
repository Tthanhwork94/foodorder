package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.entity.TaiKhoan;
import com.hqtcsdl.foodorder.entity.TaiXe;
import com.hqtcsdl.foodorder.repository.TaiKhoanRepo;
import com.hqtcsdl.foodorder.repository.TaiXeRepo;
import com.hqtcsdl.foodorder.service.TaiKhoanService;
import com.hqtcsdl.foodorder.service.TaiXeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiXeServiceImpl implements TaiXeService {

    @Autowired
    private TaiXeRepo repo;

    @Override
    public List<TaiXe> findAll() {
        return repo.findAll();
    }

    @Override
    public TaiXe save(TaiXe taiXe) {
        return repo.save(taiXe);
    }
}
