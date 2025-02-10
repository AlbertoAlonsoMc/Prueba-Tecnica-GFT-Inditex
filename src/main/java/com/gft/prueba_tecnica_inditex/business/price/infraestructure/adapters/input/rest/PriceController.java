package com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.input.rest;

import com.gft.prueba_tecnica_inditex.business.price.application.ports.input.PriceServicePort;
import com.gft.prueba_tecnica_inditex.business.price.domain.model.Price;
import com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.input.rest.mapper.PriceDtoMapper;
import com.gft.prueba_tecnica_inditex.business.price.infraestructure.adapters.input.rest.model.response.PriceOutputDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/prices")
@RequiredArgsConstructor
public class PriceController {

    private final PriceServicePort priceService;
    private final PriceDtoMapper priceDtoMapper;

    @Operation(
            summary = "Get the price for a specific brand, product, and date",
            description = "Returns the price associated with the given brand, product, and date if available.",
            tags = {"Price Operations"}
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Price found and returned successfully"),
            @ApiResponse(responseCode = "404", description = "Price not found for the given brand, product, and date")
    })
    @GetMapping("/getByBrandProductAndDate")
    public ResponseEntity<PriceOutputDto> getPriceByBrandProductAndDate(
            @RequestParam Long brandId,
            @RequestParam Long productId,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
            @Schema(example = "2020-06-14T15:00:00", description = "Fecha y hora en formato yyyy-MM-dd'T'HH:mm:ss") LocalDateTime dateTime) {
        Price price = priceService.getPriceByBrandProductAndDate(brandId, productId, dateTime);
        return ResponseEntity.ok(priceDtoMapper.toOutputDto(price));
    }
}

