package com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.output.persistence.mapper;

import com.gft.prueba_tecnica_inditex.business.price_list.domain.model.PriceList;
import com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.output.persistence.entity.PriceListEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceListEntityMapper {
    PriceList toPriceList(PriceListEntity priceListEntity);
    PriceListEntity toPriceListEntity(PriceList priceList);
}
