package com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.output.persistence.mapper;

import com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.output.persistence.mapper.BrandEntityMapper;
import com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.output.persistence.mapper.PriceListEntityMapper;
import com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.output.persistence.mapper.ProductEntityMapper;
import com.gft.prueba_tecnica_inditex.business.price.domain.model.Price;
import com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.output.persistence.entity.PriceEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {
        BrandEntityMapper.class, ProductEntityMapper.class, PriceListEntityMapper.class})
public interface PriceEntityMapper {
    Price toPrice(PriceEntity priceEntity);
    List<Price> toPriceList(List<PriceEntity> priceEntityList);
    PriceEntity toPriceEntity(Price price);
    List<PriceEntity> toPriceEntityList(List<Price> priceList);
}
