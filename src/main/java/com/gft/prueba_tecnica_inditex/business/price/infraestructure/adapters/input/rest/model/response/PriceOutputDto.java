package com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.input.rest.model.response;

import com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.input.rest.model.response.BrandOutputDto;
import com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.input.rest.model.response.PriceListOutputDto;
import com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.input.rest.model.response.ProductOutputDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PriceOutputDto {
    private ProductOutputDto product;
    private BrandOutputDto brand;
    private PriceListOutputDto priceList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal price;
}
