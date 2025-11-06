package com.prem.Ecommerce.Multivendor.Modal;


import com.prem.Ecommerce.Multivendor.Domain.PaymentStatus;
import lombok.Data;

@Data
public class PaymentDetails {
    private String paymentId;
    private String razorpayPaymentLinkId;
    private String razorpayPaymentLinkReferenceId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentIdZWSP;
    private PaymentStatus status;


}
