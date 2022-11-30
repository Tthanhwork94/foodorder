package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.dto.TaiKhoanDto;
import com.hqtcsdl.foodorder.entity.TaiKhoan;
import com.hqtcsdl.foodorder.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PostController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    //localhost:8080/api/register
    @PostMapping("/register")
    public ResponseEntity<TaiKhoan> doRegiter(@RequestBody TaiKhoan taiKhoan){
        return taiKhoanService.doRegister(taiKhoan);
    }

    @PostMapping("/login")
    public ResponseEntity<TaiKhoan> doLogin(@RequestBody TaiKhoan taiKhoan){
        System.out.println(taiKhoan.getTendangnhap());
        System.out.println(taiKhoan.getMatkhau());
        return taiKhoanService.doLogin(taiKhoan);
    }

    @PostMapping("/changepassword")
    public Integer doChangepwd(@RequestBody TaiKhoanDto dto){
        System.out.println(dto.getMataikhoan());
        System.out.println(dto.getMatkhaucu());
        System.out.println(dto.getMatkhaumoi());
        return taiKhoanService.changePassword(dto.getMataikhoan(), dto.getMatkhaucu(), dto.getMatkhaumoi());
    }
}
