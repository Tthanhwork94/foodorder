package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.ChinhanhDto;
import com.hqtcsdl.foodorder.entity.ChiNhanh;
import com.hqtcsdl.foodorder.repository.ChiNhanhRepo;
import com.hqtcsdl.foodorder.service.ChiNhanhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ChiNhanhServiceImpl implements ChiNhanhService {

    @Autowired
    private ChiNhanhRepo repo;

    @Override
    public List<ChiNhanh> findChiNhanhByMaDoiTac(Long madoitac) {
        return repo.findChiNhanhByMaDoiTac(madoitac);
    }

    @Override
    public ChiNhanh findChiNhanhByMachinhanh(Long machinhanh) {
        return repo.findChiNhanhByMachinhanh(machinhanh);
    }

    @Override
    public ChinhanhDto updateChinhanh(ChinhanhDto dto) {
        try {
            repo.updateChiNhanh(dto.getMachinhanh(), dto.getTenchinhanh(), dto.getDiachi(), dto.getGiomocua(),dto.getGiodongcua(),dto.getTinhtrang());
            return dto;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    @Transactional(rollbackOn = {Exception.class, Error.class})
    public ChinhanhDto insertChinhanh(ChinhanhDto dto) {
        try {
            repo.insertChiNhanh(dto.getTenchinhanh(), dto.getDiachi(), dto.getGiomocua(),dto.getGiodongcua(),dto.getTinhtrang(),dto.getMadoitac());
            return dto;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
