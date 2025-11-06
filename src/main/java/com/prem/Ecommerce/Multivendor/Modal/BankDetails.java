package com.prem.Ecommerce.Multivendor.Modal;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Data
public class BankDetails {

    private String accountNumber;
    private String accountHolderName;
    private String ifscCode;



}
