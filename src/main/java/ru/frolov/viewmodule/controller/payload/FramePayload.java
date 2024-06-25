package ru.frolov.viewmodule.controller.payload;

import java.math.BigDecimal;

public record FramePayload(Long id,
                           String firm,
                           String model,
                           String material,
                           String typeOfFixation,
                           BigDecimal purchasePrice,
                           BigDecimal salePrice) {
}
