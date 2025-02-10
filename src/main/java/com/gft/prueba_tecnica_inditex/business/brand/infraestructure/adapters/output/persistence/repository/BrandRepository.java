package com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.output.persistence.repository;

import com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.output.persistence.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity, Long> {
}
