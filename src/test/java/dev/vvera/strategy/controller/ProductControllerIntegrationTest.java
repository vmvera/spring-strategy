package dev.vvera.strategy.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getCreditCard() throws Exception {
        mockMvc.perform(get("/producto/{productType}/{key}", "CreditCard", "1")
                .contentType("application/json"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.key", is("1")))
                .andExpect(jsonPath("$.number", is("11112222XXXX")))
                .andExpect(jsonPath("$.cardHolderName", is("User Name")))
                .andExpect(jsonPath("$.issuer", is("VISA")));
    }

    @Test
    void getAccount() throws Exception {
        mockMvc.perform(get("/producto/{productType}/{key}", "Account", "1")
                .contentType("application/json"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.key", is("2")))
                .andExpect(jsonPath("$.number", is("112233")))
                .andExpect(jsonPath("$.bank", is("Bank 1")))
                .andExpect(jsonPath("$.owner", is("Owner")));
    }


}