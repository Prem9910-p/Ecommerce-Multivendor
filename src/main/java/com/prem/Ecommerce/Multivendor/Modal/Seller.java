package com.prem.Ecommerce.Multivendor.Modal;

import com.prem.Ecommerce.Multivendor.Domain.AccountStatus;
import com.prem.Ecommerce.Multivendor.Domain.User_Role;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String sellerName;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Embedded
    private BusinessDetails businessDetails = new BusinessDetails();

    @Embedded
    private BankDetails bankDetails = new BankDetails();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pickup_address_id")
    private Address pickupAddress;     // ✅ FIXED

    private User_Role role = User_Role.ROLE_SELLER;

    private AccountStatus accountStatus = AccountStatus.PENDING_VERIFICATION;
}
