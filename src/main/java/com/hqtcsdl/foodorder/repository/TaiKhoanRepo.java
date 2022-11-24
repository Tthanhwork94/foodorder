package com.hqtcsdl.foodorder.repository;


import com.hqtcsdl.foodorder.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaiKhoanRepo extends JpaRepository<TaiKhoan,Long> {
    List<TaiKhoan> findAll();
}
