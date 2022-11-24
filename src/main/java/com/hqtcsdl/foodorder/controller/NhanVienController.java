package com.hqtcsdl.foodorder.controller;


import com.hqtcsdl.foodorder.entity.NhanVien;
import com.hqtcsdl.foodorder.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nhanvien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("")
    public List<NhanVien> getAll(){
        return nhanVienService.findALl();
    }
}
