package com.ebebek.demo.service;

import com.ebebek.demo.converter.StoreConverter;
import com.ebebek.demo.model.entity.Store;
import com.ebebek.demo.model.request.StoreRequest;
import com.ebebek.demo.model.response.StoreResponse;
import com.ebebek.demo.repo.StoreRepository;
import com.ebebek.demo.util.ResponseCodesUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService extends BaseService<Store, StoreRepository, StoreConverter> {

    public StoreResponse create(StoreRequest request) {
        List<Store> storeList = converter.convert(request);
        storeList.forEach(e -> repo.save(e));
        return new StoreResponse(storeList, ResponseCodesUtil.SUCCESS.message, ResponseCodesUtil.SUCCESS.code);
    }
}
