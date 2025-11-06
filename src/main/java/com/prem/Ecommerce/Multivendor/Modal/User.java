package com.prem.Ecommerce.Multivendor.Modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.prem.Ecommerce.Multivendor.Domain.User_Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String email;
    private String fullName;
    private String mobile;
    private User_Role role=User_Role.ROLE_CUSTOMER;
    private Set<Address> addresses=new HashSet<>();
    private Set<Coupom> usedCoupons=new HashSet<>();
}
