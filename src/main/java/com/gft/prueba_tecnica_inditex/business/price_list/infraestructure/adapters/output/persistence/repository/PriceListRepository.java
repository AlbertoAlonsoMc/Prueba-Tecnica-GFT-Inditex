package com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.output.persistence.repository;

import com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.output.persistence.entity.PriceListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceListRepository extends JpaRepository<PriceListEntity, Long> {
}
