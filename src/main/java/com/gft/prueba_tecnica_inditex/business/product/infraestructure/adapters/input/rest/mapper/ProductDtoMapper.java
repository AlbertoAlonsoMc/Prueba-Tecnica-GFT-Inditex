package com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.input.rest.mapper;

import com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.input.rest.model.response.ProductOutputDto;
import com.gft.prueba_tecnica_inditex.business.product.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper {
    ProductOutputDto toOutputDto(Product product);
}
