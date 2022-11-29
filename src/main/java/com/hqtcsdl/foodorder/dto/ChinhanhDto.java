package com.hqtcsdl.foodorder.dto;

import lombok.*;

import javax.persistence.Access;
import javax.persistence.NamedStoredProcedureQuery;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChinhanhDto {
    private Long machinhanh;
    private String tenchinhanh;
    private String diachi;
    private Integer giomocua;
    private Integer giodongcua;
    private String tinhtrang;
    private Long madoitac;
}
