package com.ebebek.demo.service;

import com.ebebek.demo.converter.StoreConverter;
import com.ebebek.demo.model.entity.Store;
import com.ebebek.demo.model.request.CityRequest;
import com.ebebek.demo.model.request.StoreRequest;
import com.ebebek.demo.model.response.StoreResponse;
import com.ebebek.demo.repo.StoreRepository;
import com.ebebek.demo.util.ResponseCodesUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService extends BaseService<Store, StoreRepository, StoreConverter> {

    public StoreResponse create(StoreRequest request) {
        List<Store> storeList = converter.convert(request);
        storeList = repo.saveAll(storeList);
        return new StoreResponse(storeList, ResponseCodesUtil.SUCCESS.message, ResponseCodesUtil.SUCCESS.code);
    }

    public StoreResponse createGenerate(CityRequest req) {
        if(repo.count() > 0)
            return new StoreResponse(new ArrayList<>(), ResponseCodesUtil.FAILED.message, ResponseCodesUtil.FAILED.code);

        List<Store> storeList = converter.convert(req);
        storeList = repo.saveAll(storeList);
        return new StoreResponse(storeList, ResponseCodesUtil.SUCCESS.message, ResponseCodesUtil.SUCCESS.code);
    }

    public StoreResponse findAllWithBody() {
        return new StoreResponse(findAll(), ResponseCodesUtil.SUCCESS.message, ResponseCodesUtil.SUCCESS.code);
    }
}
