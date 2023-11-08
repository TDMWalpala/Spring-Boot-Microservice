package com.example.orderservice.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderLineItemDTO {
    private Long id;
    private String skvCode;
    private BigDecimal price;
    private Integer quantity;
}
