package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.dto.DonHangChiTietDto;
import com.hqtcsdl.foodorder.dto.DonHangDto;
import com.hqtcsdl.foodorder.entity.KhachHang;
import com.hqtcsdl.foodorder.service.DonDatHangChiTietService;
import com.hqtcsdl.foodorder.service.DonDatHangService;
import com.hqtcsdl.foodorder.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khachhang")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private DonDatHangService donDatHangService;

    @Autowired
    private DonDatHangChiTietService donDatHangChiTietService;

    @GetMapping("")
    public List<KhachHang> getAll(){
        return khachHangService.findAll();
    }

    @PostMapping("/donhang/insert")
    public Integer insertDonHang(@RequestBody DonHangDto dto){
        try {
            return donDatHangService.insertDonHang(dto);
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    @PostMapping("donhangchitiet/insert")
    public ResponseEntity<?> integerDonHangChiTiet(@RequestBody DonHangChiTietDto dto){
       donDatHangChiTietService.insertDonHangChiTiet(dto);
       return ResponseEntity.status(HttpStatus.OK).body(1);
    }
}
