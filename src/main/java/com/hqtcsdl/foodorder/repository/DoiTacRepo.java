package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.DoiTac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoiTacRepo extends JpaRepository<DoiTac,Long> {
    List<DoiTac> findAll();

    DoiTac save(DoiTac doiTac);

    DoiTac findByMadoitac(Long madoitac);

}
