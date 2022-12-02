package com.hqtcsdl.foodorder.controller;

import com.hqtcsdl.foodorder.dto.TaiXeDto;
import com.hqtcsdl.foodorder.entity.DonDatHang;
import com.hqtcsdl.foodorder.entity.TaiXe;
import com.hqtcsdl.foodorder.service.DonDatHangService;
import com.hqtcsdl.foodorder.service.TaiXeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taixe")
public class TaiXeController {
    @Autowired
    private TaiXeService taiXeService;

    @Autowired
    private DonDatHangService donDatHangService;

    @GetMapping("")
    public List<TaiXe> getAll(){
        return taiXeService.findAll();
    };


    @GetMapping("nhandon/{mataixe}/{madondathang}")
    public Integer nhandon(@PathVariable("mataixe") Long mataixe,@PathVariable("madondathang") Long madondathang){
        try{
            donDatHangService.txnhandon(mataixe,madondathang);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    @GetMapping("laydon/{mataixe}/{madondathang}")
    public Integer laydon(@PathVariable("mataixe") Long mataixe,@PathVariable("madondathang") Long madondathang){
        try{
            donDatHangService.txlaydon(mataixe,madondathang);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    @GetMapping("giaothanhcong/{mataixe}/{madondathang}")
    public Integer giaothanhcong(@PathVariable("mataixe") Long mataixe,@PathVariable("madondathang") Long madondathang){
        try{
            donDatHangService.txgiaothanhcong(mataixe,madondathang);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    @GetMapping("donhang/{mataixe}")
    public List<DonDatHang> getDonHang(@PathVariable("mataixe") Long mataixe){
        try{
            return donDatHangService.findByMaTaiXe(mataixe);
        }catch (Exception e){
            e.printStackTrace();
            return donDatHangService.findByMaTaiXe(mataixe);
        }
    }

    @PostMapping("infor/update")
    public Integer updateInfor(@RequestBody TaiXeDto dto){
        try {
            taiXeService.updateinfor(dto);
            return 1;
        }catch (Exception e){
            return -1;
        }
    }

    @GetMapping("/infor/{mataixe}")
    public TaiXe findByMaTaiXe(@PathVariable("mataixe") Long mataixe){
        return taiXeService.findByMaTaiXe(mataixe);
    }

    @GetMapping("/thongke/{mataixe}/{nam}")
    public List<Float> thongkedoanhso(@PathVariable("mataixe") Long mataixe, @PathVariable("nam") Integer nam){
        return donDatHangService.thongke(mataixe,nam);
    }

}
