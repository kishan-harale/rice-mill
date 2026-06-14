package com.rice_mill_management.rice_mill.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "govt_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GovernmentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

        private String orderNumber;
        private LocalDate orderDate;
        private String riceType;
        private Double totalQuantityKg;
        private Double deliveredQuantityKg;
        private Double pendingQuantityKg;
        private LocalDate deadlineDate;
        private String status;
        private String notes;



}
