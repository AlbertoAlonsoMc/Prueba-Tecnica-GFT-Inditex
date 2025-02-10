package com.gft.prueba_tecnica_inditex.business.price.application.ports.output;

import com.gft.prueba_tecnica_inditex.business.price.domain.model.Price;

import java.util.List;

public interface PricePersistencePort {
    List<Price> findByBrandAndProduct(Long brandId, Long productId);
}
