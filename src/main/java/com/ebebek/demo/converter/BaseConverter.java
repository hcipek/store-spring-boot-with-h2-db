package com.ebebek.demo.converter;

import com.ebebek.demo.model.base.BaseModel;
import com.ebebek.demo.model.base.BaseRequest;

public abstract class BaseConverter<T extends BaseModel, U extends BaseRequest> {

    public abstract T convert(U request);
}
