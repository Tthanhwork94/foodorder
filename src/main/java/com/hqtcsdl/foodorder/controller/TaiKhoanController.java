package com.hqtcsdl.foodorder.controller;



import com.hqtcsdl.foodorder.entity.Mon;
import com.hqtcsdl.foodorder.entity.TaiKhoan;
import com.hqtcsdl.foodorder.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@RestController
@RequestMapping("/api/taikhoan")
public class TaiKhoanController {

    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping("")
    public List<TaiKhoan> GetAll(){
        return taiKhoanService.findAll();
    }


    @GetMapping("/{tendangnhap}")
    public ResponseEntity<TaiKhoan> getTaiKhoanByTenDangNhap(@PathVariable("tendangnhap") String tendangnhap){
        return taiKhoanService.findTaiKhoanByTenDangNhap(tendangnhap);
    }

//    @SuppressWarnings("unchecked")
//    @GetMapping("/test/proc/{num}")
//    public List<Mon> getTst(@PathVariable("num") Long num){
//        List<Mon> monList= entityManager.createNamedStoredProcedureQuery("proc_DT_xemThucDon")
//                .setParameter("madoitac", num).getResultList();
//        return monList;
//
//    }

    @PostMapping("/updatetrangthai/{mataikhoan}")
    public ResponseEntity<?> updateTrangThaiTaiKhoan(@PathVariable("mataikhoan") Long mataikhoan,@RequestBody String trangthai){
        try{
            System.out.println(trangthai.equals("dkh="));
            trangthai=(trangthai.equals("dkh="))?"đã kích hoạt":"đã khóa";
            System.out.println(trangthai);
            taiKhoanService.updateTrangThaiTaiKhoan(mataikhoan,trangthai);
            return ResponseEntity.status(HttpStatus.OK).body(mataikhoan);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.OK).body(-1);
        }
    }
}
