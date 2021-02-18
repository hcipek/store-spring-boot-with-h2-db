package com.ebebek.demo.model.base;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public abstract class BaseRequest<T extends BaseDto> {

    private List<T> requestList;

}
