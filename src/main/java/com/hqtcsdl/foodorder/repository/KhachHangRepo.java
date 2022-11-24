package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhachHangRepo extends JpaRepository<KhachHang,Long> {
    List<KhachHang> findAll();
}
