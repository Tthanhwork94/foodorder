package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.entity.TaiXe;
import com.hqtcsdl.foodorder.service.TaiXeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/taixe")
public class TaiXeController {
    @Autowired
    private TaiXeService taiXeService;

    @GetMapping("")
    public List<TaiXe> getAll(){
        return taiXeService.findAll();
    };
}
