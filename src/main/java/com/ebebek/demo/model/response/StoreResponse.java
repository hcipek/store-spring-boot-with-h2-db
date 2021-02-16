package com.ebebek.demo.model.response;

import com.ebebek.demo.model.base.BaseResponse;
import com.ebebek.demo.model.entity.Store;

import java.util.List;

public class StoreResponse extends BaseResponse<Store> {

    public StoreResponse(List<Store> storeList, String message, int code) {
        super(storeList, message, code);
    }
}
