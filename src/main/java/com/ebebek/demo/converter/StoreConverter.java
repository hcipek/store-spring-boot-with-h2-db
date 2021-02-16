package com.ebebek.demo.converter;

import com.ebebek.demo.model.dto.StoreDto;
import com.ebebek.demo.model.entity.Store;
import com.ebebek.demo.model.request.StoreRequest;

import java.util.ArrayList;
import java.util.List;

public class StoreConverter extends BaseConverter<Store, StoreRequest> {

    @Override
    public List<Store> convert(StoreRequest request) {
        List<Store> storeList = new ArrayList<>();
        request.getRequestList().forEach(e -> storeList.add(convertToEntity(e)));
        return storeList;
    }

    private Store convertToEntity(StoreDto dto) {
        Store store = new Store();
        store.setName(dto.getName());
        return store;
    }
}
