package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.DonHangChiTietDto;
import com.hqtcsdl.foodorder.dto.DonHangDto;
import com.hqtcsdl.foodorder.entity.DonDatHang;
import com.hqtcsdl.foodorder.repository.DonHangRepo;
import com.hqtcsdl.foodorder.service.DonDatHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DonDatHangServiceImpl implements DonDatHangService {

    @Autowired
    private DonHangRepo repo;


    @Override
    public List<DonDatHang> findDonDatHangByMaDoiTac(Long madoitac) {
        return repo.findDonDatHangByMaDoiTac(madoitac);
    }

    @Override
    @Transactional(rollbackOn = {Error.class, Exception.class})
    public Integer insertDonHang(DonHangDto dto) {
        return repo.insertDonHang(dto.getSdtkhachhang(), dto.getDiachigiaohang(), 0, dto.getMakhachhang(),dto.getMachinhanh(),dto.getTuychon());
    }

    @Override
    public List<DonDatHang> findDonHangByMaKhachHang(Long makhachhang) {
        return repo.findDonDatHangByMaKhachHang(makhachhang);
    }

    @Override
    @Transactional(rollbackOn = {Error.class,Exception.class})
    public Integer huydonhang(Long madonhang) {
        return repo.huyDonHang(madonhang);
    }

}
