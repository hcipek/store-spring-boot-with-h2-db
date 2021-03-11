package com.ebebek.demo.controller;

import com.ebebek.demo.model.response.ProductResponse;
import com.ebebek.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public ProductResponse getAll() {
        return productService.getAll();
    }
}
