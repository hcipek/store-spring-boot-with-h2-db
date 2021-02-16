package com.ebebek.demo.model.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public abstract class BaseRequest<T extends BaseDto> {

    private List<T> requestList;

    public BaseRequest() {
    }
}
