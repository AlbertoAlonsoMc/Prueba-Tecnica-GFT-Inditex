package com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.input.rest.mapper;

import com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.input.rest.model.response.PriceListOutputDto;
import com.gft.prueba_tecnica_inditex.business.price_list.domain.model.PriceList;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceListDtoMapper {
    PriceListOutputDto toOutputDto(PriceList priceList);
}
