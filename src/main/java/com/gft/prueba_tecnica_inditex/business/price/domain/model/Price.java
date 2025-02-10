package com.gft.prueba_tecnica_inditex.business.price.domain.model;

import com.gft.prueba_tecnica_inditex.business.brand.domain.model.Brand;
import com.gft.prueba_tecnica_inditex.business.price_list.domain.model.PriceList;
import com.gft.prueba_tecnica_inditex.business.product.domain.model.Product;
import com.gft.prueba_tecnica_inditex.shared.enums.CurrencyEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Price {
    private Long id;
    private Brand brand;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private PriceList priceList;
    private Product product;
    private Integer priority;
    private BigDecimal price;
    private CurrencyEnum currency;
}
