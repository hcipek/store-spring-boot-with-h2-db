package com.ebebek.demo.model.dto;

import com.ebebek.demo.model.base.BaseDto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CityDto extends BaseDto {

    private String plate;
    private BigDecimal lattitude;
    private BigDecimal longitude;
    private List<String> counties;

}
