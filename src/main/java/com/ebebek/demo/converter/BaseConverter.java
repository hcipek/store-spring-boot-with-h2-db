package com.ebebek.demo.converter;

import com.ebebek.demo.model.base.BaseModel;
import com.ebebek.demo.model.base.BaseRequest;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public abstract class BaseConverter<T extends BaseModel, U extends BaseRequest> {

    public abstract List<T> convert(U request);
}
