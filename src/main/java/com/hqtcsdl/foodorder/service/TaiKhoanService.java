package com.hqtcsdl.foodorder.service;



import com.hqtcsdl.foodorder.entity.Mon;
import com.hqtcsdl.foodorder.entity.TaiKhoan;
import org.springframework.http.ResponseEntity;

import java.sql.SQLException;
import java.util.List;

public interface TaiKhoanService {
    List<TaiKhoan> findAll();

    ResponseEntity<TaiKhoan> doRegister(TaiKhoan taiKhoan);

    ResponseEntity<TaiKhoan>  findTaiKhoanByTenDangNhap(String tendangnhap);

    ResponseEntity<TaiKhoan> doLogin(TaiKhoan taiKhoan);

    List<TaiKhoan> test(int num);

    TaiKhoan findByMaTaiKhoan(Long mataikhoan);

    Integer changePassword(Long mataikhoan,String matkhaucu,String matkhaumoi);

}
