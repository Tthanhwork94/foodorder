package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.HopDongChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HopDongChiTietRepo extends JpaRepository<HopDongChiTiet,Long> {

    @Modifying(clearAutomatically = true)
    @Query(value = "EXECUTE proc_DT_themHopDongChiTiet :mahopdong,:machinhanh",nativeQuery = true)
    void insertHopDongChiTiet(Long mahopdong, Long machinhanh);
}
