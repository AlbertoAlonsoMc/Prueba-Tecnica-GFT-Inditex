package com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.output.persistence.entity;


import com.gft.prueba_tecnica_inditex.business.brand.infraestructure.adapters.output.persistence.entity.BrandEntity;
import com.gft.prueba_tecnica_inditex.business.price_list.infraestructure.adapters.output.persistence.entity.PriceListEntity;
import com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.output.persistence.entity.ProductEntity;
import com.gft.prueba_tecnica_inditex.shared.enums.CurrencyEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "prices")
public class PriceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", nullable = false)
    private BrandEntity brand;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "price_list", nullable = false)
    private PriceListEntity priceList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private ProductEntity product;

    @Column(name = "priority", nullable = false)
    private Integer priority;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency", nullable = false)
    private CurrencyEnum currency;
}
