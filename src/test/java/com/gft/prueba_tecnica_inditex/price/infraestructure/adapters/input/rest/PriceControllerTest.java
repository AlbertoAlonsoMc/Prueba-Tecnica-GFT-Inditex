package com.gft.prueba_tecnica_inditex.price.infraestructure.adapters.input.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PriceControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private void performPriceRequest(String brandId, String productId, String dateTime, double expectedPrice) throws Exception {
        mockMvc.perform(get("/prices/getByBrandProductAndDate")
                        .param("brandId", brandId)
                        .param("productId", productId)
                        .param("dateTime", dateTime)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price").value(expectedPrice));
    }

    @Test
    public void testGetPrice_06_14_10AM() throws Exception {
        performPriceRequest("1", "35455", "2020-06-14T10:00:00", 35.50);
    }

    @Test
    public void testGetPrice_06_14_04PM() throws Exception {
        performPriceRequest("1", "35455", "2020-06-14T16:00:00", 25.45);
    }

    @Test
    public void testGetPrice_06_14_09PM() throws Exception {
        performPriceRequest("1", "35455", "2020-06-14T21:00:00", 35.50);
    }

    @Test
    public void testGetPrice_06_15_10AM() throws Exception {
        performPriceRequest("1", "35455", "2020-06-15T10:00:00", 30.50);
    }

    @Test
    public void testGetPrice_06_16_09PM() throws Exception {
        performPriceRequest("1", "35455", "2020-06-16T21:00:00", 38.95);
    }
}