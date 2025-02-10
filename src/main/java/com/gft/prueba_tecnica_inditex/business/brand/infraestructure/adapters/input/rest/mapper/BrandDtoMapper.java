package com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.input.rest.mapper;

import com.gft.prueba_tecnica_inditex.business.brand.domain.model.Brand;
import com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.input.rest.model.response.BrandOutputDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BrandDtoMapper {
    BrandOutputDto toOutputDto(Brand brand);
}
