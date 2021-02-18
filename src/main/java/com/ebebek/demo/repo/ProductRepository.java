package com.ebebek.demo.repo;

import com.ebebek.demo.model.entity.Product;
import com.ebebek.demo.model.entity.Store;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long>{
}
