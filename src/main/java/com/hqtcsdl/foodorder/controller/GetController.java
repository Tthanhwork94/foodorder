package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.entity.DonDatHang;
import com.hqtcsdl.foodorder.service.DonDatHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GetController {

    @Autowired
    private DonDatHangService donDatHangService;

    @GetMapping("/donhang")
    public List<DonDatHang> getAllDonHang(){
        return donDatHangService.findAll();
    }
}
