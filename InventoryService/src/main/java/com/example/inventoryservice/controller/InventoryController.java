package com.example.inventoryservice.controller;

import com.example.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {

    private final  InventoryService inventoryService;

    @GetMapping("/{skv-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("skv-code") String skvCode){
        return inventoryService.isInStock(skvCode);
    }
}
