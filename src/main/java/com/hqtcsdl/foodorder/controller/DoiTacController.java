package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.entity.DoiTac;
import com.hqtcsdl.foodorder.service.DoiTacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/doitac")
public class DoiTacController {
    @Autowired
    private DoiTacService doiTacService;

    @GetMapping("")
    public List<DoiTac> getALl(){
        return doiTacService.findAll();
    }
}
