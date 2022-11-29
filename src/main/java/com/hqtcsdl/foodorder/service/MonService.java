package com.hqtcsdl.foodorder.service;

import com.hqtcsdl.foodorder.dto.MonDto;
import com.hqtcsdl.foodorder.entity.Mon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MonService {

    List<Mon> findMenu(Integer madoitac);

}
