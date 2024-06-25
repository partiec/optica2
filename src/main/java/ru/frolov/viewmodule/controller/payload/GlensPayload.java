package ru.frolov.viewmodule.controller.payload;

import java.math.BigDecimal;

public record GlensPayload(Long id,
                           String firm,
                           String model,
                           String material,
                           String type,
                           BigDecimal purchasePrice,
                           BigDecimal salePrice) {

}
