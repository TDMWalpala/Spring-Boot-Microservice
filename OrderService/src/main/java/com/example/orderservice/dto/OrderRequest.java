package com.example.orderservice.dto;

import com.example.orderservice.model.OrderLineItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderRequest {
    private List<OrderLineItemDTO> orderLineItemDTOList;
}
