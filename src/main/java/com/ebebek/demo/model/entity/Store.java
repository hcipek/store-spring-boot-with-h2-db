package com.ebebek.demo.model.entity;

import com.ebebek.demo.model.base.BaseModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name="store")
public class Store extends BaseModel {

    private String location;
    @OneToOne
    private Stock stock;

}
