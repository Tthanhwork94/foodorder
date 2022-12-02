package com.hqtcsdl.foodorder.service.serviceImpl;

import com.hqtcsdl.foodorder.dto.DonHangChiTietDto;
import com.hqtcsdl.foodorder.dto.DonHangDto;
import com.hqtcsdl.foodorder.entity.DonDatHang;
import com.hqtcsdl.foodorder.repository.DonHangRepo;
import com.hqtcsdl.foodorder.service.DonDatHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
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

    @Override
    public List<DonDatHang> findAll() {
        return repo.findAll();
    }

    @Override
    @Transactional(rollbackOn = {Exception.class, Error.class})
    public void txnhandon(Long mataixe, Long madonhang) {
        repo.TaiXeupdateTrangThai(mataixe,"đang chuẩn bị",madonhang);
    }

    @Override
    @Transactional(rollbackOn = {Exception.class, Error.class})
    public void txlaydon(Long mataixe, Long madonhang) {
        repo.TaiXeupdateTrangThai(mataixe,"đã nhận đơn hàng",madonhang);
    }

    @Override
    @Transactional(rollbackOn = {Exception.class, Error.class})
    public void txgiaothanhcong(Long mataixe, Long madonhang) {
        repo.TaiXeupdateTrangThai(mataixe,"giao thành công",madonhang);
    }

    @Override
    public List<DonDatHang> findByMaTaiXe(Long mataixe) {
        return repo.findDonDatHangByMaTaiXe(mataixe);
    }

    @Override
    public List<Float> thongke(Long mataixe, Integer nam) {
        List<Float> thongke=new ArrayList<>();
        for(int i=1;i<=12;i++){
            thongke.add(repo.thongke(mataixe,i,nam));
        }
        return thongke;
    }

}
