package com.ebebek.demo.controller;

import com.ebebek.demo.model.request.CityRequest;
import com.ebebek.demo.model.request.StoreRequest;
import com.ebebek.demo.model.response.StoreResponse;
import com.ebebek.demo.service.StoreService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/store")
public class StoreController extends BaseController<StoreService, StoreRequest, StoreResponse> {

    @Override
    @PostMapping("/create")
    @Transactional(propagation = Propagation.REQUIRED)
    public StoreResponse create(@RequestBody StoreRequest request) {
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

    @GetMapping("/getall")
    @Transactional(propagation = Propagation.SUPPORTS)
    public StoreResponse getAll() {
        return service.findAllWithBody();
    }

    @PostMapping("/create/generate")
    @Transactional(propagation = Propagation.REQUIRED)
    public StoreResponse createGenerate(@RequestBody CityRequest req) {
        return service.createGenerate(req);
    }
}
