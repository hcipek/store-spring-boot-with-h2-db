package com.ebebek.demo.controller;

import com.ebebek.demo.model.request.StoreRequest;
import com.ebebek.demo.model.response.StoreResponse;
import com.ebebek.demo.service.StoreService;

public class StoreController extends BaseController<StoreService, StoreRequest, StoreResponse> {

    @Override
    public StoreResponse create(StoreRequest request) {
        return service.create(request);
    }

    @Override
    public StoreResponse update(StoreRequest request) {
        return null;
    }

    @Override
    public StoreResponse delete(StoreRequest request) {
        return null;
    }

    @Override
    public StoreResponse get(StoreRequest request) {
        return null;
    }
}
