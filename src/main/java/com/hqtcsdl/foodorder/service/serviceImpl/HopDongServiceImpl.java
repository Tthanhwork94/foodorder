package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.HopDongDto;
import com.hqtcsdl.foodorder.entity.HopDong;
import com.hqtcsdl.foodorder.repository.HopDongRepo;
import com.hqtcsdl.foodorder.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HopDongServiceImpl implements HopDongService {

    @Autowired
    private HopDongRepo repo;

    @Override
    public List<HopDong> findHopDongByMaDoiTac(Long madoitac) {
        return repo.getHopDongByMaDoiTac(madoitac);
    }

    @Override
    @Transactional(rollbackOn = {Exception.class, Error.class})
    public Long insertHopDong(HopDongDto dto) {
        return repo.insertHopDong(dto.getSochinhanhdk(),dto.getSotaikhoan(),dto.getNganhang(),"chưa kích hoạt",dto.getMadoitac());
    }

}
