package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepo extends JpaRepository<NhanVien,Long> {
    List<NhanVien> findAll();
}
