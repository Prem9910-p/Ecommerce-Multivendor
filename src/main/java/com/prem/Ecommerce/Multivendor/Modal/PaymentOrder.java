package com.prem.Ecommerce.Multivendor.Modal;


import com.prem.Ecommerce.Multivendor.Domain.PaymentMethod;
import com.prem.Ecommerce.Multivendor.Domain.PaymentOrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PaymentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Long amount;

    private PaymentOrderStatus status=PaymentOrderStatus.PENDING;

    private PaymentMethod paymentMethod;
    private String paymentLinkId;

    @ManyToOne
    private User user;

    @OneToMany
    private Set<Order> orders=new HashSet<>();

}
