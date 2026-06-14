package com.rice_mill_management.rice_mill.service;

import com.rice_mill_management.rice_mill.entity.GovernmentOrder;
import com.rice_mill_management.rice_mill.repository.GovernmentOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GovernmentOrderService {
    private final GovernmentOrderRepository governmentOrderRepository;

    public GovernmentOrder createOrder(GovernmentOrder order){
        order.setDeliveredQuantityKg(0.0);
        order.setPendingQuantityKg(order.getTotalQuantityKg());
        order.setStatus("PENDING");
        return governmentOrderRepository.save(order);
    }

    public List<GovernmentOrder> getAllOrders(){
        return governmentOrderRepository.findAll();
    }
}
