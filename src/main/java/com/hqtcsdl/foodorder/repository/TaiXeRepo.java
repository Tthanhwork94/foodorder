package com.hqtcsdl.foodorder.repository;

import com.hqtcsdl.foodorder.entity.TaiXe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaiXeRepo extends JpaRepository<TaiXe,Long> {

    List<TaiXe> findAll();
}
