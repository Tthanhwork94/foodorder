package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.entity.Admin;
import com.hqtcsdl.foodorder.repository.AdminRepo;
import com.hqtcsdl.foodorder.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo repo;

    @Override
    public List<Admin> findAll() {
        return repo.findAll();
    }
}
