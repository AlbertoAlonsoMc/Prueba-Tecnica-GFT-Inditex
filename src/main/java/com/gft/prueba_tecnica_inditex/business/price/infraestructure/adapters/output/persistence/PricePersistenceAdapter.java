package com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.output.persistence;

import com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.output.persistence.mapper.PriceEntityMapper;
import com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.output.persistence.repository.PriceRepository;
import com.gft.prueba_tecnica_inditex.business.price.application.ports.output.PricePersistencePort;
import com.gft.prueba_tecnica_inditex.business.price.domain.model.Price;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PricePersistenceAdapter implements PricePersistencePort {

    private final PriceRepository priceRepository;
    private final PriceEntityMapper priceEntityMapper;

    @Override
    public List<Price> findByBrandAndProduct(Long brandId, Long productId) {
        return priceEntityMapper.toPriceList(priceRepository.findByBrandIdAndProductId(brandId, productId));
    }
}
