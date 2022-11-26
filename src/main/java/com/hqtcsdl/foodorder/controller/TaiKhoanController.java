package com.hqtcsdl.foodorder.controller;



import com.hqtcsdl.foodorder.entity.TaiKhoan;
import com.hqtcsdl.foodorder.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/taikhoan")
public class TaiKhoanController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping("")
    public List<TaiKhoan> GetAll(){
        return taiKhoanService.findAll();
    }


    @GetMapping("/{tendangnhap}")
    public ResponseEntity<TaiKhoan> getTaiKhoanByTenDangNhap(@PathVariable("tendangnhap") String tendangnhap){
        return taiKhoanService.findTaiKhoanByTenDangNhap(tendangnhap);
    }
}
