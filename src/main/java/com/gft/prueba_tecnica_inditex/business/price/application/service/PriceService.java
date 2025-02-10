package com.gft.prueba_tecnica_inditex.business.price.application.service;

import com.gft.prueba_tecnica_inditex.business.price.application.ports.output.PricePersistencePort;
import com.gft.prueba_tecnica_inditex.business.price.domain.exception.PriceNotFoundException;
import com.gft.prueba_tecnica_inditex.business.price.application.ports.input.PriceServicePort;
import com.gft.prueba_tecnica_inditex.business.price.domain.model.Price;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;

@Service
@RequiredArgsConstructor
public class PriceService implements PriceServicePort {

    private final PricePersistencePort priceRepository;
    @Override
    public Price getPriceByBrandProductAndDate(Long brandId, Long productId, LocalDateTime dateTime) {
        return priceRepository.findByBrandAndProduct(brandId, productId)
                .stream()
                .filter(price -> dateTime.isAfter(price.getStartDate()) && dateTime.isBefore(price.getEndDate()))
                .max(Comparator.comparingInt(Price::getPriority))
                .orElseThrow(PriceNotFoundException::new);
    }
}
