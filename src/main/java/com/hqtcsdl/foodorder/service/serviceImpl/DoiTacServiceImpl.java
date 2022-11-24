package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.entity.DoiTac;
import com.hqtcsdl.foodorder.repository.DoiTacRepo;
import com.hqtcsdl.foodorder.service.DoiTacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoiTacServiceImpl implements DoiTacService {

    @Autowired
    private DoiTacRepo repo;

    @Override
    public List<DoiTac> findAll() {
        return repo.findAll();
    }
}
