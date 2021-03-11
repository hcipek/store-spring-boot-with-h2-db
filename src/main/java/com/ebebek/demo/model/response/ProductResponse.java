package com.ebebek.demo.model.response;

import com.ebebek.demo.model.base.BaseResponse;
import com.ebebek.demo.model.entity.Product;

import java.util.List;

public class ProductResponse extends BaseResponse<Product> {

    public ProductResponse(List<Product> results, String resultMessage, int resultCode) {
        super(results, resultMessage, resultCode);
    }
}
