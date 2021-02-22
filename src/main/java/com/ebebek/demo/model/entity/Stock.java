package com.ebebek.demo.model.entity;

import com.ebebek.demo.model.base.BaseModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Table(name="stock")
public class Stock extends BaseModel {

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy="stock")
    private List<Product> productList;
}
