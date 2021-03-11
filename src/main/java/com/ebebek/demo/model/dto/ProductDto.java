package com.ebebek.demo.model.dto;

import com.ebebek.demo.model.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDto extends BaseDto {

    private Long id;
    private Long stockId;


}
