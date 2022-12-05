package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.dto.MonDto;
import com.hqtcsdl.foodorder.entity.Mon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonRepo extends JpaRepository<Mon,Long> {
    List<Mon> findAll();

    @Query(value = "select * from Mon with(nolock) where  madoitac = :madoitac", nativeQuery = true)
    List<Mon> findMenu(@Param("madoitac") Integer madoitac);

    Mon findByMamon(Long mamon);

    Mon save(Mon mon);

    @Modifying(clearAutomatically = true)
    @Query(value = "execute proc_DT_capnhatmonan :mamon,:tenmon,:mieuta,:gia,:tinhtrang",nativeQuery = true)
    void updateMon(Long mamon, String tenmon, String mieuta, Float gia, String tinhtrang);

    @Modifying(clearAutomatically = true)
    @Query(value = "execute proc_DT_themMonAn :tenmon,:mieuta,:gia,:tinhtrang,:madoitac",nativeQuery = true)
    void insertMon(String tenmon, String mieuta, Float gia, String tinhtrang, Long madoitac);
}
