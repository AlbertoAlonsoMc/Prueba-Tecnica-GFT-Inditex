package com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.output.persistence.mapper;

import com.gft.prueba_tecnica_inditex.business.product.domain.model.Product;
import com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.output.persistence.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {
    Product toProduct(ProductEntity productEntity);
    ProductEntity toProductEntity(Product product);
}