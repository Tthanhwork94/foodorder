package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.MonDto;
import com.hqtcsdl.foodorder.entity.Mon;
import com.hqtcsdl.foodorder.repository.MonRepo;
import com.hqtcsdl.foodorder.service.DoiTacService;
import com.hqtcsdl.foodorder.service.MonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonServiceImpl implements MonService {
    @Autowired
    private MonRepo repo;

    @Override
    public List<Mon> findMenu(Integer madoitac) {
        return repo.findMenu(madoitac);
    }


}
