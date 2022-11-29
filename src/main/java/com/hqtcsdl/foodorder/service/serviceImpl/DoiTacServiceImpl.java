package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.MonDto;
import com.hqtcsdl.foodorder.entity.ChiNhanh;
import com.hqtcsdl.foodorder.entity.DoiTac;
import com.hqtcsdl.foodorder.entity.Mon;
import com.hqtcsdl.foodorder.repository.DoiTacRepo;
import com.hqtcsdl.foodorder.repository.MonRepo;
import com.hqtcsdl.foodorder.service.DoiTacService;
import com.hqtcsdl.foodorder.service.MonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoiTacServiceImpl implements DoiTacService {

    @Autowired
    private DoiTacRepo repo;

    @Autowired
    private MonService monService;


    @Override
    public List<DoiTac> findAll() {
        return repo.findAll();
    }

    @Override
    public DoiTac save(DoiTac doiTac) {
        return repo.save(doiTac);
    }

    @Override
    public List<Mon> findMenu(Integer madoitac) {
        return monService.findMenu(madoitac);
    }

    @Override
    public DoiTac findByMaDoiTac(Long madoitac) {
        return repo.findByMadoitac(madoitac);
    }




}
