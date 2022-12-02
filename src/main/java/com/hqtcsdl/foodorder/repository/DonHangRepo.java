package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.DonDatHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DonHangRepo extends JpaRepository<DonDatHang,Long> {
    @Query(value = "select  * from DonDatHang where machinhanh in (select machinhanh from ChiNhanh where madoitac = :madoitac)",nativeQuery = true)
    List<DonDatHang> findDonDatHangByMaDoiTac(Long madoitac);

    @Query(value = "EXECUTE proc_kh_dathang :sdtkh,:diachi,:tongsl,:makhachhang,:machinhanh,:tuychon",nativeQuery = true)
    Integer insertDonHang(String sdtkh,String diachi,Integer tongsl,Long makhachhang,Long machinhanh,String tuychon);

    @Query(value = "select  * from DonDatHang where makhachhang=:makhachhang",nativeQuery = true)
    List<DonDatHang> findDonDatHangByMaKhachHang(Long makhachhang);

    @Query(value = "EXECUTE proc_kh_huydonhang :madonhang",nativeQuery = true)
    Integer huyDonHang(Long madonhang);

    @Query(value = "select  * from DonDatHang",nativeQuery = true)
    List<DonDatHang> findAll();

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE DonDatHang SET mataixe=:mataixe,trangthai=:trangthai where madondathang=:madondathang",nativeQuery = true)
    void TaiXeupdateTrangThai(Long mataixe,String trangthai,Long madondathang);

    @Query(value = "select  * from DonDatHang where mataixe=:mataixe",nativeQuery = true)
    List<DonDatHang> findDonDatHangByMaTaiXe(Long mataixe);

    @Query(value = "EXECUTE proc_tx_thongkethunhap :mataixe,:thang,:nam",nativeQuery = true)
    Float thongke(Long mataixe, Integer thang, Integer nam);
}
