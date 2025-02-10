package com.gft.prueba_tecnica_inditex.business.price.application.ports.input;

import com.gft.prueba_tecnica_inditex.business.price.domain.model.Price;

import java.time.LocalDateTime;

public interface PriceServicePort {
    Price getPriceByBrandProductAndDate(Long brandId, Long productId, LocalDateTime dateTime);
}
