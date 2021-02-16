package com.ebebek.demo.model.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class BaseDto {

    private String name;

    public BaseDto() {

    }

}
