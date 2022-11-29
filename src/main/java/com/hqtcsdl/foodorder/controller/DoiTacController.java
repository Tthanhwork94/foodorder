package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.dto.ChinhanhDto;
import com.hqtcsdl.foodorder.dto.MonDto;
import com.hqtcsdl.foodorder.entity.ChiNhanh;
import com.hqtcsdl.foodorder.entity.DoiTac;
import com.hqtcsdl.foodorder.entity.HopDong;
import com.hqtcsdl.foodorder.entity.Mon;
import com.hqtcsdl.foodorder.service.ChiNhanhService;
import com.hqtcsdl.foodorder.service.DoiTacService;
import com.hqtcsdl.foodorder.service.HopDongService;
import com.hqtcsdl.foodorder.service.MonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/doitac")
public class DoiTacController {
    @Autowired
    private DoiTacService doiTacService;


    @Autowired
    private MonService monService;

    @Autowired
    private ChiNhanhService chiNhanhService;

    @Autowired
    private HopDongService hopdongService;

    @GetMapping("")
    public List<DoiTac> getALl(){
        return doiTacService.findAll();
    }

    @GetMapping("/menu/{madoitac}")
    public ResponseEntity<List<Mon>> getMenu(@PathVariable("madoitac") Integer madoitac){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(doiTacService.findMenu(madoitac));
    }

    @GetMapping("/{mamon}")
    public ResponseEntity<Mon> getMon(@PathVariable("mamon") Long mamon){
        return ResponseEntity.status(HttpStatus.OK).body(monService.findByMamon(mamon));
    }

    @PostMapping("/menu/update")
    public MonDto updateMon(@RequestBody MonDto monDto) {
        return monService.updateMon(monDto);
    }

    @PostMapping("/menu/insert")
    public MonDto insertMon(@RequestBody MonDto monDto) {
        return monService.insertMon(monDto);
    }

    @GetMapping("chinhanh/{madoitac}")
    public ResponseEntity<List<ChiNhanh>> getAllChiNhanh(@PathVariable("madoitac") Long madoitac){
        return ResponseEntity.status(HttpStatus.OK).body(chiNhanhService.findChiNhanhByMaDoiTac(madoitac));
    }

    @GetMapping("chinhanh")
    public ResponseEntity<ChiNhanh> getChiNhanh(@RequestParam("machinhanh") Long machinhanh){
        return ResponseEntity.status(HttpStatus.OK).body(chiNhanhService.findChiNhanhByMachinhanh(machinhanh));
    }

    @PostMapping("/chinhanh/update")
    public ChinhanhDto updateChiNhanh(@RequestBody ChinhanhDto dto){
        try{
            chiNhanhService.updateChinhanh(dto);
            return dto;
        }catch (Exception e){
            return dto;
        }
    }

    @PostMapping("/chinhanh/insert")
    public ChinhanhDto insertChiNhanh(@RequestBody ChinhanhDto dto){
        try{
            chiNhanhService.insertChinhanh(dto);
            return dto;
        }catch (Exception e){
            return dto;
        }
    }

    @GetMapping("/hopdong/{madoitac}")
    public ResponseEntity<List<HopDong>> getAllHopDong(@PathVariable("madoitac") Long madoitac){
        return ResponseEntity.status(HttpStatus.OK).body(hopdongService.findHopDongByMaDoiTac(madoitac));
    }
}

