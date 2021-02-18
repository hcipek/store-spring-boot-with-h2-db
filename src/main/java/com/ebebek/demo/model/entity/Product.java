package com.ebebek.demo.model.entity;

import com.ebebek.demo.model.base.BaseModel;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name="product")
public class Product extends BaseModel {
    
    private String size;
    private BigDecimal weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_id")
    private Stock stock;

}
