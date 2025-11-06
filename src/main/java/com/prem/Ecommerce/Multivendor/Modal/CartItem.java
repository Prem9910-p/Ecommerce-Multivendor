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
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JsonIgnore
    private Cart cart;

    @ManyToOne
    private Product product;
    private String size;
    private int quantity=1;
    private Integer mrpPrice;
    private Integer sellingPrice;
    private Long userId;

}
