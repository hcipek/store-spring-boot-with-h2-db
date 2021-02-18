package com.ebebek.demo.model.entity;

import com.ebebek.demo.model.base.BaseModel;
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

}
