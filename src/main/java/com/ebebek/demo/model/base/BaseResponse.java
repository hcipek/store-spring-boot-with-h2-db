package com.ebebek.demo.model.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseResponse<T extends BaseModel> {

    private List<T> results;
    private String resultMessage;
    private int resultCode;
}
