package com.prem.Ecommerce.Multivendor.Modal;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class VerificationCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String otp;
    private String email;

    @OneToOne
    private User user;

    @OneToOne
    private Seller seller;
}
