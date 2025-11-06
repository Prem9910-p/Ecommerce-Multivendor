package com.prem.Ecommerce.Multivendor.Modal;

import com.prem.Ecommerce.Multivendor.Domain.OrderStatus;
import com.prem.Ecommerce.Multivendor.Domain.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String orderId;

    @ManyToOne
    private User user;

    private long sellerId;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems=new ArrayList<>();

    @ManyToOne
    private Address shippingAddress;

    @Embedded
    private PaymentDetails paymentDetails;

    private double totalMrpPrice;

    private Integer discount;

    private OrderStatus orderStatus;
    private int totalItem;
    private PaymentStatus paymentStatus=PaymentStatus.PENDING;
    private LocalDateTime orderDate=LocalDateTime.now();
    private LocalDateTime deliverDate=orderDate.plusDays(7);
}
