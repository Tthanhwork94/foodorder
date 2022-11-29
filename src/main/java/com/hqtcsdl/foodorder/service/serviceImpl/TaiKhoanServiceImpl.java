package com.hqtcsdl.foodorder.service.serviceImpl;


import com.hqtcsdl.foodorder.entity.DoiTac;
import com.hqtcsdl.foodorder.entity.KhachHang;
import com.hqtcsdl.foodorder.entity.TaiKhoan;
import com.hqtcsdl.foodorder.entity.TaiXe;
import com.hqtcsdl.foodorder.repository.TaiKhoanRepo;
import com.hqtcsdl.foodorder.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {


    private BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();

    @Autowired
    private TaiKhoanRepo repo;

    @Override
    public List<TaiKhoan> findAll() {
        return repo.findDSTaiKhoan();
    }

    @Override
    @Transactional(rollbackOn = {Exception.class, Error.class})
    public ResponseEntity<TaiKhoan> doRegister(TaiKhoan taiKhoanResponse) {

         String tendangnhap = taiKhoanResponse.getTendangnhap();
         String matkhau = taiKhoanResponse.getMatkhau();
         TaiKhoan taiKhoan  = repo.findByTendangnhap(tendangnhap);
         //chua ton tai
         if (taiKhoan == null){
             taiKhoan = new TaiKhoan();
             taiKhoan.setTendangnhap(tendangnhap);
             taiKhoan.setMatkhau(bcrypt.encode(matkhau));
             taiKhoan.setLoaitaikhoan(taiKhoanResponse.getLoaitaikhoan());
             taiKhoan.setTrangthai("chưa kích hoạt");
             TaiKhoan taikhoansaved=repo.save(taiKhoan);
             System.out.println("dang ky thanh cong");
             return ResponseEntity.status(HttpStatus.OK).body(taikhoansaved);
         }else{
             System.out.println("da ton tai");
             return ResponseEntity.status(HttpStatus.CONFLICT).body(taiKhoanResponse);
         }
    }

    @Override
    public ResponseEntity<TaiKhoan> findTaiKhoanByTenDangNhap(String tendangnhap) {
        Optional<TaiKhoan> optional = Optional.of(repo.findByTendangnhap(tendangnhap));
        if(optional.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(optional.get());
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(optional.get());
        }
    }

    @Override
    public ResponseEntity<TaiKhoan> doLogin(TaiKhoan taiKhoan) {
        TaiKhoan taikhoanCheck=repo.findByTendangnhap(taiKhoan.getTendangnhap());
        Optional<TaiKhoan> optional = Optional.of(taikhoanCheck);
        if(!optional.isPresent()){
            System.out.println("dang nhap that bai");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(optional.get()); //404
        }else{
            if(bcrypt.matches(taiKhoan.getMatkhau(),optional.get().getMatkhau())){
                System.out.println("dang nhap thanh cong");
                return ResponseEntity.status(HttpStatus.OK).body(optional.get()); //200
            }else{
                System.out.println("dang nhap that bai 2");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(optional.get()); //400
            }
        }
    }

    @Override
    public List<TaiKhoan> test(int num){
        System.out.println(repo.get_taikhoantest(num).isEmpty());
        System.out.println("th1");
        return repo.get_taikhoantest(num);

    }
}
