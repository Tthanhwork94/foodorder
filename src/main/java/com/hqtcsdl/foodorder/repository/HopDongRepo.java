package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.HopDong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HopDongRepo extends JpaRepository<HopDong,Long> {

    @Query(value = "select * from HopDong where madoitac = :madoitac",nativeQuery = true)
    List<HopDong> getHopDongByMaDoiTac(Long madoitac);

}
