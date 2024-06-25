package ru.frolov.viewmodule.entity.forGlasses;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Glens {
    @Id
    private Long id;

    private String firm;
    private String model;
    private String material;
    private String type;

    private BigDecimal purchasePrice;
    private BigDecimal salePrice;
}
