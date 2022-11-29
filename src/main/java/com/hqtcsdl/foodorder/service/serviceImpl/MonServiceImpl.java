package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.MonDto;
import com.hqtcsdl.foodorder.entity.Mon;
import com.hqtcsdl.foodorder.repository.MonRepo;
import com.hqtcsdl.foodorder.service.DoiTacService;
import com.hqtcsdl.foodorder.service.MonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonServiceImpl implements MonService {
    @Autowired
    private MonRepo repo;

    @Override
    public List<Mon> findMenu(Integer madoitac) {
        return repo.findMenu(madoitac);
    }

    @Override
    public Mon findByMamon(Long mamon) {
        return repo.findByMamon(mamon);
    }

    @Override
    public MonDto updateMon(MonDto dto) {
        try{
            repo.updateMon(dto.getMamon(),dto.getTenmon(),dto.getMieuta(),dto.getGia(),dto.getTinhtrang());
            return dto;
        }
        catch (Exception e){
            return dto;
        }
    }

    @Override
    public MonDto insertMon(MonDto dto) {
        try{
            repo.insertMon(dto.getTenmon(), dto.getMieuta(),dto.getGia(),dto.getTinhtrang(),dto.getDoitac());
            return dto;
        }
        catch (Exception e){
            return dto;
        }
    }
}
