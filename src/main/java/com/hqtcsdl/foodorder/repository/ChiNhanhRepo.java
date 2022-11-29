package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.ChiNhanh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChiNhanhRepo extends JpaRepository<ChiNhanh,Long> {

    @Query(value = "select * from ChiNhanh where madoitac = :madoitac",nativeQuery = true)
    List<ChiNhanh> findChiNhanhByMaDoiTac(Long madoitac);

    ChiNhanh findChiNhanhByMachinhanh(Long machinhanh);

    @Query(value = "execute proc_DT_chinhSuaThongTinChiNhanh :machinhanh,:tenchinhanh,:diachi,:giomocua,:giodongcua,:tinhtrang",nativeQuery = true)
    void updateChiNhanh(Long machinhanh, String tenchinhanh, String diachi, Integer giomocua, Integer giodongcua,String tinhtrang);

    @Query(value = "execute proc_DT_themChiNhanh :tenchinhanh,:diachi,:giomocua,:giodongcua,:tinhtrang,:madoitac",nativeQuery = true)
    void insertChiNhanh(String tenchinhanh, String diachi, Integer giomocua, Integer giodongcua,String tinhtrang, Long madoitac);
}
