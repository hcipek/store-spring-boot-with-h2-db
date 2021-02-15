package com.ebebek.demo.service;

import com.ebebek.demo.converter.StoreConverter;
import com.ebebek.demo.model.entity.Store;
import com.ebebek.demo.model.request.StoreRequest;
import com.ebebek.demo.model.response.StoreResponse;
import com.ebebek.demo.repo.StoreRepository;
import org.springframework.stereotype.Service;

@Service
public class StoreService extends BaseService<Store, StoreRepository, StoreConverter> {

    public StoreResponse create(StoreRequest request) {
        Store store = converter.convert(request);
        repo.save(store);
        return new StoreResponse();
    }
}
