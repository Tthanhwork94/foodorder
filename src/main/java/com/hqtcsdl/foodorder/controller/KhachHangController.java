package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.dto.DonHangChiTietDto;
import com.hqtcsdl.foodorder.dto.DonHangDto;
import com.hqtcsdl.foodorder.dto.KhachHangDto;
import com.hqtcsdl.foodorder.entity.DonDatHang;
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

    @GetMapping("{makhachhang}/donhang")
    public List<DonDatHang> getDonDatHang(@PathVariable("makhachhang") Long makhachhang){
        return donDatHangService.findDonHangByMaKhachHang(makhachhang);
    }

    @GetMapping("infor/{makhachhang}")
    public KhachHang getThongTinKhachHang(@PathVariable("makhachhang") Long makhachhang){
        return khachHangService.findByMaKhachHang(makhachhang);
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

    @GetMapping("donhang/huy/{madonhang}")
    public Integer huydonhang(@PathVariable("madonhang") Long madonhang){
        return donDatHangService.huydonhang(madonhang);
    }


    @PostMapping("infor/update")
    public Integer updateThongTin(@RequestBody KhachHangDto dto){
        try {
            khachHangService.updateInfor(dto);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
