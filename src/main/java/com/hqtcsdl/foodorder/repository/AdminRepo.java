package com.hqtcsdl.foodorder.repository;


import com.hqtcsdl.foodorder.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {
    List<Admin> findAll();
}
