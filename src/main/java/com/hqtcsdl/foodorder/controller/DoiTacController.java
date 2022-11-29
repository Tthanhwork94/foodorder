package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.dto.MonDto;
import com.hqtcsdl.foodorder.entity.DoiTac;
import com.hqtcsdl.foodorder.entity.Mon;
import com.hqtcsdl.foodorder.repository.MonRepo;
import com.hqtcsdl.foodorder.service.DoiTacService;
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
    private MonRepo monRepo;

    @Autowired
    private MonService monService;

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
        return ResponseEntity.status(HttpStatus.OK).body(monRepo.findByMamon(mamon));
    }

    @PostMapping("/menu/update")
    public String updateMon(@RequestBody MonDto monDto) {
        System.out.println(monDto.getDoitac());
        System.out.println(monDto.getTenmon());
        return "hello";
    }
}

