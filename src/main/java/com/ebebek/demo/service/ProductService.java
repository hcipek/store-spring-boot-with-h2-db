package com.ebebek.demo.service;

import com.ebebek.demo.converter.StoreConverter;
import com.ebebek.demo.model.entity.Product;
import com.ebebek.demo.model.response.ProductResponse;
import com.ebebek.demo.repo.ProductRepository;
import com.ebebek.demo.util.ResponseCodesUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService extends BaseService<Product, ProductRepository, StoreConverter>{

    public ProductResponse getAll() {
        List<Product> productList = repo.findAll();
        return new ProductResponse(productList, ResponseCodesUtil.SUCCESS.message, ResponseCodesUtil.SUCCESS.code);
    }
}
