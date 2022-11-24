package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.entity.Admin;
import com.hqtcsdl.foodorder.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("")
    public List<Admin> getAll(){
        return adminService.findAll();
    }
}
