package com.gft.prueba_tecnica_inditex.business.price_list.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PriceList {
    private Long id;
    private BigDecimal discountPercentage;
}
