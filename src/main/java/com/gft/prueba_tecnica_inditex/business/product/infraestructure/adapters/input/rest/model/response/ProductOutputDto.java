package com.gft.prueba_tecnica_inditex.business.product.infraestructure.adapters.input.rest.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductOutputDto {
    private Long id;
    private String name;
}
