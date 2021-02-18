package com.ebebek.demo.repo;

import com.ebebek.demo.model.entity.Stock;
import com.ebebek.demo.model.entity.Store;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends BaseRepository<Stock, Long>{
}
