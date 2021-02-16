package com.ebebek.demo.controller;

import com.ebebek.demo.model.request.StoreRequest;
import com.ebebek.demo.model.response.StoreResponse;
import com.ebebek.demo.service.StoreService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/store")
public class StoreController extends BaseController<StoreService, StoreRequest, StoreResponse> {

    @Override
    @PostMapping("/create")
    @Transactional(propagation = Propagation.REQUIRED)
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
