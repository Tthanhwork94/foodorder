package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.entity.KhachHang;
import com.hqtcsdl.foodorder.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/khachhang")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("")
    public List<KhachHang> getAll(){
        return khachHangService.findAll();
    }
}
