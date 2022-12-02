package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.TaiXe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaiXeRepo extends JpaRepository<TaiXe,Long> {

    List<TaiXe> findAll();

    TaiXe save(TaiXe taiXe);

    @Query(value = "Select * from TaiXe where mataixe=:mataixe",nativeQuery = true)
    TaiXe getinfor(Long mataixe);


    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE TaiXe Set hoten=:hoten,cmnd=:cmnd,sodienthoai=:sodienthoai,diachi=:diachi," +
            "biensoxe=:biensoxe,khuvuchoatdong=:khuvuchoatdong,email=:email,sotaikhoan=:sotaikhoan where mataixe=:mataixe",nativeQuery = true)
    void updateinfor(Long mataixe,String hoten,String cmnd,String sodienthoai,String diachi,String biensoxe,String khuvuchoatdong,String email,String sotaikhoan);

    @Query(value = "SELECT * from TaiXe where mataixe=:mataixe",nativeQuery = true)
    TaiXe findByMaTaiXe(Long mataixe);
}
