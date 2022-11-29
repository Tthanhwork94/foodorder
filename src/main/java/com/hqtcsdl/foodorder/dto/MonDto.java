package com.hqtcsdl.foodorder.dto;

import com.hqtcsdl.foodorder.entity.DoiTac;
import com.hqtcsdl.foodorder.entity.Mon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MonDto {
    private Long mamon;
    private String tenmon;
    private String mieuta;
    private Float gia;
    private String tinhtrang;
    private Long doitac;

    public Mon mappingToMon(){
        Mon mon = new Mon();
        mon.setMamon(this.mamon);
        mon.setTenmon(this.tenmon);
        mon.setGia(Double.valueOf(this.gia));
        mon.setTinhtrang(this.tinhtrang);
        return  mon;
    }
}
