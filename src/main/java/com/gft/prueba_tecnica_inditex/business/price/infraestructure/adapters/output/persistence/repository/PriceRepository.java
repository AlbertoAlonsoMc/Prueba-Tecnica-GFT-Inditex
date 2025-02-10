package com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.output.persistence.repository;

import com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.output.persistence.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {
    List<PriceEntity> findByBrandIdAndProductId(Long brandId, Long productId);
}
