package com.ebebek.demo.model.base;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseResponse<T extends BaseModel> {

    private List<T> results;
    private String resultMessage;
    private int resultCode;
}
