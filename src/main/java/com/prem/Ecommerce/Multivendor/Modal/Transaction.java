package com.prem.Ecommerce.Multivendor.Modal;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User customer;

    @OneToOne
    private Order order;
    @ManyToOne
    private Seller seller;

    private LocalDateTime date=LocalDateTime.now();
}
