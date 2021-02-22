package com.ebebek.demo.model.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseRequest<T extends BaseDto> {

    private List<T> requestList;

}
