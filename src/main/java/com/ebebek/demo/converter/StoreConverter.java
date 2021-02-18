package com.ebebek.demo.converter;

import com.ebebek.demo.model.dto.StoreDto;
import com.ebebek.demo.model.entity.Product;
import com.ebebek.demo.model.entity.Stock;
import com.ebebek.demo.model.entity.Store;
import com.ebebek.demo.model.request.CityRequest;
import com.ebebek.demo.model.request.StoreRequest;
import com.ebebek.demo.repo.ProductRepository;
import com.ebebek.demo.repo.StockRepository;
import com.ebebek.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StoreConverter extends BaseConverter<Store, StoreRequest> {

    private final List<String> sizeList = Arrays.asList("SMALL", "MEDIUM", "LARGE");

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CityService cityService;

    @Override
    public List<Store> convert(StoreRequest request) {
        List<Store> storeList = new ArrayList<>();
        request.getRequestList().forEach(e -> storeList.add(convertToEntity(e.getLocation())));
        return storeList;
    }

    public List<Store> convert(CityRequest req) {
        List<Store> storeList = new ArrayList<>();
        List<String> locationList = cityService.getAllTurkishCityRegionCombinations(req);
        locationList.forEach(e -> storeList.add(convertToEntity(e)));
        return storeList;
    }

    private Store convertToEntity(String location) {
        Store store = new Store();
        store.setName("Coffee Shop - " + location.toUpperCase() + " Şubesi");
        store.setLocation(location);
        store.setStock(createStock(store));
        return store;
    }

    private Stock createStock(Store store) {
        Stock stock = new Stock();
        stock.setName(store.getName() + " Deposu");
        stock = stockRepository.save(stock);

        createProducts(stock);

        return stock;
    }

    private void createProducts(Stock stock) {
        for(String size : sizeList) {
            Product beanProduct = new Product();
            beanProduct.setSize(size);
            beanProduct.setName(size + " SIZE COFFEE BEANS");
            beanProduct.setWeight(BigDecimal.valueOf(Math.random()).multiply(BigDecimal.valueOf(100).setScale(2, RoundingMode.CEILING)));
            beanProduct.setStock(stock);
            productRepository.save(beanProduct);
        }
    }
}
