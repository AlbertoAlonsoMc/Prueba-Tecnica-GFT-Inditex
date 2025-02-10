package com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.input.rest.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PriceListOutputDto {
    private Long id;
    private BigDecimal discountPercentage;
}
