package com.prem.Ecommerce.Multivendor.Modal;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @NotNull
    @Column(unique = true)
    private String categoryId;

    @ManyToOne
    private Category perentCategory;

    @NotNull
    private Integer level;

}
