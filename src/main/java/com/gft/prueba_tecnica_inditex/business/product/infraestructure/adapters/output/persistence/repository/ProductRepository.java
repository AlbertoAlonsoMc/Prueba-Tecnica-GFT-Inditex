package com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.output.persistence.repository;

import com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.output.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
