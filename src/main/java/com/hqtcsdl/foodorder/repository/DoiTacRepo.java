package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.DoiTac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoiTacRepo extends JpaRepository<DoiTac,Long> {
    List<DoiTac> findAll();

    DoiTac save(DoiTac doiTac);

    DoiTac findByMadoitac(Long madoitac);

    @Modifying(clearAutomatically = true)
    @Query(value = "update DoiTac set email=:email,tenquan=:tenquan,nguoidaidien=:nguoidaidien," +
            "donhangdukien=:donhangdukien,loaiamthuc=:loaiamthuc,diachikinhdoanh=:diachikinhdoanh, sdt=:sdt where madoitac=:madoitac",nativeQuery = true)
    void changeInfor(Long madoitac, String email,String tenquan,String nguoidaidien,Integer donhangdukien,String loaiamthuc,String diachikinhdoanh,String sdt);

}
