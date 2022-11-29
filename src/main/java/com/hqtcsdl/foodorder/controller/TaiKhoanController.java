package com.hqtcsdl.foodorder.controller;



import com.hqtcsdl.foodorder.entity.Mon;
import com.hqtcsdl.foodorder.entity.TaiKhoan;
import com.hqtcsdl.foodorder.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @SuppressWarnings("unchecked")
    @GetMapping("/test/proc/{num}")
    public List<Mon> getTst(@PathVariable("num") Long num){
        List<Mon> monList= entityManager.createNamedStoredProcedureQuery("proc_DT_xemThucDon")
                .setParameter("madoitac", num).getResultList();
        return monList;

    }
}
