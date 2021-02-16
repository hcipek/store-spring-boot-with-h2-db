package com.ebebek.demo.model.entity;

import com.ebebek.demo.model.base.BaseModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="store")
public class Store extends BaseModel {
}
