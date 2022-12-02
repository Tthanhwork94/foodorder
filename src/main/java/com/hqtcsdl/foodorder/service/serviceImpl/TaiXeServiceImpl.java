package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.TaiXeDto;
import com.hqtcsdl.foodorder.entity.TaiKhoan;
import com.hqtcsdl.foodorder.entity.TaiXe;
import com.hqtcsdl.foodorder.repository.TaiKhoanRepo;
import com.hqtcsdl.foodorder.repository.TaiXeRepo;
import com.hqtcsdl.foodorder.service.TaiKhoanService;
import com.hqtcsdl.foodorder.service.TaiXeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TaiXeServiceImpl implements TaiXeService {

    @Autowired
    private TaiXeRepo repo;

    @Override
    public List<TaiXe> findAll() {
        return repo.findAll();
    }

    @Override
    public TaiXe save(TaiXe taiXe) {
        return repo.save(taiXe);
    }

    @Override
    @Transactional(rollbackOn = {Error.class, Exception.class})
    public void updateinfor(TaiXeDto dto) {
        repo.updateinfor(dto.getMataixe(), dto.getHoten(), dto.getCmnd(), dto.getSodienthoai(), dto.getDiachi(), dto.getBiensoxe(), dto.getKhuvuchoatdong(), dto.getEmail(), dto.getSotaikhoan());
    }

    @Override
    public TaiXe findByMaTaiXe(Long mataixe) {
        return repo.findByMaTaiXe(mataixe);
    }


}
