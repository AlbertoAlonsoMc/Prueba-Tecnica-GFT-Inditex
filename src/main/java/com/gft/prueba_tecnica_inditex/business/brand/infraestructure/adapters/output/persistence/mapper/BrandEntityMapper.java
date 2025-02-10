package com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.output.persistence.mapper;

import com.gft.prueba_tecnica_inditex.business.brand.domain.model.Brand;
import com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.output.persistence.entity.BrandEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BrandEntityMapper {
    Brand toBrand(BrandEntity brandEntity);
    BrandEntity toBrandEntity(Brand brand);
}
