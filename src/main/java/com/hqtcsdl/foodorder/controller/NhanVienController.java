package com.hqtcsdl.foodorder.controller;


import com.hqtcsdl.foodorder.entity.HopDong;
import com.hqtcsdl.foodorder.entity.NhanVien;
import com.hqtcsdl.foodorder.service.DonDatHangService;
import com.hqtcsdl.foodorder.service.HopDongService;
import com.hqtcsdl.foodorder.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/nhanvien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private HopDongService hopDongService;

    @Autowired
    private DonDatHangService donDatHangService;

    @GetMapping("")
    public List<NhanVien> getAll(){
        return nhanVienService.findALl();
    }

    @GetMapping("/hopdong")
    public List<HopDong> findAllHopDong(){
        return hopDongService.findAll();
    }

    @GetMapping("/hopdong/duyet/{mahopdong}/{manhanvien}")
    public Integer duyetHopDong(@PathVariable("mahopdong") Long mahopdong,@PathVariable("manhanvien") Long manhanvien){
        try{
            hopDongService.settrangthai("đã kích hoạt",mahopdong,manhanvien);
            return 1;
        }catch (Exception e){
            return -1;
        }
    }

    @GetMapping("thongke/{nam}")
    public List<List<Float>> thongke(@PathVariable("nam") int nam){
        List<Float> tongtien = donDatHangService.thongketongtien(nam);
        List<Float> soluong = donDatHangService.thongkesoluong(nam);
        List<List<Float>> thongke=new ArrayList<>();
        thongke.add(tongtien);
        thongke.add(soluong);
        return thongke;
    }
}
