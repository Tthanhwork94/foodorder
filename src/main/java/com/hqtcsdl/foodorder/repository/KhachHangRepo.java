package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhachHangRepo extends JpaRepository<KhachHang,Long> {
    List<KhachHang> findAll();

    KhachHang save(KhachHang khachHang);

    KhachHang findByMakhachhang(Long makhachhang);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE KhachHang SET hoten=:hoten, sodienthoai=:sodienthoai,diachi=:diachi,email=:email WHERE  makhachhang=:makhachhang",nativeQuery = true)
    void updateInfor(String hoten,String sodienthoai,String diachi,String email,Long makhachhang);
//    KhachHang
}
