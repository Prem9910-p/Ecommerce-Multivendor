package com.prem.Ecommerce.Multivendor.Modal;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JsonIgnore
    private Order order;

    @ManyToOne
    private Product product;

    private String size;
    private int quantity;
    private Integer mrpPrice;
    private Integer sellingPrice;
    private long userid;
}
