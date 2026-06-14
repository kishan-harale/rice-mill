package com.rice_mill_management.rice_mill.controllers;

import com.rice_mill_management.rice_mill.entity.GovernmentOrder;
import com.rice_mill_management.rice_mill.service.GovernmentOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/govt-orders")
@RequiredArgsConstructor
@CrossOrigin("*")
public class GovernmentOrderController {

    private final GovernmentOrderService governmentOrderService;

    @PostMapping
    public GovernmentOrder governmentOrder(@RequestBody GovernmentOrder order){
        return governmentOrderService.createOrder(order);
    }


    @GetMapping
    public List<GovernmentOrder> governmentOrder(){
        return governmentOrderService.getAllOrders();
    }



}
