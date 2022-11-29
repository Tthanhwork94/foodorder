package com.hqtcsdl.foodorder.repository;


import com.hqtcsdl.foodorder.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaiKhoanRepo extends JpaRepository<TaiKhoan,Long> {

    @Query(value = "execute proc_admin_danhsachtaikhoan", nativeQuery = true)
    List<TaiKhoan> findDSTaiKhoan();
    TaiKhoan findByTendangnhap(String tendangnhap);

    TaiKhoan save(TaiKhoan taiKhoan);

    @Query(value = "execute proc_Getall :num", nativeQuery = true)
    List<TaiKhoan> get_taikhoantest(@Param("num") int num);
}
