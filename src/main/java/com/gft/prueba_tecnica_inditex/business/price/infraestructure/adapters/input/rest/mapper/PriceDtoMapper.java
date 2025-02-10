package com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.input.rest.mapper;

import com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.input.rest.mapper.BrandDtoMapper;
import com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.input.rest.model.response.PriceOutputDto;
import com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.input.rest.mapper.PriceListDtoMapper;
import com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.input.rest.mapper.ProductDtoMapper;
import com.gft.prueba_tecnica_inditex.business.price.domain.model.Price;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        ProductDtoMapper.class, BrandDtoMapper.class, PriceListDtoMapper.class
})
public interface PriceDtoMapper {
    PriceOutputDto toOutputDto(Price price);
}
