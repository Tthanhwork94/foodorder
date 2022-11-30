package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.DonDatHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DonDatHangChiTietRepo extends JpaRepository<DonDatHangChiTiet,Long> {

    @Query(value = "Select * from DonDatHangChiTiet where madondathang= :madonhang",nativeQuery = true)
    List<DonDatHangChiTiet> findByMaDonHang(Long madonhang);
}
