package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.DonDatHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DonDatHangChiTietRepo extends JpaRepository<DonDatHangChiTiet,Long> {

    @Query(value = "Select * from DonDatHangChiTiet where madondathang= :madonhang",nativeQuery = true)
    List<DonDatHangChiTiet> findByMaDonHang(Long madonhang);

    @Modifying(clearAutomatically = true)
    @Query(value = "EXECUTE proc_kh_themchitietdon :madondathang,:mamon,:soluong",nativeQuery = true)
    void insertDonHangChiTiet(Long madondathang,Long mamon,Integer soluong);
}
